package com.prog.covapps

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Color.RED
import android.graphics.Color.WHITE
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton


class SwitchButton : AppCompatActivity() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch_button)
        // process for Toggle Button

        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        val switch2 = findViewById<Switch>(R.id.switch2)

        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked)
                Toast.makeText(this,"toggle on",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this,"toggle off", Toast.LENGTH_SHORT).show()

        }
        //process for the switch button

        switch2.setOnCheckedChangeListener { compoundButton, onSwitch ->
            if(onSwitch) {
                switch2.setBackgroundColor(Color.RED)
                switch2.setTextColor(Color.WHITE)
            }
            else {
                switch2.setBackgroundColor(Color.MAGENTA)
                switch2.setTextColor(Color.WHITE)
            }

        }

    }
}
