package com.nishajain.databindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nishajain.databindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            binding.textView.text = "Hello Developers!"
        }
    }
}