package com.example.laboratorio5_pp

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterFacts: RecyclerView.Adapter<AdapterFacts.MyViewHolder>() {

    fun adapterFacts(fact: String, context: Context) {
        this.Facts = fact
        this.context = context
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFacts {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: AdapterFacts, position: Int) {
        val item = Facget(position)
    }

}