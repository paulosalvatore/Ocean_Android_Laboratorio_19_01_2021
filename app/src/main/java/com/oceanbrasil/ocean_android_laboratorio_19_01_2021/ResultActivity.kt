package com.oceanbrasil.ocean_android_laboratorio_19_01_2021

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val nomeDigitado = intent.getStringExtra(MainActivity.NOME_DIGITADO)

        val textView = findViewById<TextView>(R.id.textView)

        textView.text = nomeDigitado

        val btEnviarResultado = findViewById<Button>(R.id.btEnviarResultado)

        btEnviarResultado.setOnClickListener {
            val intent = Intent()

            intent.putExtra("RESULTADO", "Botão de enviar resultado foi clicado!")

            setResult(Activity.RESULT_OK, intent)

            finish()
        }
    }
}
