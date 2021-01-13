package com.instagram.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.util.*

class Register_Adapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {
    private val listFragment: MutableList<Fragment> = ArrayList()
    private val listTitle: MutableList<String> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return listFragment[position]
    }

    override fun getCount(): Int {
        return listFragment.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return listTitle[position]
    }

    fun addFragment(fragment: Fragment, title: String) {
        listFragment.add(fragment)
        listTitle.add(title)
    }
}