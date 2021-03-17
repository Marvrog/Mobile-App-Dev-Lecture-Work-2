package com.prog.covapps

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AppsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_apps)
        val allApps = findViewById<ListView>(R.id.all_apps)
        showItems(allApps)

    }
    private fun showItems(view: ListView){

        val items: Array<String> = arrayOf("AlertDialog","Auto Complete TextView","CheckBox","Date Picker", "Image Button","Progress Bar","Rating Bar","Spinner","Switch Button","Toast","Toggle Button")

        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,items)

        view.adapter = adapter

        view.setOnItemClickListener{
            _: AdapterView<*>?, _: View?, position: Int, _: Long ->
            when (position) {
                0 -> {val intent: Intent = Intent(this, AlertDialog::class.java)
                    startActivity(intent)}
                1 -> {val intent: Intent = Intent(this, AutoCompleteTextView::class.java)
                    startActivity(intent)}
                2 -> {val intent: Intent = Intent(this, CheckBox::class.java)
                    startActivity(intent)}
                3 -> {val intent: Intent = Intent(this, DatePicker::class.java)
                    startActivity(intent)}
                4 -> {val intent: Intent = Intent(this, ImageButton::class.java)
                    startActivity(intent)}
                5 -> {val intent: Intent = Intent(this, ProgressBar::class.java)
                    startActivity(intent)}
                6 -> {val intent: Intent = Intent(this, RatingBar::class.java)
                    startActivity(intent)}
                7 -> {val intent: Intent = Intent(this, Spinner::class.java)
                    startActivity(intent)}
                8 -> {val intent: Intent = Intent(this, SwitchButton::class.java)
                    startActivity(intent)}
                9 -> {val intent: Intent = Intent(this, ToastBtn::class.java)
                    startActivity(intent)}
                10 -> {val intent: Intent = Intent(this, ToggleButton::class.java)
                    startActivity(intent)}
                else -> Toast.makeText(this,"Doesn't Work",Toast.LENGTH_LONG).show()
            }
        }

    }
}