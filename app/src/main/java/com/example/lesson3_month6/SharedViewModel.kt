package com.example.lesson3_month6

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private var mCount = 0
    val countС: MutableLiveData<String> = MutableLiveData()

    private var operation = ""
    val _operation : MutableLiveData<String> = MutableLiveData()

    fun incrementCounter() {
        mCount++
        countС.value = mCount.toString()
        _operation.value = "\n + $operation"

    }

    fun decrementCounter() {
        mCount--
        countС.value = mCount.toString()
        _operation.value = "\n - $operation"

    }

}