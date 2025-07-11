package com.example.plantcare.data

    import androidx.room.Entity
    import androidx.room.PrimaryKey

    @Entity(tableName = "plants")
    data class Plant(
      @PrimaryKey(autoGenerate = true) val id: Int = 0,
      val name: String,
      val type: String,
      val location: String,
      val wateringInterval: Int,
      val lightRequirements: String,
      val soilType: String,
      val lastCare: String,
      val photoUri: String?,
      val notes: String?
    )
