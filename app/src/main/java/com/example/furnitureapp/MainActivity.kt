package com.example.furnitureapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.furnitureapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navController = (supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment).navController
        binding.btNav.setupWithNavController(navController)

    }
}