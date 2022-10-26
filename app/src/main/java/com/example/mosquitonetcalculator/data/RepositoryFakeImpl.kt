package com.example.mosquitonetcalculator.data

class RepositoryFakeImpl(private val repo: FakeRepo = FakeRepo()) : Repository {
    override fun getItems(): List<GridModel> {
        return repo.getList()
    }

    override fun addItem(gridModel: GridModel): List<GridModel> {
        return repo.addItem(gridModel)
    }
}