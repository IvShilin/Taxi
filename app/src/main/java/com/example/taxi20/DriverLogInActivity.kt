package com.example.taxi20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class DriverLogInActivity : AppCompatActivity(), ValidationData {

    lateinit var mailTextInputEditText: TextInputEditText
    lateinit var passwordTextInputEditText: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_driver_log_in)

        mailTextInputEditText = findViewById(R.id.driverLogInEMailTextInputEditText)
        passwordTextInputEditText = findViewById(R.id.driverLogInPasswordTextInputEditText)
    }

    fun driverConfirmLogIn(view: android.view.View) {
        if (validateEMail() and validatePassword()){
            Log.i("ConfirmationInfo", "Confirmation is OK")
            Toast.makeText(this, "Confirmation is OK", Toast.LENGTH_SHORT).show()

            // Add here "startActivity"
        }
    }

    fun goToSignInDriver(view: android.view.View) {
        startActivity(Intent(this, DriverSignInActivity::class.java))
    }



    override fun validateEMail(): Boolean {
        return when {
            mailTextInputEditText.length() == 0 -> {
                Log.i("LogInException", "Email is empty")
                mailTextInputEditText.setError("Email line is empty. Please, input your email")
                false
            }
            else -> {
                Log.i("LogInException", "Email is OK")
                true
            }
        }    }

    override fun validatePassword(): Boolean {
        return when {
            passwordTextInputEditText.length() < 8 -> {
                Log.i("LogInException", "Password length less then 8")
                passwordTextInputEditText.setError("Password less then 8 symbols. Please, input longer password")
                false
            }
            else -> {
                Log.i("LogInException", "Password is OK")
                true
            }
        }    }
}