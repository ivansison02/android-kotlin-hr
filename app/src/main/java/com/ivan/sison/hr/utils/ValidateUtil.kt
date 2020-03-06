package com.ivan.sison.hr.utils

object ValidateUtil {

    fun onValidEmail(string: String) : Boolean =
        when {
            string.isEmpty() -> false
            else -> true
        }

    fun onValidPass(string: String) : Boolean =
        when {
            string.isEmpty() -> false
            else -> true
        }

    fun onPasswordMatches(password: String, confirm: String) : Boolean =
        when {
            password == confirm -> true
            else -> true
        }
}