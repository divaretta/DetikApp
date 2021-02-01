package com.diva.detikapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.diva.detikapp.newsadapter.DetailActivity
import com.diva.detikapp.newsadapter.NewsAdapter
import com.diva.detikapp.newsadapter.NewsModel
import com.diva.detikapp.newsadapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        var headlinenews: news?
        if (NewsModel.newslists.size > 0) {
            headlinenews = NewsModel.newslists[NewsModel.newslists.size - 1]
            tv_titleHeadline.setText(headlinenews.title)
            tv_descHeadline.setText(headlinenews.desc)
            img_news.setImageResource(headlinenews.photo)

            cdv_newsHeadline.setOnClickListener {
                val intent_detail = Intent(this, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_titleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_photoNews, headlinenews.toString())
                    }
                startActivity(intent_detail)
                finish()
            }
        }

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarBerita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newslists)
        rcv_daftarBerita.adapter = newsAdapter

        newsAdapter.setOnClickCallback(object : NewsAdapter.OnItemClickCallback {
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_titleNews, data.title.toString())
                        putExtra(DetailActivity.cont_photoNews, data.photo.toString())
                    }
                startActivity(intent)
                finish()
            }
        })
    }
}