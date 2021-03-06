package com.android.hilt_coroutine_sample.api

import com.android.hilt_coroutine_sample.model.AlbumResponseModel

interface IAlbumDataSource {

    suspend fun getAlbumList():List<AlbumResponseModel>
}