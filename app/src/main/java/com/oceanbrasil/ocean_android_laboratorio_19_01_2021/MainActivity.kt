package com.oceanbrasil.ocean_android_laboratorio_19_01_2021

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etNome = findViewById<EditText>(R.id.etNome)

        btEnviar.setOnClickListener {
//            tvResultado.text = "Olá, Paulo Salvatore!"
            if (etNome.text.isNotBlank()) {
                tvResultado.text = "Olá, ${etNome.text}!"
            } else {
                etNome.error = "Digite um nome..."
            }
        }
    }
}
