package com.porfirio.ejercicio.compGraficos

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener
import com.porfirio.ejercicio.R

class BotonesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_botones)

//    Intent implicito
        val ibUrl = findViewById<ImageButton>(R.id.ibUrl)

        ibUrl.setOnClickListener {
        val urlIntent= Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Liga_de_la_Justicia"))
        startActivity(urlIntent)
        }

//    Ir a RecyclerLayout
    /*val btNext5=findViewById<Button>(R.id.btNext5)
    btNext5.setOnClickListener {
         val intent1= Intent(this, RecyclerViewActivity::class.java)
         startActivity(intent1)
        }*/

        //CheckBox
        val cbCaja1=findViewById<CheckBox>(R.id.cbCaja1)

        cbCaja1.setOnCheckedChangeListener{ _, ischecked ->
            Toast.makeText(this,"ischecked = $ischecked", Toast.LENGTH_SHORT).show()
        }

        val cbCaja2=findViewById<CheckBox>(R.id.cbCaja2)

        cbCaja2.setOnCheckedChangeListener{ _, ischecked ->
            Toast.makeText(this,"ischecked = $ischecked", Toast.LENGTH_SHORT).show()
        }

        val cbCaja3=findViewById<CheckBox>(R.id.cbCaja3)

        cbCaja3.setOnCheckedChangeListener{ _, ischecked ->
            Toast.makeText(this,"ischecked = $ischecked", Toast.LENGTH_SHORT).show()
        }

        val cbCaja4=findViewById<CheckBox>(R.id.cbCaja4)

        cbCaja4.setOnCheckedChangeListener{ _, ischecked ->
            Toast.makeText(this,"ischecked = $ischecked", Toast.LENGTH_SHORT).show()
        }

//        RadioGroup
        val rgRadio1=findViewById<RadioGroup>(R.id.rgRadio1)
        rgRadio1.setOnCheckedChangeListener{_, checkedId ->
            Toast.makeText(this,"checkedId = $checkedId",Toast.LENGTH_SHORT).show()
        }

        //        Spinner
        val spLista=findViewById<Spinner>(R.id.spLista)
        val datos = arrayListOf("Superman","Wonder Woman", "Aquaman","Cyborg","Flash")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item,datos)

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spLista.adapter= adaptador
        spLista.onItemSelectedListener= object : OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val itemSelected= datos[position]
                Toast.makeText(this@BotonesActivity,"Item Seleccionado: $itemSelected", Toast.LENGTH_SHORT ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@BotonesActivity,"Nada seleccionado",Toast.LENGTH_SHORT).show()
            }
        }
    }
}


