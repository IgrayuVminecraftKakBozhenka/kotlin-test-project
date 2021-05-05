package com.IgrayuVminecraftKakBozhenka.kotlintestproject

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val beginButton = findViewById<Button>(R.id.beginButton)
        beginButton.setOnClickListener {
            val intent = Intent(this, Questions::class.java)
            startActivity(intent)
        }




    }


}