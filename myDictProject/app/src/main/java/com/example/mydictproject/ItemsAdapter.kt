package com.example.mydictproject

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter(var items:List<Item>,var context: Context):RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        val taj: TextView =view.findViewById(R.id.item_list_taj)
        val rus: TextView =view.findViewById(R.id.item_list_rus)
        val eng: TextView =view.findViewById(R.id.item_list_eng)
        val btn:Button=view.findViewById(R.id.item_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_in_list,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.taj.text=items[position].taj
        holder.rus.text=items[position].rus
        holder.eng.text=items[position].eng

        holder.btn.setOnClickListener{
            val intent= Intent(context, ItemActivity::class.java)

            intent.putExtra("itemTaj",items[position].taj)
            intent.putExtra("itemRus",items[position].rus)
            intent.putExtra("itemEng",items[position].eng)
            context.startActivity(intent)
        }


    }
}