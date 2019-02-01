package com.example.asus.rumahmakan

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.content_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)

        val intent = Intent(this, Makanan::class.java)
        val haltentang = Intent(this, Tentang::class.java)
        val halminuman = Intent(this, Minuman ::class.java)

        makanan.setOnClickListener { view ->
            startActivity(intent)

        }

        tentang.setOnClickListener { view ->
            startActivity(haltentang)
        }

        minuman.setOnClickListener { view ->
            startActivity(halminuman)
        }


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

}
