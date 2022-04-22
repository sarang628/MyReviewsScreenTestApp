package com.example.myreviewsscreentestapp.di

import android.content.Context
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.LiveData
import com.example.torang_core.data.model.LoggedInUserData
import com.example.torang_core.data.model.User
import com.example.torang_core.navigation.LoginNavigation
import com.example.torang_core.navigation.WriteReviewNavigation
import com.example.torang_core.repository.LoginRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

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

    }
}

class TestLoginNavigation @Inject constructor() : LoginNavigation {

    override fun goLogin(fragmentManager: FragmentManager?) {

    }

    override fun goLogin(context: Context) {

    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class LoginRepositoryModule {
    @Binds
    abstract fun provideLoginRepository(loginRepositoryImpl: TestLoginRepository): LoginRepository
}

@Singleton
class TestLoginRepository @Inject constructor() : LoginRepository {
    override suspend fun isLogin(): Boolean {
        return false
    }

    override suspend fun facebookLogin(token: String): User? {
        TODO("Not yet implemented")
    }

    override fun isLoginFlow(): Flow<Int> {
        return MutableStateFlow(1)
    }

    override fun getLoginUser(): LiveData<LoggedInUserData?> {
        TODO("Not yet implemented")
    }

    override suspend fun setLoggedInUser(loggedInUserData: LoggedInUserData) {
        TODO("Not yet implemented")
    }

}