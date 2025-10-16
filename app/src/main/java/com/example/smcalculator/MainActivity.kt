package com.example.smcalculator

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.toString

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val edit_text_1 = findViewById<EditText>(R.id.firstNumber)
        val edit_text_2 = findViewById<EditText>(R.id.secondNumber)
        val addition = findViewById<TextView>(R.id.add)
        val subtraction = findViewById<TextView>(R.id.sub)
        val multiplication = findViewById<TextView>(R.id.multi)
        val divition = findViewById<TextView>(R.id.div)
        val displa = findViewById<TextView>(R.id.display)




        addition.setOnClickListener {


            val number1 = edit_text_1.text.toString().toInt()
            val number2 = edit_text_2.text.toString().toInt()
            val result = number1 + number2
            displa.text = "$result"


        }


        subtraction.setOnClickListener {
            val number1 = edit_text_1.text.toString().toInt()
            val number2 = edit_text_2.text.toString().toInt()

            val result = number1-number2
            displa.text = "$result"
        }


        multiplication.setOnClickListener {
            val number1 = edit_text_1.text.toString().toInt()
            val number2 = edit_text_2.text.toString().toInt()

            val result = number1*number2
            displa.text = "$result"
        }

        divition.setOnClickListener {
            val number1 = edit_text_1.text.toString().toInt()
            val number2 = edit_text_2.text.toString().toInt()
            val result = number1+number2
            displa.text = "$result"
        }





    }


}
