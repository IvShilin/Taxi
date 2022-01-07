package com.example.taxi20

import android.util.Log

interface ValidationData {
    fun validateEMail(): Boolean {
        Log.i("SignInException", "Please, implement validateEMail")
        return false
    }
    fun validateName():Boolean {
        Log.i("SignInException", "Please, implement validateName")
        return false
    }
    fun validatePassword(): Boolean {
        Log.i("SignInException", "Please, implement validateSignPasswordPassenger")
        return false
    }
}