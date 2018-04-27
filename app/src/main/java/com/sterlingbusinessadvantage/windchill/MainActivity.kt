package com.sterlingbusinessadvantage.windchill

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<TextView>(R.id.text1) as TextView
        val text2 = findViewById<TextView>(R.id.text2) as TextView
        val text3 = findViewById<TextView>(R.id.text3) as TextView
        text1.text = "Input number one"
        text2.text = "Input number two"

        val edit1 = findViewById<EditText>(R.id.edit1) as EditText
        val edit2 = findViewById<EditText>(R.id.edit2) as EditText

        val but1 = findViewById<Button>(R.id.but1) as Button
        val but2 = findViewById<Button>(R.id.but2) as Button
        val but3 = findViewById<Button>(R.id.but3) as Button
        val but4 = findViewById<Button>(R.id.but4) as Button

        but1.setOnClickListener {
            val result: Int = edit1.text.toString().toInt() + edit2.text.toString().toInt()
            text3.text = result.toString()
        }
        but2.setOnClickListener {
            val result: Int  = edit1.text.toString().toInt() - edit2.text.toString().toInt()
            text3.text = result.toString()
        }
        but3.setOnClickListener {
            val result: Int  = edit1.text.toString().toInt() * edit2.text.toString().toInt()
            text3.text = result.toString()
        }
        but4.setOnClickListener {
            val result: Int  = edit1.text.toString().toInt() / edit2.text.toString().toInt()
            text3.text = result.toString()
        }

    }
}
