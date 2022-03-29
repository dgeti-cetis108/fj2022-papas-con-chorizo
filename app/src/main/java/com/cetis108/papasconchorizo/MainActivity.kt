package com.cetis108.papasconchorizo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        saludar("Hola plebes del 6AVPR")

        var btnSaludar = findViewById<Button>(R.id.buttonMainSaludar)
        // Reto: cambia el nombre mostrado del boton por Saludar!
        // de BUTTON a Saludar!
        btnSaludar.text = "Saludar!"
        btnSaludar.setOnClickListener {
            Toast.makeText(this, "Hola Toast", Toast.LENGTH_LONG).show()
        }
    }

    fun saludar(mensaje: String) {
        // R se refiere a la carpeta res
        findViewById<TextView>(R.id.textViewMainSaludo).text = mensaje
    }
}