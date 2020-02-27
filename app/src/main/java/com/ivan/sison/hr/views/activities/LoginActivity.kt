package com.ivan.sison.hr.views.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.ivan.sison.hr.R
import com.ivan.sison.hr.utils.ValidateUtil

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            onLogin()
        }
    }

    private fun onLogin() {
        val fldEmail: EditText = findViewById(R.id.fld_email)
        val fldPass: EditText = findViewById(R.id.fld_password)

        if (!ValidateUtil.onValidEmail(fldEmail.text.toString()) &&
            !ValidateUtil.onValidPass(fldPass.text.toString())) {
            fldEmail.error = getString(R.string.message_invalid_field)
            fldPass.error = getString(R.string.message_invalid_field)
        }
        else if (!ValidateUtil.onValidEmail(fldEmail.text.toString())) {
            fldEmail.error = getString(R.string.message_invalid_field)
        }
        else if (!ValidateUtil.onValidPass(fldPass.text.toString())) {
            fldPass.error = getString(R.string.message_invalid_field)
        }
        else {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
