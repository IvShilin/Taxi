package com.example.taxi20

interface ValidationData {
    fun validateSignEMailPassenger(): Boolean {return false}
    fun validateSignInNamePassenger():Boolean {return false}
    fun validateSignInPasswordPassenger(): Boolean {return false}
}