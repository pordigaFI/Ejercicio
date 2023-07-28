package com.porfirio.ejercicio.proyfinal

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.porfirio.ejercicio.R
import com.porfirio.ejercicio.databinding.FragmentContactsBinding

//        Spinner
/*val spLista=findViewById<Spinner>(R.id.spLista)
val datos = arrayListOf("Superman","Wonder Woman", "Aquaman","Cyborg","Flash")
val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item,datos)

adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
spLista.adapter= adaptador
spLista.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
    override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val itemSelected = datos[position]
        Toast.makeText(this@fragment_contacts"Item Seleccionado: $itemSelected", Toast.LENGTH_SHORT)
            .show()
    }
}*/

class ContactsFragment : Fragment(R.layout.fragment_contacts) {

    private lateinit var binding : FragmentContactsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentContactsBinding.bind(view)

        //      al dar click en continuar nos debe de mandar a otra activity, por lo que mandaremos la informacion con un intent
        binding.btFragNext.setOnClickListener {

            //       declaramos variables para poder almacenar los valores de los inputs
            val contact = binding.tvContacto.text
            val phone = binding.tvPhone.text
            val mail = binding.tvMail.text

            val intent = Intent(requireContext(), MensajesActivity::class.java).apply {
                    putExtra("ARG_CONTACTS", "$contact")
                    putExtra("ARG_PHONE", "$phone")
                    putExtra("ARG_MAIL", "$mail")
                }
                startActivity(intent)
            }

        binding.tvEditContact.setOnClickListener {
            val Mensajesintent=Intent(requireContext(),EditContactsActivity::class.java)
        }
/*
        //        Spinner
        val spListacontactos = findViewById<Spinner>(R.id.spListaContacts)
        val datos = arrayListOf("Superman", "Wonder Woman", "Aquaman", "Cyborg", "Flash")
        val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, datos)

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spListacontactos.adapter = adaptador
        spListacontactos.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val itemSelected = datos[position]
                Toast.makeText(
                    this@ContactsFragment,
                    "Item Seleccionado: $itemSelected",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@ContactsFragment, "Nada seleccionado", Toast.LENGTH_SHORT)
                    .show()
            }*/

        }




    companion object {
        @JvmStatic
        fun newInstance()= ContactsFragment()
    }
}