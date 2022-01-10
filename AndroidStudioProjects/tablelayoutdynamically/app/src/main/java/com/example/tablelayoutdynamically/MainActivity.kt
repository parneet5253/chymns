package com.example.tablelayoutdynamically

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        init()

    }

    fun init() {
        val button = findViewById(R.id.button) as Button
        val button2 = findViewById(R.id.button2) as Button
        val tabLayout = findViewById(R.id.tablelayout) as TableLayout

         button2.setOnClickListener{
        tabLayout.removeAllViews()
        }

        button.setOnClickListener{
            val trow = TableRow(this)
            val tv4 = TextView(this)
            val tv5 = TextView(this)
            val tv6 = TextView(this)
            val tv7 = TextView(this)

            tv4.setText(" hii")
            tv4.setGravity(Gravity.CENTER)
            trow.addView(tv4)

            tv5.setText(" my")
            tv5.setGravity(Gravity.CENTER)
            trow.addView(tv5)

            tv6.setText(" name")
            tv6.setGravity(Gravity.CENTER)
            trow.addView(tv6)

            tv7.setText(" ooooo")
            tv7.setGravity(Gravity.CENTER)
            trow.addView(tv7)
            tabLayout.addView(trow)

        }

        val trow0 = TableRow(this)
        val tv0 = TextView(this)
        val tv1 = TextView(this)
        val tv2 = TextView(this)
        val tv3 = TextView(this)

        tv0.setText(" Sl.No ")
        tv0.setTextColor(Color.BLACK)
        trow0.addView(tv0)


        tv1.setText(" product ")
        tv1.setTextColor(Color.BLACK)
        trow0.addView(tv1)


        tv2.setText(" unitprice ")
        tv2.setTextColor(Color.BLACK)
        trow0.addView(tv2)


        tv3.setText(" stock remaining")
        tv3.setTextColor(Color.BLACK)
        trow0.addView(tv3)
        tabLayout.addView(trow0)






    }
}
