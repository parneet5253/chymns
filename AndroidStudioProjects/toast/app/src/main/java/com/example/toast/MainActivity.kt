package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting the View object as defined in the custom_toast.xml file


        val customLayout = LayoutInflater.inflate(R.layout.custom_toast_layout) as layout

      val toast_button =  findViewById(R.id.toast_button) as Button
        toast_button.setOnClickListener {
            val toast = Toast(this)
            toast.duration = Toast.LENGTH_SHORT
            toast.setGravity(Gravity.BOTTOM, 0, 0)
            toast.view = customLayout
            toast.show()
        }
    }
  }
