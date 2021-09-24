

package com.example.myassignment.network

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myassignment.rest.model.ScoreMainDao
import com.example.myassignment.rest.network.ApiService
import com.example.myassignment.utils.CustomError
import com.example.myassignment.utils.CustomResult
import java.net.SocketTimeoutException


class CardScoreNetworkDataSource(
        val context: Context,
        private val networkService: ApiService
) : CardScoreDataSourceInterface, BaseRepository() {

    private val _result = MutableLiveData<CustomResult<ScoreMainDao>>()
    override val result: LiveData<CustomResult<ScoreMainDao>>
        get() = _result

    override suspend fun getScore() {
        try {
            val downloadStatements = safeApiCall(
                call = { networkService.getScore() },
                errorMessage = "Error fetching statements")
            println("RESPONSE LIST ITEM SIZE : "+downloadStatements.toString())
            _result.postValue(downloadStatements)
        } catch (e : SocketTimeoutException){
            Log.e("Connectivity_error", "Slow Internet Connection", e)
            _result.postValue(CustomResult.error(CustomError("Internet connection Error"), null))
        } catch (e : Exception){
            Log.e("Connectivity_error", "Internet Connection Error", e)
            _result.postValue(CustomResult.error(CustomError("Internet connection Error"), null))
        }
    }
}