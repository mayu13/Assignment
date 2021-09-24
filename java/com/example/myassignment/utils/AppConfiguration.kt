

package com.example.myassignment.utils

import java.util.*

class  AppConfiguration {

    /*
    true -> For run application without network call
    false -> For run application with network call
     */
    var useLocalWebServices = false

    /*
    baseURL -> This base url required when application calling produlction/stub webservices
     */
    var baseURL = "https://android-interview.s3.eu-west-2.amazonaws.com/"


    companion object {

        //static reference for singleton
        private var _instance: AppConfiguration = AppConfiguration()

        //returning the reference
        @Synchronized
        fun defaultConfig(): AppConfiguration {
            return _instance
        }
    }
}