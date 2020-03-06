package com.ivan.sison.hr.views.adapters

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.ivan.sison.hr.R
import com.ivan.sison.hr.models.ApplicationType
import com.ivan.sison.hr.utils.ConstantUtil
import java.util.*
import kotlin.collections.ArrayList

class LegendAdapter (val items : ArrayList<ApplicationType>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_legend_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val application: ApplicationType = items.get(position)
        holder.txtTitle.text = application.name
        holder.lytView.setBackgroundColor(ContextCompat.getColor(context, application.color))
        holder.lytCard.radius = 30.0f
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val lytCard: CardView = view.findViewById(R.id.lyt_card)
    val lytView: RelativeLayout = view.findViewById(R.id.lyt_legend)
    val txtTitle: TextView = view.findViewById(R.id.txt_title)
}