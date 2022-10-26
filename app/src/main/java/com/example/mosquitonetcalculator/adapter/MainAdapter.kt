package com.example.mosquitonetcalculator.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mosquitonetcalculator.data.GridModel
import com.example.mosquitonetcalculator.databinding.MainScreenRecyclerItemBinding
import com.example.mosquitonetcalculator.ui.BaseGridListFragment

class MainAdapter(dataList: MutableList<GridModel>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
//    private var dataList: MutableList<GridModel> = mutableListOf()
    private var burgerListener: BaseGridListFragment.OnBurgerClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = MainScreenRecyclerItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(dataList[position])
    }
    override fun getItemCount(): Int = dataList.size

    inner class MainViewHolder(private val itemBinding: MainScreenRecyclerItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
       fun bind(grid: GridModel) {
           itemBinding.apply {
               titleGridScreen.text = grid.name
               burgerMainScreen.setOnClickListener {
                   burgerListener?.onBurgerClick(itemBinding.burgerMainScreen, grid)
               }
           }
        }
    }

    fun setBurgerClickListener(param: BaseGridListFragment.OnBurgerClickListener) {
        this.burgerListener = param
    }

    fun setData(data: List<GridModel>) {
        dataList = data.toMutableList()
        notifyDataSetChanged()
    }
}


