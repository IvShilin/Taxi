package com.example.taxi20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.view.isEmpty
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

lateinit private var mailTextInputLayout: TextInputLayout
lateinit private var mailTextInputEditText: TextInputEditText

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
        mailTextInputEditText = findViewById(R.id.passengerSignInEMailTextInputEditText)

        nameTextInputLayout = findViewById(R.id.passengerSignInNameTextInputLayout)
        nameTextInputEditText = findViewById(R.id.passengerSignInNameTextInputEditText)

        passwordTextInputLayout = findViewById(R.id.passengerSignInPasswordTextInputLayout)
        passwordTextInputEditText = findViewById(R.id.password)

        confirmPasswordTextInputLayout = findViewById(R.id.passengerSignInConfirmPasswordTextInputLayout)
        confirmPasswordTextInputEditText = findViewById(R.id.passengerSignInConfirmPasswordTextEditText)

        confirmDataButton = findViewById(R.id.passengerConfirmDataButton)

        toLogInButton = findViewById(R.id.passengerLogInButton)
    }

    private fun validateSignInPasswordPassenger() : Boolean{
        return when {
            passwordTextInputEditText.length() < 8 -> {
                Log.i("SignInException", "Password length less then 8")
                passwordTextInputEditText.setError("Password less then 8 symbols. Please, input longer password")
                false
            }
            passwordTextInputLayout.editText?.text.toString().trim()
                    !=
                    confirmPasswordTextInputLayout.editText?.text.toString().trim() -> {
                Log.i("ConfirmException", "Password is not equal confirm password lane")
                confirmPasswordTextInputEditText.setError("Passwords is not equal. Please, try to input correct passwords")
                false
            }
            else -> {
                Log.i("SignInException", "Password is OK")
                true
            }
        }
    }

    private fun validateSignInNamePassenger() : Boolean{
        return when {
            nameTextInputEditText.length() == 0 -> {
                Log.i("SignInException", "Name line is empty")
                nameTextInputEditText.setError("Name line is empty. Please, input your name!")
                false
            }
            nameTextInputEditText.length() > 15 -> {
                Log.i("SignInException", "Name is too long")
                nameTextInputEditText.setError("Name is too long. Please, input your real name!")
                false
            }
            else -> {
                Log.i("SignInException", "Name is OK")
                true
            }
        }
    }

    private fun validateSignEMailPassenger() : Boolean{
        return when {
            mailTextInputEditText.length() == 0 -> {
                Log.i("SignInException", "Email is empty")
                mailTextInputEditText.setError("Email line is empty. Please, input your email")
                false
            }
            else -> {
                Log.i("SignInException", "Email is OK")
                true
            }
        }
    }

    fun confirmSignIn(view: android.view.View) {
        if (validateSignEMailPassenger() and validateSignInNamePassenger() and validateSignInPasswordPassenger()){
            Log.i("ConfirmationInfo", "Confirmation is OK")
            Toast.makeText(this, "Confirmation is OK", Toast.LENGTH_SHORT).show()

            // Add here "startActivity"
        }
    }
}