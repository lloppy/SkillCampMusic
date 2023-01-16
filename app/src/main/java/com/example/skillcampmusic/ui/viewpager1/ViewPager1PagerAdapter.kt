package com.example.skillcampmusic.ui.viewpager1
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.skillcampmusic.ui.viewpager1.fragments.AllMusicFragment
import com.example.skillcampmusic.ui.viewpager1.fragments.FavouritesMusicFragment
import com.example.skillcampmusic.ui.viewpager1.fragments.NewMusicFragment

class ViewPager1PagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    val list_title : List<String> = listOf("Все", "Новинки","Избранное")
    override fun getPageTitle(position: Int): CharSequence? {
        return list_title[position]
    }

    override fun getCount(): Int {
        return list_title.size
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> AllMusicFragment()
            1-> NewMusicFragment()
            2-> FavouritesMusicFragment()
            else-> AllMusicFragment()
        }
    }
}