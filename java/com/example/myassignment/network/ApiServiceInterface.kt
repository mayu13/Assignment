
package com.example.myassignment.network

interface ApiServiceInterface {

    fun <T> execute(
        parseTo: Class<T>,
        baseUrl: String,
        endPoint: String?,
        methodType: NetworkManagerMethods = NetworkManagerMethods.GET,
        params: HashMap<String, String>? = HashMap(),
        headers: HashMap<String, String> = HashMap()): RestApiResponse<T> {

        val model = NetworkManagerModel(baseUrl, endPoint ?: "", params, headers, methodType)

        return NetworkManager<T>(model).execute(parseTo)
    }
}