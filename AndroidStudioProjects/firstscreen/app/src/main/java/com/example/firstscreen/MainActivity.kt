package com.example.firstscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstscreen.CustomAdapter
import com.example.firstscreen.CustomAdapter1
import com.example.firstscreen.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recyclerView1)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true)
        recyclerView1.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemVewModel>()

        val data1 = ArrayList<ItemVewModel2>()

        for (i in 1..20) {

            data.add(ItemVewModel(R.drawable.img1, "Image" + i))

        }

        for (i in 1..20) {

            data1.add(ItemVewModel2(R.drawable.img1, "Image" + i))

        }


        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter

        val adapter1 = CustomAdapter1(data1)
        recyclerView1.adapter = adapter1
    }
}

