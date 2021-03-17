package com.prog.covapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class ToastBtn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val show_toast = findViewById<Button>(R.id.btn_show_toast)
        show_toast.setOnClickListener { Toast.makeText(this,"Toast Widget is Working Perfectly",Toast.LENGTH_SHORT).show() }
    }
}