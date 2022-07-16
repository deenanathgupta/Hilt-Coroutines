package com.android.hilt_coroutine_sample.repository

import com.android.hilt_coroutine_sample.api.AlbumRemoteDataSource
import javax.inject.Inject

class AlbumRepository @Inject constructor(private val albumRemoteDataSource: AlbumRemoteDataSource) {

    suspend fun getAlbumList() = albumRemoteDataSource.getAlbumList()


    companion object {

        private const val ZEROTH_POSITION = 0
        private var INSTANCE: AlbumRepository? = null

        /**
         * Returns the single instance of this class, creating it if necessary.
         *
         * * @param productsRemoteDataSource the backend data source
         *
         * *
         * @return the [AlbumRepository] instance
         */
        @JvmStatic
        fun getInstance(albumDataSource: AlbumRemoteDataSource) =
            INSTANCE ?: synchronized(AlbumRepository::class.java) {
                INSTANCE ?: AlbumRepository(albumDataSource).also {
                    INSTANCE = it
                }
            }

        /**
         * Used to force [getInstance] to create a new instance
         * next time it's called.
         */
        @JvmStatic
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}