package com.porfirio.ejercicio.tarea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.porfirio.ejercicio.R

class AlmacenDatosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacen_datos)

        val tvNameIn= findViewById<TextView>(R.id.tvNameIn)
        val tvLastnameIn = findViewById<TextView>(R.id.tvLastnameIn)
        val tvSexIn = findViewById<TextView>(R.id.tvSexIn)
        val tvEmailIn = findViewById<TextView>(R.id.tvEmailIn)
        val tvPassIn = findViewById<TextView>(R.id.tvPassIn)

        val name1 = intent.getStringExtra("EXTRA_NAMEIN")
        val lastname1=intent.getStringExtra("EXTRA_LASTNAMEIN")
        val genero1= intent.getStringExtra("EXTRA_SEXIN")
        val email1 = intent.getStringExtra("EXTRA_EMAIL")
        val pass1 = intent.getStringExtra("EXTRA_PASSIN")

        tvNameIn.text =name1
        tvLastnameIn.text = lastname1
        tvSexIn.text= genero1
        tvEmailIn.text = email1
        tvPassIn.text= pass1


        val btRegresar =findViewById<Button>(R.id.btRegresar)

        btRegresar.setOnClickListener {
            val returnIntent =Intent().apply {
                putExtra("EXTRA_IS_OK", true)
            }
            setResult(RESULT_OK, returnIntent)
            finish()
        }
    }
}
