

package com.example.myassignment.network

import androidx.lifecycle.LiveData
import com.example.myassignment.rest.model.ScoreMainDao
import com.example.myassignment.utils.CustomResult

interface CardScoreDataSourceInterface {
    val result : LiveData<CustomResult<ScoreMainDao>>
    suspend fun getScore()
}