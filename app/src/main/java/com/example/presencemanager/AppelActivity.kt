package com.example.presencemanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AppelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appel)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Faire l'appel"
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
