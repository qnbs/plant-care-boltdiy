package com.example.plantcare.viewmodel

    import androidx.lifecycle.ViewModel
    import androidx.lifecycle.viewModelScope
    import com.example.plantcare.data.Plant
    import com.example.plantcare.data.PlantDatabase
    import kotlinx.coroutines.launch

    class PlantViewModel(private val plantDatabase: PlantDatabase) : ViewModel() {
      fun insertPlant(plant: Plant) = viewModelScope.launch {
        plantDatabase.plantDao().insert(plant)
      }

      fun updatePlant(plant: Plant) = viewModelScope.launch {
        plantDatabase.plantDao().update(plant)
      }

      fun deletePlant(plant: Plant) = viewModelScope.launch {
        plantDatabase.plantDao().delete(plant)
      }

      fun getAllPlants() = plantDatabase.plantDao().getAllPlants()
    }
