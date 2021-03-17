package com.prog.covapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkbox)
        val chkPizza= findViewById<CheckBox>(R.id.checkBoxpizza)
        val chkburger= findViewById<CheckBox>(R.id.checkBoxburger)
        val chkhotdog= findViewById<CheckBox>(R.id.checkBoxhotdog)
        val totamt= findViewById<Button>(R.id.button_TotalBill)
        var totalamount =0
        chkPizza.setOnClickListener(View.OnClickListener {
            if (chkPizza.isChecked)
                totalamount+=3
            else
                totalamount-=3
            totamt.setText("Total Bill is: "+totalamount.toString()+ " $")
        })
        chkburger.setOnClickListener(View.OnClickListener {
            if (chkburger.isChecked)
                totalamount+=3
            else
                totalamount-=3
            totamt.setText("Total Bill is: "+totalamount.toString()+ " $")
        })
        chkhotdog.setOnClickListener(View.OnClickListener {
            if (chkhotdog.isChecked)
                totalamount+=3
            else
                totalamount-=3
            totamt.setText("Total Bill is: "+totalamount.toString()+ " $")
        })
    }
}