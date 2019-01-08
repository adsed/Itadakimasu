package com.adsed.itadakimasu.ui.activities

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, MainActivity::class.java)
        GlobalScope.launch {
            delay(500)
            startActivity(intent)
            finish()
        }
    }
}