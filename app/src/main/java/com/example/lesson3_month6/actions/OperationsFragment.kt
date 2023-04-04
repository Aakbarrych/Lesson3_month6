package com.example.lesson3_month6.actions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lesson3_month6.SharedViewModel
import com.example.lesson3_month6.databinding.FragmentOperationsBinding

class OperationsFragment : Fragment() {

    private lateinit var binding: FragmentOperationsBinding

    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOperationsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[SharedViewModel::class.java]
        initListener()
    }

    private fun initListener() {
        viewModel._operation.observe(viewLifecycleOwner, Observer{ count ->
            binding.tvOperation.text = count.toString()
        })
    }
}