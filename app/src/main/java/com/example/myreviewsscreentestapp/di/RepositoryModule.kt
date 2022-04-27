package com.example.myreviewsscreentestapp.di

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.torang_core.data.data.MyReview
import com.example.torang_core.data.data.ReviewAndImage
import com.example.torang_core.data.model.LoggedInUserData
import com.example.torang_core.data.model.User
import com.example.torang_core.repository.LoginRepository
import com.example.torang_core.repository.MyReviewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MyReviewsRepositoryProvider() {
    @Binds
    abstract fun provideMyReviewsRepository(
        // TODO::Build Variants로 변경 할 수 있게 수정하기
//        myReviewsRepositoryImpl: MyReviewsRepositoryImpl // 운영
        myReviewsRepositoryImpl: TestMyReviewsRepository // 테스트
    ): MyReviewsRepository
}

@Singleton
class TestMyReviewsRepository @Inject constructor() : MyReviewsRepository {
    override suspend fun getMyReviews(restaurantId: Int): List<ReviewAndImage> {
        return ArrayList()
    }

    override fun getMyReviews1(restaurantId: Int): LiveData<List<ReviewAndImage>> {
        return MutableLiveData(ArrayList())
    }

    override suspend fun getMyReviews3(restaurantId: Int): List<MyReview> {
        return ArrayList<MyReview>().apply {
            add(MyReview(1, "1", 3.0f, "zz", "2020"))
        }
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
        return MutableStateFlow(44)
    }

    override fun getLoginUser(): LiveData<LoggedInUserData?> {
        TODO("Not yet implemented")
    }

    override suspend fun setLoggedInUser(loggedInUserData: LoggedInUserData) {
        TODO("Not yet implemented")
    }

}