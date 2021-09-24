

package com.example.myassignment.rest.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myassignment.network.BaseRepository
import com.example.myassignment.network.CardScoreDataSourceInterface
import com.example.myassignment.network.RestAPIErrors
import com.example.myassignment.rest.model.ScoreMainDao
import com.example.myassignment.utils.CustomError
import com.example.myassignment.utils.CustomResult
import com.example.myassignment.utils.CustomResultStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

interface CardScoreRepositoryInterface {
    suspend fun getScore(): LiveData<out ScoreMainDao>

    // Defaults
    val isLoading: LiveData<Boolean>
    val displayError: MutableLiveData<CustomError>

    val isLoadingInitial: LiveData<Boolean>
    val isLoadingMore: LiveData<Boolean>
}

class CardScoreRepository(private val scoreDataSource: CardScoreDataSourceInterface? = null) : CardScoreRepositoryInterface, BaseRepository() {

    private val _isLoadingInitial = MutableLiveData<Boolean>()

    override var isLoadingInitial: LiveData<Boolean> = _isLoadingInitial

    private val _isLoadingMore = MutableLiveData<Boolean>()
    override var isLoadingMore: LiveData<Boolean> = _isLoadingMore

    // Dao
    var currentPage: Int = 1
    // Dao
    private val currentDao : MutableLiveData<ScoreMainDao> = MutableLiveData()

    var hasMorePages: Boolean = true

    init {
        scoreDataSource?.apply {
            if (!result.hasObservers()) {
                result.observeForever { newData ->
                    handleResult(newData)
                }
            }
        }
    }

    private fun handleResult(newData: CustomResult<ScoreMainDao>) {
        GlobalScope.launch(Dispatchers.IO) {

            if (newData.status == CustomResultStatus.ERROR) {
                displayError.postValue(RestAPIErrors.GlobalConnectionError.coopError)
            } else {
                newData.data?.let {
//                    println("Final Response : "+it.size)
                    currentDao.postValue(it)
                    hasMorePages = true
                }
            }

            if (isLoadingInitial.value == true) {
                _isLoadingInitial.postValue(false)
            }
            if (isLoadingMore.value == true) {
                _isLoadingMore.postValue(false)
            }
        }
    }

    private suspend fun initScoreData() {
        fetchScore()
    }

    private suspend fun fetchScore() {
        _isLoadingMore.postValue(true)
        scoreDataSource?.getScore()
    }

    override suspend fun getScore(): LiveData<out ScoreMainDao> {
        initScoreData()
        return withContext(Dispatchers.IO) {
            return@withContext currentDao
        }
    }

}

