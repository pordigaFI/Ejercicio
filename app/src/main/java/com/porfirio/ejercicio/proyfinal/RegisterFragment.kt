package com.porfirio.ejercicio.proyfinal

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.porfirio.ejercicio.R
import com.porfirio.ejercicio.databinding.FragmentRegisterBinding
//fragment correspondiente para un registro

class RegisterFragment : Fragment(R.layout.fragment_register) {
    private lateinit var binding : FragmentRegisterBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRegisterBinding.bind(view)

// al igual que con el login necesitamos declarar variables para almacenar el valor de las entradas del registro




        // nuevamente al darle al boton de registar cambiaremos a otra activity, igual que en el fragment de login
        binding.btRegistrar.setOnClickListener {

            val name = binding.etName.text
            val lastName = binding.etLastname.text
            val user = binding.etUser.text
            val clave = binding.etPassword.text

            if (user.isEmpty()){
                Snackbar.make(view,"Ingresa tu usuario",Snackbar.LENGTH_SHORT).show()
            }
            else if (clave.isEmpty()){
                Snackbar.make(view,"Ingresa tu password",Snackbar.LENGTH_SHORT).show()
            }
            else if (name.isEmpty()){
                Snackbar.make(view,"Ingresa tu nombre",Snackbar.LENGTH_SHORT).show()
            }
            else if (lastName.isEmpty()){
                Snackbar.make(view,"Ingresa tu apellido",Snackbar.LENGTH_SHORT).show()
            }
            else{
                val contactosintent = Intent(requireContext(),ContactosActivity::class.java)

                /*val intent= Intent(rquireContext(),RegistroActivity::class.java).apply {
                    putExtra("ARG_NAME", "$name")
                    putExtra("ARG_LASTNAME","$lastName")
                    putExtra("ARG_USUARIO","$user")
                    putExtra("ARG_CLAVE","$clave")
                }*/
                startActivity(contactosintent)
            }

        }
    }
    companion object {
        @JvmStatic
        fun newInstance()= RegisterFragment()
    }

}
