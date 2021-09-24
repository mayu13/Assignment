package com.example.myassignment.rest.network

import com.example.myassignment.network.ApiServiceInterface
import com.example.myassignment.network.NetworkManagerMethods
import com.example.myassignment.rest.enum.ServiceEndPoint
import com.example.myassignment.rest.model.ScoreMainDao
import com.example.myassignment.utils.AppConfiguration

class ApiService : ApiServiceInterface {
    fun getScore() = execute(ScoreMainDao::class.java, AppConfiguration.defaultConfig().baseURL,ServiceEndPoint.cardScore.displayName, NetworkManagerMethods.GET, null)
}