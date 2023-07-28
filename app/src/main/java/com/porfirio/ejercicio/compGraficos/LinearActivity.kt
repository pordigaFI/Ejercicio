package com.porfirio.ejercicio.compGraficos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.porfirio.ejercicio.R

class LinearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

//    Ir a RelativeLayout
    val btNext2=findViewById<Button>(R.id.btNext2)
    btNext2.setOnClickListener {
    val intent1= Intent(this, RelativeActivity::class.java)
    startActivity(intent1)
        }
    }
}