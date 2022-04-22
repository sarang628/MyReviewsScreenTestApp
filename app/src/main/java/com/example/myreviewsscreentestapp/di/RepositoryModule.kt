package com.example.myreviewsscreentestapp.di

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.torang_core.data.data.MyReview
import com.example.torang_core.data.data.ReviewAndImage
import com.example.torang_core.data.uistate.MyReviewItemUiState
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

    override fun getMyReviews2(restaurantId: Int): Flow<List<MyReviewItemUiState>> {
        return MutableStateFlow(ArrayList())
    }

    override suspend fun getMyReviews3(restaurantId: Int): List<MyReview> {
        return ArrayList()
    }
}