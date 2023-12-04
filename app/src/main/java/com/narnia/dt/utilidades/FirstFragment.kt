package com.narnia.dt.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class FirstFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val button = view.findViewById<Button>(R.id.button_first)
        val button2 = view.findViewById<Button>(R.id.button_fourth)
        val data = view.findViewById<TextView>(R.id.data)

        val receivedData = ""

        val imageoption = view.findViewById<ImageView>(R.id.optionimg)

        imageoption.setOnClickListener{
            Toast.makeText(requireContext(), "~En Construccion~ ", Toast.LENGTH_SHORT).show()

        }

        if(receivedData.isNotEmpty())
        {
            data.text = receivedData
        }

        button.setOnClickListener{

           val navController : NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
        button2.setOnClickListener{

            val navController : NavController = Navigation.findNavController(view)
            navController.navigate(R.id.action_firstFragment_to_fourthFragment)
        }

        return view
    }


}