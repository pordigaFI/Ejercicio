package com.porfirio.ejercicio.compGraficos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.porfirio.ejercicio.R

class ConstraintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

//    Ir a BotonesActivity
    val btNext4=findViewById<Button>(R.id.btNext4)
    btNext4.setOnClickListener {
        val intent1= Intent(this, BotonesActivity::class.java)
        startActivity(intent1)
        }
    }
}