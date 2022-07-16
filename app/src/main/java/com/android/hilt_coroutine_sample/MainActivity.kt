package com.android.hilt_coroutine_sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.hilt_coroutine_sample.navigator.AppNavigator
import com.android.hilt_coroutine_sample.navigator.Screens
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var navigator: AppNavigator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigator = (applicationContext as ApplicationClass).serviceLocator.provideNavigator(this)

        if (savedInstanceState == null) {
            navigator.navigateTo(Screens.ALBUM)
        }
    }
}