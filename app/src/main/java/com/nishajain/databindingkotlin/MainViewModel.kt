package com.nishajain.databindingkotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val userName = MutableLiveData<String>()
}