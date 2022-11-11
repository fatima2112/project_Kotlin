package com.example.favoritemovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo = findViewById<Button>(R.id.btnGo) //Relaciona el botón con la variable

        //Metodo del botón btnGo, cuando es presionado
        btnGo.setOnClickListener{
            val intent = Intent(this, Movie::class.java)    //Se crea un Intent relacionando con la clase Movie.kt
            startActivity(intent) //Lanza el Intent
            overridePendingTransition(R.anim.animation, R.anim.animation) //Se toma la animación de los recursos, como entrada y salida
        }

    }
}