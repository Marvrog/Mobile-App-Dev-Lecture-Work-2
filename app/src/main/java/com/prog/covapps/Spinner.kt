package com.prog.covapps

import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class Spinner : AppCompatActivity(),AdapterView.OnItemSelectedListener {

    var languages = arrayOf("English", "French", "Spanish", "Hindi", "Russian", "Telugu", "Chinese", "German", "Portuguese", "Arabic", "Dutch", "Urdu", "Italian", "Tamil", "Persian", "Turkish", "Other")

    var spinner:Spinner? = null
    var textView_msg:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        val msg = findViewById<TextView>(R.id.msg)
        val spinners = findViewById<Spinner>(R.id.spinner)

        textView_msg = msg

        spinner = spinners
        spinner!!.setOnItemSelectedListener(this)

        // Create an ArrayAdapter using a simple spinner layout and languages array
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, languages)
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinner!!.setAdapter(aa)

    }

    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        textView_msg!!.text = "Selected : "+languages[position]
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}