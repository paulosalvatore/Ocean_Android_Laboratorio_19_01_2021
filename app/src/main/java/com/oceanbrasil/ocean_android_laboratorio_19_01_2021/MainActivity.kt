package com.oceanbrasil.ocean_android_laboratorio_19_01_2021

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val NOME_DIGITADO = "NOME_DIGITADO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<EditText>(R.id.etNome)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btAbrirResultado = findViewById<Button>(R.id.btAbrirResultado)

        btEnviar.setOnClickListener {
            if (etNome.text.isNotBlank()) {
                tvResultado.text = getString(R.string.hello_name, etNome.text.toString())
            } else {
                etNome.error = getString(R.string.insert_your_name)
            }
        }

        btAbrirResultado.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)

            intent.putExtra(NOME_DIGITADO, etNome.text.toString())

            startActivity(intent)
        }
    }
}
