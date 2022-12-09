package com.example.stormiepsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Daftar : AppCompatActivity() {
    private lateinit var mainagen: TextView
    private lateinit var mainpelanggan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        mainagen = findViewById(R.id.tv_masuk)
        mainpelanggan = findViewById(R.id.btn_daftar)
        mainagen.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@Daftar, Masuk::class.java)
            startActivity(intent)
        })
        mainpelanggan.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@Daftar, MainActivity::class.java)
            startActivity(intent)
        })
    }
}