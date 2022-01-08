package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Tela2Activity2 : AppCompatActivity() {

    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela22)

        textView = findViewById(R.id.textView)

        val textoRecuperado = intent.getStringExtra("texto")
        textView.text = textoRecuperado
    }
}