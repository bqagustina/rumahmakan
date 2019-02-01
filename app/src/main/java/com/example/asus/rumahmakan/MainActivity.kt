package com.example.asus.rumahmakan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, Home::class.java)

        val timer = object: CountDownTimer(5000, 1000) {
            override fun onFinish() {

                startActivity(intent)
            }

            override fun equals(other: Any?): Boolean {
                return super.equals(other)
            }

            override fun hashCode(): Int {
                return super.hashCode()
            }

            override fun toString(): String {
                return super.toString()
            }

            override fun onTick(millisUntilFinished: Long) {

            }
        }.start()
    }
}
