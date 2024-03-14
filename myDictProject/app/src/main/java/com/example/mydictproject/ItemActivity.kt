package com.example.mydictproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ItemActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
        val tajOne: TextView =findViewById(R.id.item_list_taj_one)
        val rusOne: TextView =findViewById(R.id.item_list_rus_one)
        val engOne: TextView =findViewById(R.id.item_list_eng_one)
        val button: Button=findViewById(R.id.item_button_back)
        tajOne.text=intent.getStringExtra("itemTaj")
        rusOne.text=intent.getStringExtra("itemRus")
        engOne.text=intent.getStringExtra("itemEng")


        button.setOnClickListener{
            val intent= Intent(this,ItemsActivity::class.java)
            startActivity(intent)
        }
    }
}