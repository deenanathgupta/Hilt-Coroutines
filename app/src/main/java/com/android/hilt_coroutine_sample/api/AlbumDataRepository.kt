package com.android.hilt_coroutine_sample.api

import com.android.hilt_coroutine_sample.model.AlbumResponseModel
import javax.inject.Inject

class AlbumDataRepository @Inject constructor(private val apiService: APIService): IAlbumDataRepository {
    override suspend fun getAlbumList(): List<AlbumResponseModel> {
        return apiService.getAlbumList()
    }
}