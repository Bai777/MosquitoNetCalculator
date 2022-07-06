package com.example.mosquitonetcalculator.data

data class GridModel(
    val id: Int,
    val width: Double,
    val height: Double,
    val grid: String,
    val canvas: String,
    val frameColor: String,
    val mounting: String,
    val amount: Int,
    val price: Double
)