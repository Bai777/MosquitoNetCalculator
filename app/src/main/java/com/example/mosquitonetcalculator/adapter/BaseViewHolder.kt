package com.example.mosquitonetcalculator.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mosquitonetcalculator.data.GridModel

abstract class BaseViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    abstract fun bind(grid: GridModel)
}