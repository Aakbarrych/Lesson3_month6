package com.example.lesson3_month6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.lesson3_month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: SharedViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()

        viewModel = ViewModelProvider(return)[SharedViewModel::class.java]
    }

    private fun initView() {
        val viewPager = binding.viewpager
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
    }
}