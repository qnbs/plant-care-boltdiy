package com.example.plantcare

    import android.app.Application
    import com.example.plantcare.data.PlantDatabase
    import com.example.plantcare.repository.PlantRepository
    import com.example.plantcare.viewmodel.PlantViewModel

    class PlantApplication : Application() {
      lateinit var plantDatabase: PlantDatabase
      lateinit var plantRepository: PlantRepository
      lateinit var plantViewModel: PlantViewModel

      override fun onCreate() {
        super.onCreate()
        plantDatabase = PlantDatabase.getDatabase(applicationContext)
        plantRepository = PlantRepository(plantDatabase)
        plantViewModel = PlantViewModel(plantDatabase)
      }
    }
