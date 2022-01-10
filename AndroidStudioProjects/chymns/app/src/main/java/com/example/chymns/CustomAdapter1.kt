package com.example.chymns

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CustomAdapter1  (context: Context, private val mList:ArrayList<ItemsViewModel1>):RecyclerView.Adapter<CustomAdapter1.ViewHolder>() {
    open var onNoteListener:OnNoteListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {


        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.compiled_hymns_design, parent, false)

        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: CustomAdapter1.ViewHolder, position: Int) {
        val ItemsViewModel1 = mList[position]


        holder.textView.text = ItemsViewModel1.text2
        holder.textView1.text = ItemsViewModel1.text3
    }

    override fun getItemCount(): Int {
        return mList.size
    }

        class ViewHolder(ItemView: View) :
            RecyclerView.ViewHolder(ItemView),View.OnClickListener {


            val textView: TextView = itemView.findViewById(R.id.textView8)
            val textView1: TextView = itemView.findViewById(R.id.textView9)

            init {
                itemView.setOnClickListener(this)
            }

            override fun onClick(p0: View?) {


            }


        }

        fun onClick(onNoteListener:OnNoteListener) {
            this.onNoteListener = onNoteListener
        }


        interface OnNoteListener {
            fun onNoteClick(position: Int)
        }

    }








