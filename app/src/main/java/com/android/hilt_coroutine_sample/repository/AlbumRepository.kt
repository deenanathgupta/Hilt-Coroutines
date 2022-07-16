package com.android.hilt_coroutine_sample.repository

import com.android.hilt_coroutine_sample.api.IAlbumDataRepository
import javax.inject.Inject

class AlbumRepository @Inject constructor(private val iAlbumDataRepository: IAlbumDataRepository) {

    suspend fun getAlbumList() = iAlbumDataRepository.getAlbumList()
}