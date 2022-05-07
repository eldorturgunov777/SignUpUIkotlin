package com.example.signupuikotlin

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initViews()
    }

    fun initViews() {
        countDownTimer()
    }

    fun countDownTimer() {
        object : CountDownTimer(2000, 1000) {
            override fun onTick(l: Long) {}
            override fun onFinish() {
                openActivity()
            }
        }.start()
    }

    fun openActivity() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}