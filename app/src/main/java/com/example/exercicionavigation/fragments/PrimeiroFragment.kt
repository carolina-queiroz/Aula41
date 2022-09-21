package com.example.exercicionavigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.exercicionavigation.databinding.FragmentPrimeiroBinding

class PrimeiroFragment : Fragment() {

    private lateinit var binding: FragmentPrimeiroBinding
    private var intAenviar: Int = 0
    private var booleanAenviar: Boolean = false


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrimeiroBinding.inflate(inflater, container, false)

        val args = PrimeiroFragmentArgs.fromBundle(requireArguments())
        binding.tvString.text = "${args.string}"


        binding.btnTerceiroFragmento.setOnClickListener {view: View ->
            view.findNavController().navigate(PrimeiroFragmentDirections.actionPrimeiroFragmentToTerceiroFragment())
        }

        binding.btnSegundoFragmento.setOnClickListener { view: View ->
            this.intAenviar = binding.etInt.text.toString().toInt()
            this.booleanAenviar = binding.etBoolean.text.toString().toBoolean()
            view.findNavController()
                .navigate(PrimeiroFragmentDirections.actionPrimeiroFragmentToSegundoFragment(intAenviar, booleanAenviar))
        }
    return binding.root
}
}