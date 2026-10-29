package com.khalchukov.labsmobile.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.khalchukov.labsmobile.R
import com.khalchukov.labsmobile.logic.ListHelper

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButton()
    }


    private fun setupButton() {
        val editSize = findViewById<EditText>(R.id.editSize)
        val buttonRun = findViewById<Button>(R.id.buttonRun)
        val textResult = findViewById<TextView>(R.id.textResult)

        buttonRun.setOnClickListener {
            textResult.text = processInput(editSize.text.toString())
        }
    }
}