package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)

        val add = findViewById<Button>(R.id.btnAdd)
        val subtract = findViewById<Button>(R.id.btnSubtract)
        val multiply = findViewById<Button>(R.id.btnMultiply)
        val divide = findViewById<Button>(R.id.btnDivide)

        val result = findViewById<TextView>(R.id.txtResult)

        add.setOnClickListener {
            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()
            result.text = "Result: ${n1 + n2}"
        }

        subtract.setOnClickListener {
            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()
            result.text = "Result: ${n1 - n2}"
        }

        multiply.setOnClickListener {
            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()
            result.text = "Result: ${n1 * n2}"
        }

        divide.setOnClickListener {
            val n1 = num1.text.toString().toDouble()
            val n2 = num2.text.toString().toDouble()
            result.text = "Result: ${n1 / n2}"
        }
    }
}