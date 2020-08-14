package com.naibeck.week03_udb

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val payButton = findViewById<Button>(R.id.payButton)
        payButton.setOnClickListener {
            payButton.text = changeButtonText(payButton)
            Toast.makeText(this, "This will move to my next activity", Toast.LENGTH_SHORT).show()
        }
    }

    private fun changeButtonText(payButton: Button): String {
        return if (payButton.text.contains("Pagar", ignoreCase = true)) {
            "Pagando..."
        } else {
            getString(R.string.pay_action)
        }
    }
}