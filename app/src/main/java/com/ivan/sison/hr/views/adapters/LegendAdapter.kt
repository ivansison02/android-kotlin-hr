package com.ivan.sison.hr.views.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ivan.sison.hr.R

class LegendAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_legend_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder?.tvAnimalType?.text = items.get(position)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    //val txtName = view.tv_animal_type
}