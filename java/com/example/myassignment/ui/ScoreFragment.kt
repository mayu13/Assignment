package com.example.myassignment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myassignment.R
import com.example.myassignment.base.BaseCoroutineFragment
import com.example.myassignment.network.CardScoreNetworkDataSource
import com.example.myassignment.rest.model.ScoreMainDao
import com.example.myassignment.rest.network.ApiService
import com.example.myassignment.rest.repository.CardScoreRepository
import kotlinx.android.synthetic.main.fragment_score.*

class ScoreFragment : BaseCoroutineFragment<ScoreViewModel>() {

    override lateinit var viewModel: ScoreViewModel

    private val scoreRepository by lazy {
        val dataSource = CardScoreNetworkDataSource(context!!, ApiService())
        CardScoreRepository(dataSource)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_score, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        setupViewModel()
    }

    /*...Set up UI with view model...*/

    private fun setupViewModel() {
        viewModel = ViewModelProvider(
            requireActivity(),
            ScoreViewModelFactory(requireContext(), scoreRepository)
        ).get(ScoreViewModel::class.java)

        viewModel.fetchCardScore()

        viewModel.scoreListData.observe(viewLifecycleOwner, Observer<ScoreMainDao> {
            println("DATA " + it.toString())
            println("********** FIRST CALLED ")

            scoreProgressView.max = it.creditReportInfo.maxScoreValue
            scoreProgressView.setProgress(it.creditReportInfo.score)
            scoreView.text = it.creditReportInfo.score.toString()
            outScoreview.text = "out of " + it.creditReportInfo.maxScoreValue
        })
    }
}

