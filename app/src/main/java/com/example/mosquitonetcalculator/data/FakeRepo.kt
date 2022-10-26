package com.example.mosquitonetcalculator.data

class FakeRepo {
    private val list: MutableList<GridModel> = mutableListOf(
        GridModel(0, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(1, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(2, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(3, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(4, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(5, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(6, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(7, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(8, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(9, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
        GridModel(10, "Grid", 0.5, 0.5, "Normal", "white", "white", "Normal", 0, 0.0),
    )

    fun getList(): List<GridModel> {
        return list
    }

    fun addItem(grid: GridModel): List<GridModel> {
        list.add(grid)
        return list
    }
}