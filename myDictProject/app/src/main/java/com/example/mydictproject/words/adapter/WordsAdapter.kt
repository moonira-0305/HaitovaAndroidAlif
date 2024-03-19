package com.alif.practicefragmentandrecyclerview.chats.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alif.practicefragmentandrecyclerview.chats.model.WordModel
import com.example.mydictproject.R


class WordsAdapter : RecyclerView.Adapter<WordsAdapter.ViewHolder>() {

    private val items = ArrayList<WordModel>()

    fun updateItems(items: List<WordModel>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {

        private val tajTextView = itemView.findViewById<TextView>(R.id.tajTextView)
        private val rusTextView = itemView.findViewById<TextView>(R.id.rusTextView)
        private val engTextView = itemView.findViewById<TextView>(R.id.engTextView)
        val btn:Button=itemView.findViewById<Button>(R.id.item_list_button)
        fun bind(item: WordModel) {
            tajTextView.text = item.taj
            rusTextView.text = item.rus
            engTextView.text = item.eng

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.word_item, parent, false)

        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
        holder.btn.setOnClickListener{

    }



}}