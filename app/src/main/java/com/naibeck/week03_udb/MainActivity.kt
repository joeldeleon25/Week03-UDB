package com.naibeck.week03_udb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.naibeck.week03_udb.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("Activity created")
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.payButton.setOnClickListener {
            val intent = Intent(this, PaymentFormActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Timber.d("Activity started")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("Activity resumed")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("Activity paused")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("Activity stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("Activity destroyed")
    }
}