package com.prog.covapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButtonToggleGroup

class ToggleButton : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toggle_button)

        val toggleButtonGroup = findViewById<MaterialButtonToggleGroup>(R.id.toggleButtonGroup)

        toggleButtonGroup.addOnButtonCheckedListener { toggleButtonGroup, checkedId, isChecked ->
            if (isChecked) {
                when (checkedId) {
                    R.id.btnAndroid -> showToast("you clicked Android button.")
                    R.id.btnFlutter -> showToast("you have clicked Flutter button.")
                    R.id.btnWeb -> showToast("congratulations you pressed the web button")
                }
            } else {
                if (toggleButtonGroup.checkedButtonId == View.NO_ID) {
                    showToast("Nothing Selected")
                }
            }
        }
    }

    private fun showToast(str: String) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
    }
}