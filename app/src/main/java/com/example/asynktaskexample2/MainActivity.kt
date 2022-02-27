package com.example.asynktaskexample2

// Example taken from "Alternative 2" https://www.geeksforgeeks.org/alternatives-for-the-deprecated-asynctask-in-android/
// This seams to be a bit simpler than the "Alternative 1" on the same page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.textView)
        val myInput = 26

        doMyTask(myTextView, myInput)
    }

    private fun doMyTask(textView: TextView, input: Int){
        Thread(Runnable {
            val result = input.toString()
            runOnUiThread {
                textView.text = result
            }
        }).start()
    }
}