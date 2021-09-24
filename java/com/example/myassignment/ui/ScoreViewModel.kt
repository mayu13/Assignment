package com.example.myassignment.ui

import android.content.Context
import androidx.lifecycle.*
import com.example.myassignment.interfaces.FetchScoreViewModelInterface
import com.example.myassignment.interfaces.FetchDataViewModelInterface
import com.example.myassignment.rest.model.ScoreMainDao
import com.example.myassignment.rest.repository.CardScoreRepository
import com.example.myassignment.utils.CustomError
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ScoreViewModelFactory(private val context: Context, private val scoreRepository: CardScoreRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel::class.java)) {
            return ScoreViewModel(context, scoreRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

/*...*/

class ScoreViewModel(private val context: Context, private val scoreRepository: CardScoreRepository) : ViewModel(), FetchDataViewModelInterface,
    FetchScoreViewModelInterface {

    override var isLoadingInitial: LiveData<Boolean> = scoreRepository.isLoadingInitial
    override var isLoadingMore: LiveData<Boolean> = scoreRepository.isLoadingMore
    override var isLoading: LiveData<Boolean> = scoreRepository.isLoading
    override var displayError: MutableLiveData<CustomError> = scoreRepository.displayError

    private var _scoreListData: MutableLiveData<ScoreMainDao> = MutableLiveData()
    var scoreListData: MutableLiveData<ScoreMainDao> = _scoreListData

    fun fetchCardScore() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = scoreRepository.getScore()

            withContext(Dispatchers.Main) {
                if (!response.hasObservers()) {
                    response.observeForever {
                        _scoreListData.postValue(it)
                    }
                }
            }
        }
    }
}