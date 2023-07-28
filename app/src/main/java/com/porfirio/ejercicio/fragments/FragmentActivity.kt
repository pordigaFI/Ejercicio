package com.porfirio.ejercicio.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.porfirio.ejercicio.R

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }
}