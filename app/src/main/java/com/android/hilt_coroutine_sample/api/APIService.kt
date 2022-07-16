package com.android.hilt_coroutine_sample.api

import com.android.hilt_coroutine_sample.model.AlbumResponseModel
import retrofit2.http.GET

interface APIService {
    @GET
    suspend fun getAlbumList(): List<AlbumResponseModel>
}