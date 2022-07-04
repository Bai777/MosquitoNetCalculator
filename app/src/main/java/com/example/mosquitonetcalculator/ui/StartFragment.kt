package com.example.mosquitonetcalculator.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mosquitonetcalculator.R
import com.example.mosquitonetcalculator.databinding.FragmentStartBinding
import kotlin.system.exitProcess


class StartFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentStartBinding? = null
    private val binding: FragmentStartBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonStart.setOnClickListener(this)
        binding.buttonExit.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.buttonStart->{
                MAIN.navController.navigate(R.id.action_startFragment_to_mainFragment)
            }
            R.id.buttonExit->{
                exitProcess(0)
            }
        }
    }
}