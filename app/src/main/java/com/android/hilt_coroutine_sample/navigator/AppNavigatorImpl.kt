package com.android.hilt_coroutine_sample.navigator

import androidx.fragment.app.FragmentActivity
import com.android.hilt_coroutine_sample.AlbumFragment
import com.android.hilt_coroutine_sample.MovieFragment
import com.android.hilt_coroutine_sample.R

/**
 * Navigator implementation.
 */
class AppNavigatorImpl(private val activity: FragmentActivity) : AppNavigator {

    override fun navigateTo(screen: Screens) {
        val fragment = when (screen) {
            Screens.ALBUM -> AlbumFragment()
            Screens.MOVIE -> MovieFragment()
        }

        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(fragment::class.java.canonicalName)
            .commit()
    }
}
