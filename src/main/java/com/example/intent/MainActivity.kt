package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        editText = findViewById(R.id.editTextTextPersonName)

        button.setOnClickListener{
            val intent = Intent(applicationContext, Tela2Activity2::class.java)
            val params = Bundle()
            val textoDigitado = editText.text.toString()
            params.putString("texto", textoDigitado)
            intent.putExtras(params)
            startActivity(intent)
        }
    }
}