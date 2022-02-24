package com.wsayan.ballet.ui.main

import android.os.Bundle
import com.wsayan.ballet.databinding.ActivityMainBinding
import com.wsayan.ballet.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun viewRelatedTask() {

    }
}
