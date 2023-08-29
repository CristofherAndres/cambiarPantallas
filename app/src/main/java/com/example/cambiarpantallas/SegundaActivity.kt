package com.example.cambiarpantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Activar el boton de regreso
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Evitar errores
        try {
            //Recibir el nombre desde el main
            val nombre: String = intent.getStringExtra("nombre").toString()
            //mostrar nombre en el log
            Log.i("Nombre", nombre)
            val saludo = findViewById<TextView>(R.id.tvSaludo)
            saludo.text = "Bienvenido $nombre"

        } catch (e: Exception) {
            //Mostrar el error
            Log.e("Error cambiarPantalla", e.message.toString())
        }

    }
}