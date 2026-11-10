package com.example.presencemanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HistoriqueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historique)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Historique"
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
