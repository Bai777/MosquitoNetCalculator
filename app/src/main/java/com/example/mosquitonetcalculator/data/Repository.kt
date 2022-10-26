package com.example.mosquitonetcalculator.data

interface Repository {
    fun getItems(): List<GridModel>
    fun addItem(): List<GridModel>
}