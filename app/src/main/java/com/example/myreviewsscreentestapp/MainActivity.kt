package com.example.myreviewsscreentestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sarang.screen_myreviews.MyReviewsFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment, MyReviewsFragment().apply {
                arguments = Bundle().apply {
                    putInt("restaurantId", 4)
                }
            })
            .commit()
    }
}