package com.example.files

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card_radio = findViewById(R.id.card_radio) as CardView
        card_radio.setOnClickListener{
        	            intent = Intent(Intent.ACTION_VIEW)
        	            intent.setData(Uri.parse("https://www.youtube.com/watch?v=tbtEbqrumD4/"))
        	            startActivity(intent)
        }
    }
}




