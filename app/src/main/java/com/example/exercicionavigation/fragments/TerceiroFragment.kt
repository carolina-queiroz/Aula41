package com.example.exercicionavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.exercicionavigation.R
import com.example.exercicionavigation.databinding.FragmentTerceiroBinding

class TerceiroFragment : Fragment() {
    private lateinit var binding: FragmentTerceiroBinding
    private lateinit var stringAenvar: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTerceiroBinding.inflate(inflater, container, false)

        val args = TerceiroFragmentArgs.fromBundle(requireArguments())
        binding.tvDouble.text = "O número decimal digitado foi ${args.float}"

        binding.btnPrimeiroFragmento.setOnClickListener { view: View ->
            this.stringAenvar = binding.etString.text.toString()
            view.findNavController()
                .navigate(TerceiroFragmentDirections.actionTerceiroFragmentToPrimeiroFragment())
        }

        binding.btnSegundoFragmento.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(TerceiroFragmentDirections.actionTerceiroFragmentToSegundoFragment())
        }
        return binding.root
    }
}