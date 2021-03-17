package com.prog.covapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.os.Handler


class ProgressBar : AppCompatActivity() {

    private var progressBar: ProgressBar? = null
    private var i = 0
    private var txtView: TextView? = null
    private val handler  = Handler()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_bar)


        progressBar = findViewById<ProgressBar>(R.id.progress_Bar) as ProgressBar
        txtView = findViewById(R.id.text_view) as TextView
        val btn = findViewById(R.id.show_button) as Button
        btn.setOnClickListener {
            i = progressBar!!.progress
            Thread(Runnable {
                while (i < 100) {
                    i += 1
                    // Update the progress bar and display the current value
                    handler.post(Runnable {
                        progressBar!!.progress = i
                        txtView!!.text = i.toString() + "/" + progressBar!!.max
                    })
                    try {
                        Thread.sleep(1000)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }
            }).start()
        }
    }

}