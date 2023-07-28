package com.porfirio.ejercicio.ejercicio1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.porfirio.ejercicio.R

class ejercicioActivity : AppCompatActivity() {

//    Metodo onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio)
        Toast.makeText(this,"Estoy en el método onCreate",Toast.LENGTH_SHORT).show()

//    Intent implicito
    val btUrl = findViewById<Button>(R.id.btUrl)

    btUrl.setOnClickListener {
        val urlIntent= Intent(Intent.ACTION_VIEW, Uri.parse("https://www.apple.com/"))
        startActivity(urlIntent)
    }

//    Ir a la activity1
    val btCallActivity1=findViewById<Button>(R.id.btCallActivity1)
    btCallActivity1.setOnClickListener {
        val intent1=Intent(this, FirstActivity::class.java)
        startActivity(intent1)
    }

    }

//    Metodo onStart
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"Estoy en el método onStart",Toast.LENGTH_SHORT).show()
    }

//    Metodo onResume
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Estoy en el método onResume",Toast.LENGTH_SHORT).show()
    }

//      Metodo onPause
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"Estoy en el método onPause",Toast.LENGTH_SHORT).show()
    }

//      Metodo onStop
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"Estoy en el método onStop",Toast.LENGTH_SHORT).show()
    }

//      Metodo onDestroy
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"Estoy en el método onDestroy",Toast.LENGTH_SHORT).show()
    }

//    Metodo onRestart
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Estoy en el método onRestart",Toast.LENGTH_SHORT).show()
    }


}