package com.android.hilt_coroutine_sample.model

class AlbumResponseModel : ArrayList<AlbumResponseModelItem>()

data class AlbumResponseModelItem(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)