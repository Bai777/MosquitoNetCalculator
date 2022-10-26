package com.example.mosquitonetcalculator.data

interface Repository {
    fun getItems(): List<GridModel>
    fun addItem(gridModel: GridModel): List<GridModel>
}