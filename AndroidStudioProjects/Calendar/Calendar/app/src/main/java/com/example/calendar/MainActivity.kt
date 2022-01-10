package com.example.calendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.applandeo.materialcalendarview.EventDay
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

val recyclerView=findViewById<RecyclerView>(R.id.event_recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)

        val n = CalendarEvent()
        val rest = arrayListOf<Calendar>()

        rest.add(n.t(2022, 0, 11))
        rest.add(n.t(2022, 0, 12))
        rest.add(n.t(2022, 0, 13))
        rest.add(n.t(2022, 0, 14))
        rest.add(n.t(2022, 0, 15))
        rest.add(n.t(2022, 0, 16))
        rest.add(n.t(2022, 0, 17))

        rest.add(n.t(2022, 0, 18))
        rest.add(n.t(2022, 0, 19))
        rest.add(n.t(2022, 0, 20))

        val events: ArrayList<EventDay> = ArrayList()

        for (i in rest) {

            events.add(EventDay(i, R.drawable.new_resource))

        }

        val calender = findViewById<com.applandeo.materialcalendarview.CalendarView>(R.id.calendar)
        calender.setEvents(events)
        val z = ArrayList<CalendarDataModelClass>()
z.add(CalendarDataModelClass("Holi", dateFormat(rest.get(0))))
        z.add(CalendarDataModelClass("DiwaYearli", dateFormat(rest.get(1))))
        z.add(CalendarDataModelClass("BhaiDooj", dateFormat(rest.get(2))))
        z.add(CalendarDataModelClass("Christmas", dateFormat(rest.get(3))))
        z.add(CalendarDataModelClass("New", dateFormat(rest.get(4))))
        z.add(CalendarDataModelClass("Holi", dateFormat(rest.get(5))))

        val adap =CalendarAdapter(this,z)
recyclerView.adapter=adap

calender.setOnDayClickListener {

    Toast.makeText(applicationContext,"${dateFormat(rest.get(0))}",Toast.LENGTH_SHORT).show()

}

    }


    fun dateFormat(cal:Calendar):String{

        return cal.time.toString()

    }

}
//it.calendar.time