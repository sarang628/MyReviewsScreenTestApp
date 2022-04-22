package com.example.myreviewsscreentestapp

import com.example.torang_core.data.model.UserData
import org.junit.Test

class UserDataTest {
    @Test
    fun userTest() {
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
        System.out.println(userData.toString())
    }
}