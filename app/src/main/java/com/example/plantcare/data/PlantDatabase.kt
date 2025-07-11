package com.example.plantcare.data

    import android.content.Context
    import androidx.room.Room

    object PlantDatabase {
      private var INSTANCE: PlantDatabase? = null

      fun getDatabase(context: Context): PlantDatabase {
        return INSTANCE ?: synchronized(this) {
          val instance = Room.databaseBuilder(
            context.applicationContext,
            PlantDatabase::class.java,
            "plant_database"
          ).build()
          INSTANCE = instance
          instance
        }
      }
    }
