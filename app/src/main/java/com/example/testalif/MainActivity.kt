package com.example.testalif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val label1 = findViewById<TextView>(R.id.myLabel1)
        val label2 = findViewById<TextView>(R.id.myLabel2)
        var label3 = findViewById<TextView>(R.id.myLabel3)
        val edit1 = findViewById<EditText>(R.id.myEdit1)
        val edit2 = findViewById<EditText>(R.id.myEdit2)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener() {
            var name = edit1.text.toString().trim()
            try {
                var year = edit2.text.toString().toInt()
                if (year<1 || year>2024) {
                    label2.text = "Соли таваллудро хато дохил накунед!"
                }
                var age = 2024 - year
                label3.text = "$name аз шиносоӣ шодам \n $name, шумо $age солаед"
            } catch (e: Exception) {
                label2.text = "Сол дохил кунед"
            }

        }

    }

}