package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnAge.setOnClickListener {
            btnAgeClick()
           }
    }


    fun btnAgeClick() {
        val dob=Integer.parseInt(etGetAge.text.toString())
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val userAgeInYears =currentYear-dob
        tvShowAge.text="Your Age is $userAgeInYears Years"

    }

//    fun btnAgeClick) {}
}