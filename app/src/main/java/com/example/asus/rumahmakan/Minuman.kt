package com.example.asus.rumahmakan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_minuman.*
import kotlinx.android.synthetic.main.content_home.*

class Minuman : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_minuman)

        val halaman_es_campur = Intent(this, resep_es_campur::class.java)
        val halaman_resep_es_teler = Intent(this, resep_es_teler::class.java)
        val halaman_resep_jus_buah_naga = Intent(this, resep_jus_buah_naga::class.java)
        val halaman_resep_jus_apel= Intent(this, resep_jus_apel::class.java)
        val halaman_jus_pepaya = Intent(this, resep_jus_pepaya::class.java)
        val halaman_sop_buah = Intent(this, resep_sop_buah::class.java)
        val halaman_jus_alpukat = Intent(this, resep_jus_alpukat::class.java)

        es_campur.setOnClickListener { view ->
            startActivity(halaman_es_campur)

        }

        es_teler.setOnClickListener { view ->
            startActivity(halaman_resep_es_teler)

        }

        jus_naga.setOnClickListener { view ->
            startActivity(halaman_resep_jus_buah_naga)

        }

        jus_apel.setOnClickListener { view ->
            startActivity(halaman_resep_jus_apel)

        }

        jus_pepaya.setOnClickListener { view ->
            startActivity(halaman_jus_pepaya)

        }

        sop_buah.setOnClickListener { view ->
            startActivity(halaman_sop_buah)

        }

        jus_alpukat.setOnClickListener { view ->
            startActivity(halaman_jus_alpukat)

        }
    }

}
