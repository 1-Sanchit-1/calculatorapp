package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class spleshscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spleshscreen)

        Handler().postDelayed(Runnable {
            startActivities(arrayOf(Intent(this, MainActivity::class.java)))
        }, 2000)
    }
}