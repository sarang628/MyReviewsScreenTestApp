package com.example.myreviewsscreentestapp.di

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.example.torang_core.navigation.LoginNavigation
import com.example.torang_core.navigation.WriteReviewNavigation
import com.example.torang_core.util.Logger
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

@Module
@InstallIn(ActivityComponent::class)
abstract class FindRestaurantModule {
    @Binds
    abstract fun provideWriteReviewNavigation(testWriteReviewNavigation: TestWriteReviewNavigation): WriteReviewNavigation

    @Binds
    abstract fun provideLoginNavigation(testLoginNavigation: TestLoginNavigation): LoginNavigation
}

// 테스트 리뷰 작성 이동 내비게이션
class TestWriteReviewNavigation @Inject constructor() : WriteReviewNavigation {
    override fun go(context: Context, reviewId: Int) {
        Logger.d("")
    }
}

class TestLoginNavigation @Inject constructor() : LoginNavigation {

    override fun goLogin(fragmentManager: FragmentManager?) {

    }

    override fun goLogin(context: Context) {

    }
}