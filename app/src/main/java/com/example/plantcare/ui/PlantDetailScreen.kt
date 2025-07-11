package com.example.plantcare.ui

    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.tooling.preview.Preview
    import com.example.plantcare.data.Plant

    @Composable
    fun PlantDetailScreen(plant: Plant) {
      Column {
        Text(text = "Name: ${plant.name}")
        Text(text = "Type: ${plant.type}")
        Text(text = "Location: ${plant.location}")
        Text(text = "Watering Interval: ${plant.wateringInterval} days")
        Text(text = "Light Requirements: ${plant.lightRequirements}")
        Text(text = "Soil Type: ${plant.soilType}")
        Text(text = "Last Care: ${plant.lastCare}")
        plant.photoUri?.let {
          Image(painter = rememberImagePainter(it), contentDescription = null)
        }
        plant.notes?.let {
          Text(text = "Notes: $it")
        }
      }
    }

    @Preview(showBackground = true)
    @Composable
    fun PlantDetailScreenPreview() {
      PlantDetailScreen(Plant(name = "Ficus", type = "Indoor", location = "Living Room", wateringInterval = 7, lightRequirements = "Medium", soilType = "Well-draining", lastCare = "2023-10-01", photoUri = null, notes = "Needs more light"))
    }
