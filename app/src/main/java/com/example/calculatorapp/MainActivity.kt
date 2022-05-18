package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etInputOne: EditText
    lateinit var etInputTwo: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etInputOne = findViewById(R.id.etInputOne)
        etInputTwo = findViewById(R.id.etInputTwo)
        btnAdd = findViewById(R.id.idAdd)
        btnSubtract = findViewById(R.id.idSubtract)
        btnMultiply = findViewById(R.id.idMultiply)
        btnModulus = findViewById(R.id.idModulus)
        tvResult = findViewById(R.id.tvResult)


        btnAdd.setOnClickListener {
            val number1 = etInputOne.text.toString()
            val number2 = etInputTwo.text.toString()
            add(number1.toInt(),number2.toInt())
        }
        btnSubtract.setOnClickListener {
            val number1 = etInputOne.text.toString()
            val number2 = etInputTwo.text.toString()
            subtract(number1.toInt(),number2.toInt())
        }
        btnMultiply.setOnClickListener {
            val number1 = etInputOne.text.toString()
            val number2 = etInputTwo.text.toString()
            multiply(number1.toInt(),number2.toInt())
        }
        btnModulus.setOnClickListener {
            val number1 = etInputOne.text.toString()
            val number2 = etInputTwo.text.toString()
            modulus(number1.toInt(),number2.toInt())
        }
    }
    fun add(number1 : Int,number2:Int){
        val add = number1 + number2
        tvResult.text = add.toString()
    }
    fun subtract(number1: Int, number2: Int) {
        val subtract =number1 - number2
        tvResult.text = subtract.toString()
    }
    fun multiply(number1: Int, number2: Int) {
        val multiply =number1 * number2
        tvResult.text = multiply.toString()
    }
    fun modulus(number1: Int, number2: Int) {
        val modulus =number1 % number2
        tvResult.text = modulus.toString()
    }


    }