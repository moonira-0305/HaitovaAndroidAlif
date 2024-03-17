package com.example.mydictproject

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
        val taj:TextView=findViewById(R.id.item_list_tajOne)
        val rus:TextView=findViewById(R.id.item_list_rusOne)
        val eng:TextView=findViewById(R.id.item_list_engOne)
        val btnBack:TextView=findViewById(R.id.item_list_button)
        taj.text=intent.getStringExtra("itemTaj")
        rus.text=intent.getStringExtra("itemRus")
        eng.text=intent.getStringExtra("itemEng")
btnBack.setOnClickListener{
    val intent= Intent(this,ItemsActivity::class.java)
    startActivity(intent)
}
    }
}