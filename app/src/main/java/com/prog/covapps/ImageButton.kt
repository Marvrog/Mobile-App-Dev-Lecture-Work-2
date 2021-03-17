package com.prog.covapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton


class ImageButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)

        val imageButton = findViewById<ImageButton>(R.id.imageButton)
        val imageButton2 = findViewById<ImageButton>(R.id.imageButton2)
        val button = findViewById<Button>(R.id.button)


        imageButton.setOnClickListener {
            imageButton2.visibility=View.GONE
        }
        imageButton2.setOnClickListener {
            imageButton.visibility=View.GONE

        }
        button.setOnClickListener {
            imageButton2.visibility=View.VISIBLE
            imageButton.visibility=View.GONE
        }

    }
}
