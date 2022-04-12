package com.example.currencyconverter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.currencyconverter.CurrencyAplication.Companion.prefs

class CurrencyConverter : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_converter)

        val editTextDollarConver = findViewById<EditText>(R.id.editTextDollarConver)
        val btn_convert = findViewById<Button>(R.id.btn_convert)
        val txt_money_converter_result = findViewById<TextView>(R.id.txt_money_converter_result)
        val txt_money_convert = findViewById<TextView>(R.id.txt_money_convert)
        val actuality_euro_value = prefs.getEuroValue().toString()

        txt_money_convert.text = "Actuality: $1 USD = € $actuality_euro_value EUR"

        btn_convert.setOnClickListener {
            val dollar = editTextDollarConver.text.toString()
            val result = dollar.toFloat() * prefs.getEuroValue()
            result.toString()
            txt_money_converter_result.text = "$ $dollar USD son: € $result EUR"
        }
    }
}