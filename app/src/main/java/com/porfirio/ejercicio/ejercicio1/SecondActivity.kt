package com.porfirio.ejercicio.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.porfirio.ejercicio.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val curso=intent.getStringExtra("EXTRA_CURSO")
        val name= intent.getStringExtra("EXTRA_NAME")
        val apellido= intent.getStringExtra("EXTRA_APELLIDO")
        val fechaIn= intent.getStringExtra("EXTRA_FECHA_INICIO")
        val fechaOut= intent.getStringExtra("EXTRA_FECHA_FIN")
        val costo= intent.getFloatExtra("EXTRA_COSTO",0.0f)
        val pagoTarjeta= intent.getBooleanExtra("EXTRA_TARJETA",false)


        val tvCurso = findViewById<TextView>(R.id.tvCurso)
        val tvNombre = findViewById<TextView>(R.id.tvNombre)
        val tvApellido = findViewById<TextView>(R.id.tvApellido)
        val tvFechaIn = findViewById<TextView>(R.id.tvFechaIn)
        val tvFechaOut = findViewById<TextView>(R.id.tvFechaOut)
        val tvCosto = findViewById<TextView>(R.id.tvCosto)
        val tvPagoTarjeta= findViewById<TextView>(R.id.tvPagoTarjeta)

        tvCurso.text=curso
        tvNombre.text=name
        tvApellido.text=apellido
        tvFechaIn.text=fechaIn
        tvFechaOut.text=fechaOut
        tvCosto.text= costo.toString()
        tvPagoTarjeta.text= pagoTarjeta.toString()

        val btBack =findViewById<Button>(R.id.btBack)

        btBack.setOnClickListener {
            val atrasIntent=Intent().apply {
                putExtra("EXTRA_IS_OK", true)
            }
            setResult(RESULT_OK,atrasIntent)
            finish()
        }
    }

}