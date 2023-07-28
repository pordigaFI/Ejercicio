package com.porfirio.ejercicio.compGraficos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.porfirio.ejercicio.R

class RelativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative)

//    Ir a ConstraintLayout
    val btNext3=findViewById<Button>(R.id.btNext3)
    btNext3.setOnClickListener {
    val intent1= Intent(this, ConstraintActivity::class.java)
    startActivity(intent1)
        }
    }
}