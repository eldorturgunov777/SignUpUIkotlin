package com.example.signupuikotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    lateinit var bt_up: Button
    lateinit var tv_signUp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        bt_up = findViewById(R.id.bt_up)
        tv_signUp = findViewById(R.id.tv_signUp)
        tv_signUp.setOnClickListener { view: View? -> openSignUp() }
        bt_up.setOnClickListener { view: View? -> openActivity() }
    }

    fun openActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun openSignUp() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
        finish()
    }
}