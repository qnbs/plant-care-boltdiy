package com.example.plantcare.repository

    import com.example.plantcare.data.Plant
    import com.example.plantcare.data.PlantDatabase

    class PlantRepository(private val plantDatabase: PlantDatabase) {
      suspend fun insertPlant(plant: Plant) = plantDatabase.plantDao().insert(plant)
      suspend fun updatePlant(plant: Plant) = plantDatabase.plantDao().update(plant)
      suspend fun deletePlant(plant: Plant) = plantDatabase.plantDao().delete(plant)
      suspend fun getAllPlants() = plantDatabase.plantDao().getAllPlants()
    }
