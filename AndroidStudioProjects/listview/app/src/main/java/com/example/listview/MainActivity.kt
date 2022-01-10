package com.example.listview

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val language:Array<String> = resources.getStringArray(R.array.technology_list)
     val arrayAdapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)

        val listView = findViewById<ListView>(R.id.list)
     listView.adapter = arrayAdapter
     listView.onItemClickListener =AdapterView.OnItemClickListener{adapterView, view, position, id ->
     val selected_Item = adapterView.getItemAtPosition(position) as String
     val ItemIdAtPos = adapterView.getItemIdAtPosition(position)
         Toast.makeText(applicationContext, "click item $selected_Item its position$ItemIdAtPos", Toast.LENGTH_SHORT).show()
     }
    }
}