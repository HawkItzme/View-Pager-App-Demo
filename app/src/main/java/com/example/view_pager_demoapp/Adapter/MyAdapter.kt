package com.example.view_pager_demoapp.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.view_pager_demoapp.FragmentOne
import com.example.view_pager_demoapp.FragmentThree
import com.example.view_pager_demoapp.FragmentTwo
import com.example.view_pager_demoapp.MainActivity

class MyAdapter(mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {

    private val Fragments_Size = 3

    override fun getItemCount(): Int {
        return this.Fragments_Size
    }

    override fun createFragment(position: Int): Fragment {

        when(position){
            0 -> {
                return FragmentOne()
            }
            1 -> {
                return FragmentTwo()
            }
            2 -> {
                return FragmentThree()
            }
        }
        return FragmentOne()
    }


}