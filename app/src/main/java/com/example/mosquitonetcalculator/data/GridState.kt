package com.example.mosquitonetcalculator.data

sealed class GridState {
    data class Success(val data: List<GridModel>) : GridState()
    class Error(val error: Throwable) : GridState()
    object Loading : GridState()
}