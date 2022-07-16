package com.android.hilt_coroutine_sample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.android.hilt_coroutine_sample.model.AlbumResponseModel
import com.android.hilt_coroutine_sample.repository.AlbumRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumViewModel @Inject constructor(private val repository: AlbumRepository) : ViewModel() {

    private var _albumList = MutableLiveData<List<AlbumResponseModel>>()
    val albumList: LiveData<List<AlbumResponseModel>>
        get() = _albumList

    fun getAlbumList() {
        viewModelScope.launch {
            _albumList.postValue(repository.getAlbumList())
        }
    }
}