package com.example.plantcare.data

    import androidx.room.*

    @Dao
    interface PlantDao {
      @Insert
      suspend fun insert(plant: Plant)

      @Update
      suspend fun update(plant: Plant)

      @Delete
      suspend fun delete(plant: Plant)

      @Query("SELECT * FROM plants")
      suspend fun getAllPlants(): List<Plant>
    }
