package com.app.appliitunes.remote
import com.app.appliitunes.remote.response.ResponseDTO
import retrofit2.http.GET
import retrofit2.http.Query

interface  ApiClient {

    @GET("search")
    suspend fun getResponse(@Query("term") term: String): ResponseDTO
}
//Base_Url:- https://itunes.apple.com/search?term=baby