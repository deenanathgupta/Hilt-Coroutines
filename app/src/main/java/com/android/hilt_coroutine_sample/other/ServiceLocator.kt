package com.android.hilt_coroutine_sample.other

import android.content.Context
import androidx.fragment.app.FragmentActivity
import com.android.hilt_coroutine_sample.navigator.AppNavigator
import com.android.hilt_coroutine_sample.navigator.AppNavigatorImpl

class ServiceLocator(applicationContext: Context?) {
    fun provideNavigator(activity: FragmentActivity): AppNavigator {
        return AppNavigatorImpl(activity)
    }
}
