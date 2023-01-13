package com.example.skillcampmusic.ui.grid_recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.FitCenter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.skillcampmusic.R

class GridRecyclerAdapter(val context: Context, val list: List<GridItem>): RecyclerView.Adapter<GridRecyclerAdapter.GridViewHolder>() {
    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val time_text: TextView = itemView.findViewById(R.id.time_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        return GridViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.grid_recycler_item, parent, false))
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide
            .with(context).load(list[position].image)
            .transform(RoundedCorners(15))
            .into(holder.image)

        holder.time_text.text = list[position].time_text
    }

    override fun getItemCount(): Int {
        return list.size
    }
}