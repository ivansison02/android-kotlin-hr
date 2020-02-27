package com.ivan.sison.hr.utils

object ValidateUtil {

    fun onValidEmail(string: String) : Boolean {
        if (string.isEmpty()) {
            return false
        }

        return true
    }

    fun onValidPass(string: String) : Boolean {
        if (string.isEmpty()) {
            return false
        }

        return true
    }
}