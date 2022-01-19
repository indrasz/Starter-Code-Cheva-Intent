package com.wahyuindra.intentexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyuindra.intentexample.databinding.ActivityPageTwoBinding

class PageTwo : AppCompatActivity() {
    private lateinit var binding : ActivityPageTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPageTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}