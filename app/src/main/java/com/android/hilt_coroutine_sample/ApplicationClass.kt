package com.android.hilt_coroutine_sample

import android.app.Application
import com.android.hilt_coroutine_sample.other.ServiceLocator
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ApplicationClass:Application() {
    lateinit var serviceLocator: ServiceLocator
    override fun onCreate() {
        super.onCreate()
        serviceLocator = ServiceLocator(applicationContext)
    }
}