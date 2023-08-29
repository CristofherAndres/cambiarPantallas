package com.example.cambiarpantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarNombre(view: View) {

        //Evitar que nuestro codigo se caiga
        try {

            val nombre: String = findViewById<EditText>(R.id.etNombre).text.toString()

            if(nombre.isNotEmpty()){
                //Variable para llamar otra pantalla
                val intent = Intent(this,SegundaActivity::class.java)
                intent.putExtra("nombre",nombre)
                startActivity(intent)
            } else {
                Log.i("Nombre", "No se ingreso un nombre")
                Toast.makeText(this,"No has ingresado un nombre",Toast.LENGTH_LONG).show()
            }

        }catch (e: Exception) {
            //Mostrar el error
            Log.e("Error enviarNombre", e.message.toString())
        }

    }
}