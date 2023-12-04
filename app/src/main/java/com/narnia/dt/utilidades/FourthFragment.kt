package com.narnia.dt.utilidades

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.floatingactionbutton.FloatingActionButton


class FourthFragment : Fragment() {

    private  var countries : List<Country> = emptyList()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        val fab = view.findViewById<FloatingActionButton>(R.id.fab_new)

        fab.setOnClickListener{
            val bottomSheetDialog = BottomSheetDialog(view.context)
            val parentView: View = layoutInflater.inflate(R.layout.bsd_new_country , null)
            bottomSheetDialog.setContentView(parentView)
            bottomSheetDialog.show()
        }

        initData()
        var recyclerView = view.findViewById<RecyclerView>(R.id.countriesRecycler)
        //Lista Anchura Completa
        val  layoutManager = LinearLayoutManager(container?.context)
        //cuadricula 2x2
        //val gridLayoutManager = GridLayoutManager(container?.context,)

        val adapter = CountryAdapter(countries)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
        return view
    }
    public fun initData(){
        countries = listOf(
            Country(1,"Comida",
                "Despensa",
                "https://1.bp.blogspot.com/-RF6yU6w7_SA/X4YIMX-JCdI/AAAAAAAADQk/HG0t86EyvQAtaby6BL1gXgf5tAtBoIkmgCLcBGAsYHQ/s256/PORT2.png",
                "https://i.pinimg.com/originals/45/16/3e/45163ed431b7b42a60c74f3f41e8f363.jpg",
                "Control De Gasto"),
            Country(2,"Hobbies",
                "Gustos Propios",
                "https://promoferi.com/wp-content/uploads/2015/04/SOC-011-07.jpg",
                "https://static.13.cl/7/sites/default/files/esports/articulos/field-image/gaming-2_orig.jpg",
                "Ahorro"),
            Country(3,"Cosas Importantes",
                "Impuestos",
                "https://th.bing.com/th/id/OIP.90wK4ihVa9BtTe75q8h31gAAAA?w=225&h=225&rs=1&pid=ImgDetMain",
                "https://img.freepik.com/vector-gratis/hombre-negocios-da-bolsa-dinero-otro-vector-empresario_39663-155.jpg?w=360",
                "Control Financiero"),
            Country(4,"Otros",
                "Para Cariñosas",
                "https://th.bing.com/th/id/OIP.4syG9Pjio-nI0affNV2x9QHaHe?rs=1&pid=ImgDetMain",
                "https://th.bing.com/th/id/OIP.2BGITyKYWS1VaNqJHqAPowAAAA?rs=1&pid=ImgDetMain",
                "Control Financiero"),
            Country(5,"Cosas Importantes",
                "Estudios",
                "https://promoferi.com/wp-content/uploads/2015/04/SOC-011-07.jpg",
                "https://th.bing.com/th/id/OIP.sYaHldLVQZfZQmQOoEuWwAHaE_?rs=1&pid=ImgDetMain",
                "Ahorro"),
            Country(6,"Cosas Importantes",
                "Seguro Medico",
                "https://th.bing.com/th/id/OIP.90wK4ihVa9BtTe75q8h31gAAAA?w=225&h=225&rs=1&pid=ImgDetMain",
                "https://th.bing.com/th/id/OIP.fODArW6KS1qNI3USSrj0KQHaE3?rs=1&pid=ImgDetMain",
                "Ahorro"),
            Country(7,"Cosas Importantes",
                "Emergencias",
                "https://th.bing.com/th/id/OIP.90wK4ihVa9BtTe75q8h31gAAAA?w=225&h=225&rs=1&pid=ImgDetMain",
                "https://th.bing.com/th/id/R.f2e6bb9afdac8219b83aa65a6aa10db4?rik=UB7LjXdcbJ67Sw&riu=http%3a%2f%2fsindifisco-ac.org.br%2fwp-content%2fuploads%2f2018%2f07%2fimportante.png&ehk=ZVKpjBl%2bd%2bmnFR8pN693mz9dzjxATlBqKsgbbm8aQjc%3d&risl=&pid=ImgRaw&r=0&sres=1&sresct=1",
                "Ahorro"),

        )


    }
}