package com.example.framelayput

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class KotlinFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_kotlin, container, false)
        val button: Button = view.findViewById(R.id.button)
        button.setOnClickListener {
            Toast.makeText(context,"kotlin fragment", Toast.LENGTH_SHORT).show()
        }
        return view
    }
}
