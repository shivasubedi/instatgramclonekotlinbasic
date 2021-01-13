package com.instagram.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.instagram.R

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val handler = Handler()
        handler.postDelayed({
            val openHome = Intent(this@SplashScreenActivity, LoginActivity::class.java)
            startActivity(openHome)
            finish()
        }, 1000)
    }
}