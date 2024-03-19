package com.example.mydictproject.words

import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

import com.alif.practicefragmentandrecyclerview.chats.adapter.WordsAdapter
import com.alif.practicefragmentandrecyclerview.chats.model.WordModel
import com.example.mydictproject.R


class WordsFragment : Fragment(R.layout.fragment_words) {

    private val recyclerView by lazy { requireView().findViewById<RecyclerView>(R.id.recyclerView) }
    private val adapter = WordsAdapter()

    private val data = listOf(
        WordModel("Ман забони англисиро омӯхта истодаам. ", "Я изучаю английский язык","I am studying English",""),
        WordModel("Донишгоҳи мо калон аст", "Наш университет большой","Our university  is large",""),
        WordModel("Он якчанд хобгоҳ дорад", "При нём имеется несколько общежитий","It has some dormitories",""),
        WordModel("Дар давоми таҳсил...", "В течение учёбы…","During the study… ",""),
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.adapter = adapter
        adapter.updateItems(data)
        view.findViewById<EditText>(R.id.searchEditText).apply {
            background = null
            doAfterTextChanged {
                filterChats(it)
            }
        }
    }

    private fun filterChats(query: Editable?) {
        query?.let {
            if (it.isNotEmpty()) {
                val searchQuery = query.toString().lowercase()
                adapter.updateItems(data.filter {
                    it.taj.lowercase().contains(searchQuery) ||
                            it.rus.lowercase().contains(searchQuery)||
                            it.eng.lowercase().contains(searchQuery)
                })
            } else adapter.updateItems(data)
        }
    }

}