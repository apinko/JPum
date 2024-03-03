package com.example.myapplication_03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var clickCount = 0
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.TextView)

        val button = findViewById<Button>(R.id.Button)

        button.setOnClickListener {
            clickCount++
            updateClickCount()
        }

       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets*/
        }
    private fun updateClickCount() {
        textView.text = "Liczba kliknięć: $clickCount"
    }

    }
