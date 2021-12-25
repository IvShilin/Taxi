package com.example.taxi20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ChooseModeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_mode)
    }

    fun goToPassengerSignIn(view: android.view.View) {
        startActivity(Intent(this, PassengerSignInActivity::class.java))
    }
    fun goToDriverSignIn(view: android.view.View) {
        startActivity(Intent(this, DriverSignInActivity::class.java))
    }
}