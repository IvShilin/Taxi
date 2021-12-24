package com.example.taxi20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
}