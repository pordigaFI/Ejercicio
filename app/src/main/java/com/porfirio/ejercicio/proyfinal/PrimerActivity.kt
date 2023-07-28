package com.porfirio.ejercicio.proyfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.porfirio.ejercicio.R


class PrimerActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//El contentView estará en el layout activity_primer
        setContentView(R.layout.activity_primer)

//            Este es la activty principal donde se encuentran los fragments que van a estar intercambiandose
    }
}