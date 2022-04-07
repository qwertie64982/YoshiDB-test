package com.cupcakeco.theofficialyoshiapp.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cupcakeco.theofficialyoshiapp.R

class YoshiRecyclerAdapter(private val yoshiList: ArrayList<Yoshi>):
        RecyclerView.Adapter<YoshiRecyclerAdapter.YoshiViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoshiViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.yoshi_list_item,
                                                                   parent, false)
        return YoshiViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: YoshiViewHolder, position: Int) {
        val currentItem = yoshiList[position]
        holder.nameTextView.text = currentItem.name
        holder.iconView.setImageResource(currentItem.imgid)
    }

    override fun getItemCount(): Int {
        return yoshiList.size
    }

    class YoshiViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.name)
        val iconView: ImageView = itemView.findViewById(R.id.icon)

        fun bind(yoshi: Yoshi) {
            nameTextView.text = yoshi.name
            iconView.setImageResource(yoshi.imgid)
        }
    }
}