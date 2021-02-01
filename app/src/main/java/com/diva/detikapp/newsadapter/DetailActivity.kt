package com.diva.detikapp.newsadapter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.diva.detikapp.MainActivity
import com.diva.detikapp.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val cont_titleNews = "cont_titleNews"
        const val cont_photoNews = "cont_photoNews" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

    supportActionBar?.hide()
        txt_titleNews.setText(intent.getStringExtra(cont_titleNews))
        img_toolbar.setImageResource(intent.getStringExtra(cont_photoNews)!!.toInt())

        btn_back.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intentMain = Intent(this@DetailActivity, MainActivity::class.java)

                startActivity(intentMain)
                finish()
               }
        })
    }
}