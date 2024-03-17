package com.example.mydictproject


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)
        val itemsList =findViewById<RecyclerView>(R.id.itemList)
        val items= arrayListOf<Item>()
        items.add(Item(1,"Миллати шумо чӣ аст?","Кто вы по национальности?","What is your nationality?",""))
        items.add(Item(2,"Ин талаба доно аст","Этот ученик умный","This schoolboy is clever",""))
        items.add(Item(3,"Ӯ мехоҳад ба коллеҷ  дохил шавад","Он хочет поступить в колледж","He wants to go to college",""))
        items.add(Item(4,"Ӯ хонандаи хеле хуб аст","Он очень хороший ученик.","He is a very good pupil",""))
        itemsList.layoutManager=LinearLayoutManager(this)
        itemsList.adapter=ItemsAdapter(items,this)
    }
}