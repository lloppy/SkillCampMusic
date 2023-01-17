package com.example.skillcampmusic.ui.carousel_recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.skillcampmusic.R

class CarouselRecyclerView: RecyclerView.Adapter<CarouselRecyclerView.CarouselViewHolder>() {
    class CarouselViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.carousel_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarouselViewHolder {
        return CarouselViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.carousel_recycler_item,parent,false))
    }

    override fun onBindViewHolder(holder: CarouselViewHolder, position: Int) {
        holder.image.setImageResource(R.drawable.avatar)
    }

    override fun getItemCount(): Int {
        return 5
    }
}