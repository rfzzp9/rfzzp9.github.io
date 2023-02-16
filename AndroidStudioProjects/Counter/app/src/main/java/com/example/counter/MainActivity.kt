package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val plusButton = findViewById<Button>(R.id.plusButton)

        var number = 0//var 변수는 변경이 가능한 변수

        resetButton.setOnClickListener {
            number = 0
            numberTextView.text = number.toString()
        }

        plusButton.setOnClickListener {
            number += 1
            numberTextView.text = number.toString()
        }

    }
}