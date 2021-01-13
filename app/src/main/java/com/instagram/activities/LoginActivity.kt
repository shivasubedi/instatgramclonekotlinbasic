package com.instagram.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.instagram.R

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    var btnLogin: Button? = null
    var btnLoginWithFb: Button? = null
    var username: EditText? = null
    var password: EditText? = null
    var signup: TextView? = null
    var forgot: TextView? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById<EditText>(R.id.etUsername)
        password = findViewById<EditText>(R.id.etPassword)
        signup = findViewById<TextView>(R.id.tvSignUp)
        forgot = findViewById<TextView>(R.id.tvHelpSignIn)
        btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLoginWithFb = findViewById<Button>(R.id.btnLoginWithFb)
        signup?.setOnClickListener(this)
        forgot?.setOnClickListener(this)
        btnLogin!!.setOnClickListener(this)
        btnLoginWithFb!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tvSignUp -> openSignUp()
            R.id.tvHelpSignIn -> Toast.makeText(this, " Test Go to Change Password", Toast.LENGTH_SHORT).show()
            R.id.btnLogin -> login()
            R.id.btnLoginWithFb -> Toast.makeText(this, "Test Login with facebook", Toast.LENGTH_SHORT).show()
        }
    }

    fun login() {
        if (username?.getText().toString() == "pooja@gmail.com" && password?.getText().toString() == "12345") {
            Toast.makeText(this, "Login Sucessful!!", Toast.LENGTH_SHORT).show()
            openDashBoard()
        } else {
            Toast.makeText(this, "worng username or password!!", Toast.LENGTH_SHORT).show()
        }
    }

    fun openDashBoard() {
        val openDash = Intent(this, MainActivity::class.java)
        startActivity(openDash)
    }

    fun openSignUp() {
        val openDash = Intent(this, RegUserActivity::class.java)
        startActivity(openDash)
    }
}