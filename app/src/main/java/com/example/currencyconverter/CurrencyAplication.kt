package com.example.currencyconverter

import android.annotation.SuppressLint
import android.app.Application

class CurrencyAplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var prefs: Prefs
    }
    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}