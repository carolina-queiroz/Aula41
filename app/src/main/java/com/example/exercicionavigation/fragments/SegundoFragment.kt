package com.example.exercicionavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.exercicionavigation.databinding.FragmentSegundoBinding

class SegundoFragment: Fragment() {

    private lateinit var binding: FragmentSegundoBinding
    private lateinit var doubleAenviar: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSegundoBinding.inflate(inflater, container, false)

        val args = SegundoFragmentArgs.fromBundle(requireArguments())
        binding.tvIntEBoolean.text =
            "O inteiro digitado foi ${args.intSent} e o booleano ${args.booleanSent} "

        binding.btnTerceiroFragmento.setOnClickListener {view: View ->
            this.doubleAenviar = binding.etDouble.text.toString()
            view.findNavController()
                .navigate(SegundoFragmentDirections.actionSegundoFragmentToTerceiroFragment())
        }

        binding.btnPrimeiroFragmento.setOnClickListener {view: View ->
            view.findNavController().navigate(SegundoFragmentDirections.actionSegundoFragmentToPrimeiroFragment())
        }

        return binding.root
    }
}
