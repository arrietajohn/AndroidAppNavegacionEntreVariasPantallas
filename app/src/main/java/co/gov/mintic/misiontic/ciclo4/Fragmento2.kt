package co.gov.mintic.misiontic.ciclo4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation
import co.gov.mintic.misiontic.ciclo4.R


class Fragmento2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragmento2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var contoladorNav = Navigation.findNavController(view)
        var botonAtras = view.findViewById<Button>(R.id.btnAtras2)
        var botonSiguiente = view.findViewById<Button>(R.id.btnSiguiente2)

        botonAtras.setOnClickListener {
            atras(contoladorNav)
        }

        botonSiguiente.setOnClickListener {
            siguiente(contoladorNav)
        }

    }

    fun siguiente(control : NavController){
        control.navigate(R.id.fragmento1)
    }

    fun atras(control : NavController){
        control.navigate(R.id.fragmentoMenu)
    }

}