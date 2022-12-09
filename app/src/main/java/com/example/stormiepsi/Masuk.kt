package com.example.stormiepsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Masuk : AppCompatActivity() {
    private lateinit var daftar: TextView
    private lateinit var mainagen : Button
    private lateinit var mainpelanggan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)
        mainagen = findViewById(R.id.btn_masuk)
        daftar = findViewById(R.id.tv_daftar)
        daftar.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@Masuk, Daftar::class.java)
            startActivity(intent)
        })
        mainagen.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@Masuk, MainActivity2::class.java)
            startActivity(intent)
        })
    }
}