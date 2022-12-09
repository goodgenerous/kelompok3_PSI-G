package com.example.stormiepsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stormiepsi.databinding.ActivityPilihUserBinding

class PilihUser : AppCompatActivity() {
    private lateinit var binding: ActivityPilihUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPilihUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewPagerAdapter = ViewPageAdapter(this)
        binding.slideViewPager.adapter = viewPagerAdapter
        binding.dots.setViewPager(binding.slideViewPager)
        binding.btnPilihDaftar.setOnClickListener {
            val intent = Intent(this@PilihUser, Daftar::class.java)
            startActivity(intent)
        }
    }
}