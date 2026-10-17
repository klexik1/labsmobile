package com.khalchukov.labsmobile.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.khalchukov.labsmobile.R
import com.khalchukov.labsmobile.logic.ListHelper

class MainActivity : AppCompatActivity() {

    private val helper = ListHelper()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val editSize = findViewById<EditText>(R.id.editSize)
        val buttonRun = findViewById<Button>(R.id.buttonRun)
        val textResult = findViewById<TextView>(R.id.textResult)



        buttonRun.setOnClickListener {
            val size = helper.checkInput(editSize.text.toString())



            if (size == null) {
                textResult.text = "Введите положительное число!"
            } else {
                val result = helper.solve(size)


                textResult.text = "Список: ${result.list}\n\n" +
                        "Среднее: %.2f\n\n".format(result.average) +
                        "Элементов, отличающихся от среднего на 5 и больше: ${result.count}"
            }
        }
    }
}
