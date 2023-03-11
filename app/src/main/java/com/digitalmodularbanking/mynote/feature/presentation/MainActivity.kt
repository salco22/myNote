package com.digitalmodularbanking.mynote.feature.presentation

import android.os.Bundle
import android.window.SplashScreen
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.digitalmodularbanking.mynote.R
import com.digitalmodularbanking.mynote.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val navController = (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment).navController

    }
}