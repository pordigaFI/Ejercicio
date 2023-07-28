package com.porfirio.ejercicio.compGraficos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import com.porfirio.ejercicio.R
import com.porfirio.ejercicio.ejercicio1.FirstActivity

class FrameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame)

//    Ir a LinearLayout
   val btNext=findViewById<Button>(R.id.btNext)
   btNext.setOnClickListener {
   val intent1= Intent(this, LinearActivity::class.java)
   startActivity(intent1)
        }




    }
}