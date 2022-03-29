package com.ocean_android_intro_29_03_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.text.TextUtils.isEmpty
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Inclua um textbox e ao digitar seu nome e clicar em button seu nome irá aparecer no textbox, caso não insira seu nome mostrar .error "digite seu nome" */
        val btEnviar = findViewById<Button>(R.id.btEnviar);
        val tvResultado = findViewById<TextView>(R.id.tvResultado);
        val editText = findViewById<EditText>(R.id.editName);


        btEnviar.setOnClickListener {
            val msg: String = editText.text.toString();

            if (msg.trim().length>0) {
                Toast.makeText(this@MainActivity, "Sucesso! " + msg, Toast.LENGTH_SHORT).show()
                tvResultado.text = msg;
            } else {
                Toast.makeText(this@MainActivity, "Digite seu nome!", Toast.LENGTH_SHORT).show()
                editText.setError("Digite seu nome!")
            }
        }





    }
}

