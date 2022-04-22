package com.example.myreviewsscreentestapp

import com.example.torang_core.data.dao.UserDao
import com.example.torang_core.data.model.UserData
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class manipulateUserData {

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun init() {
        hiltRule.inject()
    }

    @Inject
    lateinit var userDao: UserDao

    @Test
    fun insertUserData() {

        val userData = UserData(
            userId = 1,
            userName = "베이글",
            email = "bagle@bagle.com",
            loginPlatform = "facebook",
            create_date = "2020-01-01",
            access_token = "12345",
            profile_pic_url = "https://",
            point = "2000",
            review_count = "10",
            following = "10",
            followers = "20"
        )

        runBlocking {
            userDao.insertUser(userData)
        }
    }
}