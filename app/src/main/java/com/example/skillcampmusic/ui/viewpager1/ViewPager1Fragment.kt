package com.example.skillcampmusic.ui.viewpager1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.skillcampmusic.R
import com.google.android.material.tabs.TabLayout

class ViewPager1Fragment : Fragment(R.layout.fragment_viewpager1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager : ViewPager = view.findViewById(R.id.viewpager)
        val tabs : TabLayout = view.findViewById(R.id.tab)

        viewPager.adapter = ViewPager1PagerAdapter(parentFragmentManager)
        tabs.setupWithViewPager(viewPager)
    }
}