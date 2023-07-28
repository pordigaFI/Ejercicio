package com.porfirio.ejercicio.tarea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.porfirio.ejercicio.R

class FormularioActivity : AppCompatActivity() {

   /* private val register = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                if (result.data?.getBooleanExtra("EXTRA_IS_ACTIVITY_BACK", false) == true) {
                    onBackPressedDispatcher.onBackPressed()
                } else {
                    Toast.makeText(this, "resultcode = ${result.resultCode} EXTRA_IS_OK = ${result.data?.getBooleanExtra("EXTRA_IS_OK",false )}", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "CANCELLED", Toast.LENGTH_SHORT).show()
            }
        }*/



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        val etNameIn = findViewById<EditText>(R.id.etNameIn)
        val etLastnameIn = findViewById<EditText>(R.id.etLastnameIn)
        val etSexIn = findViewById<EditText>(R.id.etSexIn)
        val etEmailIn = findViewById<EditText>(R.id.etEmailIn)
        val etPassIn = findViewById<EditText>(R.id.etPassIn)
        val btRegistrar = findViewById<Button>(R.id.btRegistrar)

        val nomb= etNameIn.text
        val apell= etLastnameIn.text
        val gene= etSexIn.text
        val corre=etEmailIn.text
        val pas= etPassIn.text


        btRegistrar.setOnClickListener {
            val registroIntent = Intent(this, AlmacenDatosActivity::class.java).apply {
                putExtra("EXTRA_NAMEIN", "$nomb")
                putExtra("EXTRA_LASTNAMEIN", "$apell")
                putExtra("EXTRA_SEXIN", "$gene")
                putExtra("EXTRA_EMAIL", "$corre")
                putExtra("EXTRA_PASSIN", "$pas")
            }
            startActivity(registroIntent)
            //register.launch(registroIntent)
        }
    }
}





