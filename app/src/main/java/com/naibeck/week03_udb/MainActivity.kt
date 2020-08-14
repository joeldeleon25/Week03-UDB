package com.naibeck.week03_udb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val payButton = findViewById<Button>(R.id.payButton)
        payButton.setOnClickListener {
            val intent = Intent(this, PaymentFormActivity::class.java)
            startActivity(intent)
        }
    }
}