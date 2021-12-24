package com.example.taxi20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.view.isEmpty
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

lateinit private var mailTextInputLayout: TextInputLayout
lateinit private var nameTextInputLayout: TextInputLayout
lateinit private var nameTextInputEditText: TextInputEditText
lateinit private var passwordTextInputLayout: TextInputLayout
lateinit private var passwordTextInputEditText: TextInputEditText
lateinit private var confirmPasswordTextInputLayout: TextInputLayout
lateinit private var confirmPasswordTextInputEditText: TextInputEditText
lateinit private var confirmDataButton: Button
lateinit private var toLogInButton: Button

class PassengerSignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passenger_sign_in)

        mailTextInputLayout = findViewById(R.id.passengerSignInEMailTextInputLayout)

        nameTextInputLayout = findViewById(R.id.passengerSignInNameTextInputLayout)
        nameTextInputEditText = findViewById(R.id.passengerSignInNameTextInputEditText)

        passwordTextInputLayout = findViewById(R.id.passengerSignInPasswordTextInputLayout)
        passwordTextInputEditText = findViewById(R.id.password)

        confirmPasswordTextInputLayout = findViewById(R.id.passengerSignInConfirmPasswordTextInputLayout)
        confirmPasswordTextInputEditText = findViewById(R.id.passengerSignInConfirmPasswordTextEditText)

        confirmDataButton = findViewById(R.id.passengerConfirmDataButton)

        toLogInButton = findViewById(R.id.passengerLogInButton)
    }

    private fun validateSignInDataPassenger() : Boolean{
        return when {
            passwordTextInputLayout.isEmpty() -> {
                Log.i("SignInException", "Password is empty")
                false
            }
            passwordTextInputEditText.length() < 8 -> {
                Log.i("SignInException", "Password length less then 8")
                false
            }
            (passwordTextInputLayout as String).equals(confirmPasswordTextInputLayout as String) -> {
                Log.i("ConfirmException", "Password is not equal confirm password lane")
                false
            }
            else -> {
                Log.i("SignInException", "Password is OK")
                Log.i("ConfirmException", "Confirmation is OK")
                true
            }
        }
    }
}