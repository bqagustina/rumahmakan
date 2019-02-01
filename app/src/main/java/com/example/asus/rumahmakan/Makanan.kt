package com.example.asus.rumahmakan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_makanan.*

class Makanan : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_makanan)

        val halaman_pecel = Intent(this, resep_pecel_lele::class.java)
        val halaman_ayam_bakar = Intent(this, resep_ayam_bakar::class.java)
        val halaman_ayam_penyet = Intent(this, resep_ayam_penyet::class.java)
        val halaman_nasi_goreng = Intent(this, resep_nasi_goreng::class.java)
        val halaman_kepiting_asam_manis = Intent(this, resep_kepiting_asam_manis::class.java)
        val halaman_cumi_saus_tiram = Intent(this, resep_cumi_saus_tiram::class.java)
        val halaman_udang_balado = Intent(this, resep_udang_balado::class.java)
        val halaman_ikan_kuah_kuning = Intent(this, resep_ikan_kuah_kuning::class.java)

        pecel.setOnClickListener{view->
            startActivity(halaman_pecel)
        }

        ayam_bakar.setOnClickListener{view->
            startActivity(halaman_ayam_bakar)
        }

        ayam_penyet.setOnClickListener{view->
            startActivity(halaman_ayam_penyet)
        }

        nasi_goreng.setOnClickListener{view->
            startActivity(halaman_nasi_goreng)
        }

        kepiting.setOnClickListener{view->
            startActivity(halaman_kepiting_asam_manis)
        }

        cumi.setOnClickListener{view->
            startActivity(halaman_cumi_saus_tiram)
        }

        udang.setOnClickListener{view->
            startActivity(halaman_udang_balado)
        }

        kuah_kuning.setOnClickListener{view->
            startActivity(halaman_ikan_kuah_kuning)
        }
    }
}
