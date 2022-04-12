package com.example.currencyconverter

import android.annotation.SuppressLint
import android.content.Context

class Prefs(val context: Context) {

    val SHARED_NAME = "currency_converter"
    val SHARED_EURO_VALUE = "euro_value"

    val storage = context.getSharedPreferences(SHARED_NAME, 0)

    @SuppressLint("CommitPrefEdits")
    fun saveEuroValue(value: Float) {
        storage.edit().putFloat(SHARED_EURO_VALUE, value).apply()
    }

    fun getEuroValue(): Float {
        return storage.getFloat(SHARED_EURO_VALUE, 0.92f)
    }
}