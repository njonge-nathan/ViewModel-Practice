package com.example.viewmodelpractice

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    // this handles the state for the textfield input
    var text: String by mutableStateOf("")
}