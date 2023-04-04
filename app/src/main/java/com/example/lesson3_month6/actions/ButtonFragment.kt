package com.example.lesson3_month6.actions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lesson3_month6.SharedViewModel
import com.example.lesson3_month6.databinding.FragmentButtonBinding

class ButtonFragment : Fragment() {

    private lateinit var binding: FragmentButtonBinding

    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.plusBtn.setOnClickListener {
            viewModel.incrementCounter()
        }

        binding.minusBtn.setOnClickListener {
            viewModel.decrementCounter()
        }
        viewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]
    }
}