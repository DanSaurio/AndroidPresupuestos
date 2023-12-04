package com.narnia.dt.utilidades

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation

class SecondFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val buttona = view.findViewById<Button>(R.id.button_second_a)

        val buttonb = view.findViewById<Button>(R.id.button_second_b)

        val Imagesave = view.findViewById<ImageView>(R.id.SaveImg)

        Imagesave.setOnClickListener{
            Toast.makeText(requireContext(), "~Se Guardo Correctamente~ ", Toast.LENGTH_SHORT).show()

        }


        buttona.setOnClickListener{

            val navController : NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }
        buttonb.setOnClickListener{

            val navController : NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        return view
    }


}