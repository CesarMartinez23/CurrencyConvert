package com.example.currencyconverter

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Splash_Screen : AppCompatActivity() {
    val durationSplashScreen : Long = 2000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed(Runnable {
            val next = Intent(this, MainActivity::class.java)
            startActivity(next)
        }, durationSplashScreen)
    }
}