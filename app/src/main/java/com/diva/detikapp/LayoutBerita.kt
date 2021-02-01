package com.diva.detikapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LayoutBerita : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lay_berita)

        supportActionBar?.hide()
    }
}