package com.example.mosquitonetcalculator.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.mosquitonetcalculator.R
import com.example.mosquitonetcalculator.adapter.MainAdapter
import com.example.mosquitonetcalculator.data.GridModel
import com.example.mosquitonetcalculator.databinding.FragmentBaseGridListBinding


class BaseGridListFragment : Fragment() {

    internal val adapter = MainAdapter()
    private var _binding: FragmentBaseGridListBinding? = null
    private val binding: FragmentBaseGridListBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBaseGridListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        burgerClick()
        setAdapter()
    }

    private fun setAdapter() {
        binding.gridScreenFragmentRecyclerView.adapter = adapter
    }

    private fun burgerClick() {
        adapter.setBurgerClickListener(object : OnBurgerClickListener{
            override fun onBurgerClick(view: View, task: GridModel) {
                Toast.makeText(requireContext(), "Click to burger", Toast.LENGTH_SHORT).show()
            }
        })
    }

    interface OnBurgerClickListener {
        fun onBurgerClick(view: View, task: GridModel)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}