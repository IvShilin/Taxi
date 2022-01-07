package com.example.taxi20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

lateinit private var mailTextInputEditText: TextInputEditText

lateinit private var nameTextInputEditText: TextInputEditText

lateinit private var passwordTextInputLayout: TextInputLayout
lateinit private var passwordTextInputEditText: TextInputEditText

lateinit private var confirmPasswordTextInputLayout: TextInputLayout
lateinit private var confirmPasswordTextInputEditText: TextInputEditText

class PassengerSignInActivity : AppCompatActivity(), ValidationData{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passenger_sign_in)

        mailTextInputEditText = findViewById(R.id.passengerSignInEMailTextInputEditText)

        nameTextInputEditText = findViewById(R.id.passengerSignInNameTextInputEditText)

        passwordTextInputLayout = findViewById(R.id.passengerSignInPasswordTextInputLayout)
        passwordTextInputEditText = findViewById(R.id.passengerSignInPasswordTextInputEditText)

        confirmPasswordTextInputLayout = findViewById(R.id.passengerSignInConfirmPasswordTextInputLayout)
        confirmPasswordTextInputEditText = findViewById(R.id.passengerSignInConfirmPasswordTextEditText)
    }

    fun passengerConfirmSignIn(view: android.view.View) {
        if (validateEMail() and validateName() and validatePassword()){
            Log.i("ConfirmationInfo", "Confirmation is OK")
            Toast.makeText(this, "Confirmation is OK", Toast.LENGTH_SHORT).show()

            // Add here "startActivity"
        }
    }


    //Implements interface
    override fun validateName() : Boolean{
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

    override fun validateEMail() : Boolean{
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

    override fun validatePassword() : Boolean{
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
}