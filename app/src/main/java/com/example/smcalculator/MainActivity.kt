package com.example.smcalculator

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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


            val number1 = edit_text_1.text.toString()
            val number2 = edit_text_2.text.toString()

            if (number1.isEmpty() || number2.isEmpty()){
                Toast.makeText(this,"Please Enter a Number",Toast.LENGTH_LONG).show()
            }else{
                val num1 = number1.toInt()
                val num2 = number2.toInt()
                val result = num1 + num2
                displa.text = "$result"
            }




        }


        subtraction.setOnClickListener {
            val number1 = edit_text_1.text.toString()
            val number2 = edit_text_2.text.toString()

            if (number1.isEmpty() || number2.isEmpty()){
                Toast.makeText(this,"Please Enter a Number?",Toast.LENGTH_SHORT).show()
            }else{
                val num1 = number1.toInt()
                val num2 = number2.toInt()
                val result = num1-num2
                displa.text ="$result"
            }

        }


        multiplication.setOnClickListener {
            val number1 = edit_text_1.text.toString()
            val number2 = edit_text_2.text.toString()

            if (number1.isEmpty() || number2.isEmpty()){
                edit_text_1.setError("please Input Field")
            }else{
                val num1 = number1.toInt()
                val num2 = number2.toInt()
                val result = num1*num2
                displa.text = "$result"
            }

        }

        divition.setOnClickListener {
            val number1 = edit_text_1.text.toString()
            val number2 = edit_text_2.text.toString()

            if (number1.isEmpty() || number2.isEmpty()){
                Toast.makeText(this,"please input Number",Toast.LENGTH_SHORT).show()
            }else{
                val num1 = number1.toInt()
                val num2 = number2.toInt()
                val result = num1/num2
                displa.text = "$result"
            }


        }





    }


}
