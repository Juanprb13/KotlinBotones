package com.example.ejerciciobotones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_1 : Button = findViewById(R.id.btn_1)
        val button_2 : Button = findViewById(R.id.btn_2)
        val button_3 : Button = findViewById(R.id.btn_3)
        val button_4 : Button = findViewById(R.id.btn_4)
        val button_5 : Button = findViewById(R.id.btn_5)
        val textview  = findViewById<TextView>(R.id.textView)
        val edit_text : EditText  = findViewById(R.id.editText)

        button_1.setOnClickListener {
            textview.setTextColor(resources.getColor(R.color.pastel_green))
            textview.setText(edit_text.text)
            edit_text.setText("")
        }
        button_2.setOnClickListener {
            textview.setTextColor(resources.getColor(R.color.pastel_red))
            textview.setText(edit_text.text)
            edit_text.setText("")
        }
        button_3.setOnClickListener {
            textview.setTextColor(resources.getColor(R.color.pastel_pink))
            textview.setText(edit_text.text)
            edit_text.setText("")
        }
        button_4.setOnClickListener {
            textview.setTextColor(resources.getColor(R.color.pastel_blue))
            textview.setText(edit_text.text)
            edit_text.setText("")
        }
        button_5.setOnClickListener {
            textview.setTextColor(resources.getColor(R.color.pastel_yellow))
            textview.setText(edit_text.text)
            edit_text.setText("")
        }
    }
}