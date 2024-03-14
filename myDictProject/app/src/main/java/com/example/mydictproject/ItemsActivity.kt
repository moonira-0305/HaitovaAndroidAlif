package com.example.mydictproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)
        val itemsList: RecyclerView =findViewById(R.id.itemList)
        val items= arrayListOf<Item>()

        items.add(Item(1,"Ман омӯзгор ҳастам","Я преподаватель","I am a teacher",""))
        items.add(Item(2,"Ман донишҷӯйи курси якум нестам","Я не первокурсник","I am not a freshman",""))
        items.add(Item(3,"Дар давоми таҳсил...","В течение учёбы…","During the study…",""))

        itemsList.layoutManager= LinearLayoutManager(this)
        itemsList.adapter=ItemsAdapter(items,this)
    }
}