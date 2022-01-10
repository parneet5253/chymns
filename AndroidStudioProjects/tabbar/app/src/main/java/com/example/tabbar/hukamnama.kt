package com.example.tabbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class hukamnama : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_hukamnama, container, false)
        val button2: Button = view.findViewById(R.id.button2)
        button2.setOnClickListener {
            Toast.makeText(context,"hukamnama", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}
