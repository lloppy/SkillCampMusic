package com.example.skillcampmusic.ui.grid_recycler

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.skillcampmusic.R

class GridRecyclerFragment : Fragment(R.layout.fragment_grid_recycler) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val list: List<GridItem> = listOf(
            GridItem("10:00", R.drawable.imageone),
            GridItem("21:00", R.drawable.imagetwo),

            GridItem("11:00", R.drawable.imageone),
            GridItem("22:00", R.drawable.imagetwo),

            GridItem("12:00", R.drawable.imageone),
            GridItem("23:00", R.drawable.imagetwo),

            )
        val recyclerView: RecyclerView =  view.findViewById(R.id.recyclerView)
        recyclerView.adapter = GridRecyclerAdapter(requireContext(), list)
    }
}