package com.diva.detikapp.newsadapter

import com.diva.detikapp.R

data class news(var title: String, var desc: String, var photo: Int)

object NewsModel{
    val newslists = listOf<news>(
        news("Pasar ramai dikunjungi warga meskipun wabah COVID-19 belum dinyatakan usai", "detikcom | 1 jam yang lalu",
            R.drawable.img_pasar),

    news("Kapal nelayan menyalurkan bansos masyarakat Sulawesi", "detikcom | 1 jam yang lalu",
    R.drawable.img_nelayan)



    )
}