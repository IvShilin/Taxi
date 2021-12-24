package com.example.taxi20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception
import java.lang.Thread.sleep
import kotlin.concurrent.thread

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val thread = Thread {
            try {
                sleep(2000)
            } catch (e: Exception) {
                Log.i("slepp", "Sleep with exception!")
            } finally {
                startActivity(Intent(this, SignInActivity::class.java))
            }
        }.start()
    }
}