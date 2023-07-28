package com.porfirio.ejercicio.proyfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.porfirio.ejercicio.R

class ContactosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)

        //        Spinner
        val spLista = findViewById<Spinner>(R.id.spListaContacts)
        val datos = arrayListOf("Superman", "Wonder Woman", "Aquaman", "Cyborg", "Flash")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, datos)

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spLista.adapter = adaptador
        spLista.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val itemSelected = datos[position]
                Toast.makeText(
                    this@ContactosActivity,
                    "Item Seleccionado: $itemSelected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@ContactosActivity, "Nada seleccionado", Toast.LENGTH_SHORT)
                    .show()
            }

        }
    }
}