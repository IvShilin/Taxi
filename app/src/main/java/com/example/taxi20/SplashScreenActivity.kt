package com.example.taxi20

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception
import java.lang.Thread.sleep

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    @SuppressLint("CustomSplashScreen")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Thread {
            try {
                sleep(2000)
            } catch (e: Exception) {
                Log.i("SplashScreenException", "Sleep with exception!")
            } finally {
                startActivity(Intent(this, ChooseModeActivity::class.java))
            }
        }.start()
    }
}