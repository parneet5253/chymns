package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   var btn1=findViewById(R.id.buttonfirst) as Button
        btn1.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button one", Toast.LENGTH_SHORT).show()

        }
        var btn2=findViewById(R.id.buttonsecond) as Button
        btn2.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button two", Toast.LENGTH_SHORT).show()

        }
        var btn3=findViewById(R.id.buttonthird) as Button
        btn3.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button three", Toast.LENGTH_SHORT).show()

        }
        var btn4=findViewById(R.id.buttonfour) as Button
        btn4.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button four", Toast.LENGTH_SHORT).show()

        }
        var btn5=findViewById(R.id.buttonfive) as Button
        btn5.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button five", Toast.LENGTH_SHORT).show()

        }
        var btn6=findViewById(R.id.buttonsix) as Button
        btn6.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button six", Toast.LENGTH_SHORT).show()

        }
        var btn7=findViewById(R.id.buttonseven) as Button
        btn7.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button seven", Toast.LENGTH_SHORT).show()

        }
        var btn8=findViewById(R.id.buttoneight) as Button
        btn8.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button eight", Toast.LENGTH_SHORT).show()

        }
        var btn9=findViewById(R.id.buttonnine) as Button
        btn9.setOnClickListener{
            Toast.makeText( applicationContext,"u clicked button nine", Toast.LENGTH_SHORT).show()

        }
    }
}
