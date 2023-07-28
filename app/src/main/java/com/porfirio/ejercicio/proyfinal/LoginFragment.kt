package com.porfirio.ejercicio.proyfinal

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.porfirio.ejercicio.R
import com.porfirio.ejercicio.databinding.FragmentLoginBinding
import com.porfirio.ejercicio.ejercicio1.FirstActivity

// este es el primer fragmento correspondiente al login
class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding : FragmentLoginBinding
/*
        //    Ir a la activity1
        val btCallActivity1=findViewById<Button>(R.id.btCallActivity1)
        btCallActivity1.setOnClickListener {
            val intent1=Intent(this, FirstActivity::class.java)
            startActivity(intent1)
        }*/


   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       super.onViewCreated(view, savedInstanceState)

       binding = FragmentLoginBinding.bind(view)


//      al dar click en continuar nos debe de mandar a otra activity, por lo que mandaremos la informacion con un intent
       binding.btContinuar.setOnClickListener {

           //       declaramos variables para poder almacenar los valores de los inputs
           val user = binding.etUser.text
           val clave = binding.etPassword.text

           if (user.isEmpty()){
               Snackbar.make(view,"Ingresa tu usuario", Snackbar.LENGTH_SHORT).show()
           }
           else if (clave.isEmpty()){
               Snackbar.make(view,"Ingresa tu password",Snackbar.LENGTH_SHORT).show()
           }
           else {

               val contactosintent =Intent(requireContext(),ContactosActivity::class.java)
              /* val intent = Intent(requireContext(), RegistroActivity::class.java).apply {
                   putExtra("ARG_USUARIO", "$user")
                   putExtra("ARG_CLAVE", "$clave")*/
               startActivity(contactosintent)
               }

           }

       // si se selecciona la opcion de "aún no tienes cuenta" sustituimos el fragmento de loginFrgament por el de Register
           binding.tvCuenta.setOnClickListener {
               parentFragmentManager.beginTransaction()
                   .replace(R.id.fragmentContainerLogin, RegisterFragment.newInstance())
                   .addToBackStack("RegisterFragment") //Se modifica el contenido de ContentViewLogin para que el usuario se registre.
                   .commit()
           }

       }

       companion object {
           @JvmStatic
           fun newInstance()= LoginFragment()
           }

       }


