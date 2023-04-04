@file:Suppress("DEPRECATION")

package com.example.lesson3_month6

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.lesson3_month6.actions.ButtonFragment
import com.example.lesson3_month6.actions.CounterFragment
import com.example.lesson3_month6.actions.OperationsFragment

class ViewPagerAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> ButtonFragment()
            1 -> CounterFragment()
            2 -> OperationsFragment()
            else -> ButtonFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}