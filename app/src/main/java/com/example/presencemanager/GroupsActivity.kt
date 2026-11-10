package com.example.presencemanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GroupsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_groups)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Groupes"
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
