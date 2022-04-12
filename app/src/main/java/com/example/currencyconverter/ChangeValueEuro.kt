package com.example.currencyconverter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.currencyconverter.CurrencyAplication.Companion.prefs

class ChangeValueEuro : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_value_euro)

        val editText_change_value_euro = findViewById<EditText>(R.id.editText_change_value_euro)
        val btn_change_value_euro = findViewById<Button>(R.id.btn_change_value_euro)
        val txt_actuality_value_euro = findViewById<TextView>(R.id.txt_actuality_value_euro)
        val actuality_euro_value = prefs.getEuroValue().toString()

        txt_actuality_value_euro.text = "$1 USD = € $actuality_euro_value EUR"

        btn_change_value_euro.setOnClickListener {
            val value = editText_change_value_euro.text.toString().toFloat()
            prefs.saveEuroValue(value)
            val intent = Intent(this, CurrencyConverter::class.java)
            startActivity(intent)
        }
    }
}