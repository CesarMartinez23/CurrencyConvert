package com.example.currencyconverter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_yes = findViewById<Button>(R.id.btn_yes)
        val btn_no = findViewById<Button>(R.id.btn_no)

        btn_yes.setOnClickListener {
            val intent = Intent(this, ChangeValueEuro::class.java)
            startActivity(intent)
        }

        btn_no.setOnClickListener {
            val intent = Intent(this, CurrencyConverter::class.java)
            startActivity(intent)
        }
    }
}