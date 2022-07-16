package com.android.hilt_coroutine_sample.di

import com.android.hilt_coroutine_sample.api.AlbumRemoteDataSource
import com.android.hilt_coroutine_sample.api.IAlbumDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAlbumRemoteDataSource(albumRemoteDataSource: AlbumRemoteDataSource) : IAlbumDataSource = albumRemoteDataSource
}