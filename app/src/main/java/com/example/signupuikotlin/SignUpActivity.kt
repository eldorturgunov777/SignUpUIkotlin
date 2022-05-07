package com.example.signupuikotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    lateinit var bt_up: Button
    lateinit var tv_signIn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        bt_up = findViewById(R.id.bt_up)
        bt_up.setOnClickListener(View.OnClickListener { view: View? -> openActivity() })
        tv_signIn = findViewById(R.id.tv_signIn)
        tv_signIn.setOnClickListener(View.OnClickListener { view: View? -> openSignIn() })
    }

    fun openActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun openSignIn() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}