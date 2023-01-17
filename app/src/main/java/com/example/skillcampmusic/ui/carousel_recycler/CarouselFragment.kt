package com.example.skillcampmusic.ui.carousel_recycler

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.skillcampmusic.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class CarouselFragment :Fragment(R.layout.fragment_carousel){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager2 :ViewPager2 = view.findViewById(R.id.viewpager2)
        val tabs :  TabLayout = view.findViewById(R.id.carousel_tabs)
        viewPager2.adapter = CarouselRecyclerView()
        TabLayoutMediator(tabs,viewPager2){_,_->}.attach()
    }
}