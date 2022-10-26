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
import com.example.mosquitonetcalculator.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding get() = _binding!!
    private val adapter = MainAdapter(fillList())

    private fun fillList(): MutableList<GridModel> {
        val data = mutableListOf<GridModel>()
        (0..30).forEach { i -> data.add() }
        return data
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainScreenFragmentRecyclerView.adapter = adapter
        workWhitItemMenuInToolbar()
    }

    private fun workWhitItemMenuInToolbar() {
        binding.leftTopAppBarMainScreenFragment.inflateMenu(R.menu.menu_main_screen_add)
        binding.leftTopAppBarMainScreenFragment.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_add -> {
                    Toast.makeText(requireContext(), "Menu", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}