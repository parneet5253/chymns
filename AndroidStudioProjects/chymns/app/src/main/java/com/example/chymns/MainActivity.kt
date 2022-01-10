package com.example.chymns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardcompiled =findViewById(R.id.CompiledHymns) as CardView

        cardcompiled.setOnClickListener {

            var intent = Intent(applicationContext,CompiledHymns::class.java)
            startActivity(intent)

        }
        val floatingbutton =  findViewById<FloatingActionButton>(R.layout.flo)

        floatingbutton.setOnClickListener{
         var intent=Intent(applicationContext,FloatongButtonActivity::class.java)
        }
    }
}