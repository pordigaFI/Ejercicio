package com.porfirio.ejercicio.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.porfirio.ejercicio.R

class FirstActivity : AppCompatActivity() {

    private val register= registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result ->
        if(result.resultCode== RESULT_OK){
            if (result.data?.getBooleanExtra("EXTRA_IS_ACTIVITY_BACK", false)==true){
                onBackPressedDispatcher.onBackPressed()
            }else{
                Toast.makeText(this,"resultCode = ${result.resultCode} EXTRA_IS_OK=${result.data?.getBooleanExtra("EXTRA_IS_OK",false)}", Toast.LENGTH_SHORT).show()
            }
        }else{
            Toast.makeText(this,"CANCELLED",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btCallSecond = findViewById<Button>(R.id.btCallSecond)

        btCallSecond.setOnClickListener {
            val secondIntent= Intent(this,SecondActivity::class.java).apply{
                putExtra("EXTRA_CURSO","Diseño App para Dispositivos Móviles")
                putExtra("EXTRA_NAME", "Porfirio")
                putExtra("EXTRA_APELLIDO", "Diaz Garcia")
                putExtra("EXTRA_FECHA_INICIO","28 abril del 2023")
                putExtra("EXTRA_FECHA_FIN","09 de diciembre de 2023")
                putExtra("EXTRA_COSTO",18543.25f)
                putExtra("EXTRA_TARJETA", true)
            }
            register.launch(secondIntent)
        }

    }
}