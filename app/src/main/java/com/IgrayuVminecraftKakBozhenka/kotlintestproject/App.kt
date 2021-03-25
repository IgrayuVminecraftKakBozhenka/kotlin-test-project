package com.IgrayuVminecraftKakBozhenka.kotlintestproject

import android.app.Application
import android.util.Log

class App : Application() {


    override fun onCreate() {
        super.onCreate()
        Log.d("MyTag", "My message")

    }
}