package com.example.skillcampmusic.ui.grid_recycler

import android.app.AlertDialog
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

class GridRecyclerAdapter(val context: Context, val list: List<GridItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val text_time : TextView = itemView.findViewById(R.id.time_text)
    }
    class AddItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val image: ImageView = itemView.findViewById(R.id.add_item)
    }

    override fun getItemViewType(position: Int): Int {
        if(list.lastIndex<position){
            return 1
        }
        return 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            1->return AddItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.add_grid_recycler_item,parent,false))
            else->return GridViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.grid_recycler_item,parent,false))
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder.itemViewType){
            0->{
                holder as GridViewHolder
                Glide
                    .with(context)
                    .load(list[position].image)
                    .transform(RoundedCorners(15))
                    .into(holder.image)

                holder.text_time.text = list[position].time_text
            }
            1-> {
                holder as AddItemViewHolder
                holder.image.setOnClickListener {
                    AlertDialog.Builder(context)
                        .setTitle("Выберите дейтвие")
                        .setMessage("Откуда вы хотите загрузить фотографию")
                        .setPositiveButton("OK",null)
                        .create()
                        .show()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size+1
    }
}