package com.prog.covapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBtn = findViewById<Button>(R.id.actionbtn)
        actionBtn.setOnClickListener {
            val intent: Intent = Intent(this, AppsActivity::class.java)
            startActivity(intent)
        }
    }
}