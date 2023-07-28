package com.porfirio.ejercicio.proyfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.porfirio.ejercicio.R
// Este activity sera en la cual vamos a recibir la informacion de nuestros fragments
class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
// aqui recibo los datos, ya sea del login o del registro, y los escribo en los textView correspondientes
        val name = intent.getStringExtra("ARG_NAME")
        val lastName = intent.getStringExtra("ARG_LASTNAME")
        val user = intent.getStringExtra("ARG_USUARIO")
        val pass = intent.getStringExtra("ARG_CLAVE")


        val tvName = findViewById<TextView>(R.id.tvNameData)
        val tvLastName = findViewById<TextView>(R.id.tvLastNameData)
        val tvUSer = findViewById<TextView>(R.id.tvUserData)
        val tvPass = findViewById<TextView>(R.id.tvPasswordData)


        tvName.text = name
        tvLastName.text  = lastName
        tvUSer.text = user
        tvPass.text = pass

    }
}