package com.example.myreviewsscreentestapp.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    /** 로컬 데이터베이스 제공 */
    //@Singleton
    //@Provides
    //fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        //TODO::Build Variants로 변경 할 수 있게 설정하기
        //return AppDatabase.getInstance(context) // 운영
        //return TestAppDatabase.getInstance(context) // 테스트
    //}
}