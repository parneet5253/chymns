package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var seekBarNormal: SeekBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        	        var seekBarNormal= findViewById(R.id.seekbar_Default) as SeekBar


              seekBarNormal?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            	            override fun onProgressChanged(seekBar: SeekBar, progress: Int,
            	                                           fromUser: Boolean) {

            	                Toast.makeText(applicationContext, "seekbar progress: $progress", Toast.LENGTH_SHORT).show()
            	            }

                        override fun onStartTrackingTouch(seekBar: SeekBar) {


                                Toast.makeText(applicationContext, "seekbar touch started!", Toast.LENGTH_SHORT).show()
                	            }

                      override fun onStopTrackingTouch(seekBar: SeekBar) {


                                Toast.makeText(applicationContext, "seekbar touch stopped!", Toast.LENGTH_SHORT).show()
        	            }
        	        })




            }
    	}
