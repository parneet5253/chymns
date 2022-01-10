package com.example.framelayput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    	    var tabLayout: TabLayout? = null
    	    var frameLayout: FrameLayout? = null
    	    var fragment: Fragment? = null
        var fragmentManager: FragmentManager? = null
        var fragmentTransaction: FragmentTransaction? = null
        override fun onCreate(savedInstanceState: Bundle?) {
        	        super.onCreate(savedInstanceState)
        	        setContentView(R.layout.activity_main)

            tabLayout = findViewById(R.id.tabLayout) as TabLayout
            frameLayout = findViewById(R.id.frameLayout) as FrameLayout

        	        fragment = JavaFragment()
                fragmentManager = supportFragmentManager
        	        fragmentTransaction = fragmentManager!!.beginTransaction()
        	        fragmentTransaction!!.replace(R.id.frameLayout, fragment as JavaFragment)
        	        fragmentTransaction!!.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                fragmentTransaction!!.commit()
        	        //adding listener for tab select
        	        tabLayout!!.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            	            override fun onTabSelected(tab: TabLayout.Tab) {
                // creating cases for fragment
                           when (tab.position) {
                                      0 -> fragment = JavaFragment()
                                        1 -> fragment = KotlinFragment()
                    	                    2-> fragment = PhpFragment()

                                    }
                              val fm = supportFragmentManager
                val ft = fm.beginTransaction()
                               ft.replace(R.id.frameLayout, fragment!!)
                	                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                      ft.commit()
                	            }

                    override fun onTabUnselected(tab: TabLayout.Tab) {

                          }

                    override fun onTabReselected(tab: TabLayout.Tab) {

                           }
                  })

            }
    }



