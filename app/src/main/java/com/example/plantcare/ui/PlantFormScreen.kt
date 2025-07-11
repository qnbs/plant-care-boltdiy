package com.example.plantcare.ui

    import androidx.compose.material3.*
    import androidx.compose.runtime.*
    import androidx.compose.ui.tooling.preview.Preview
    import com.example.plantcare.data.Plant
    import com.example.plantcare.viewmodel.PlantViewModel

    @Composable
    fun PlantFormScreen(viewModel: PlantViewModel, onSave: (Plant) -> Unit) {
      var name by remember { mutableStateOf("") }
      var type by remember { mutableStateOf("") }
      var location by remember { mutableStateOf("") }
      var wateringInterval by remember { mutableStateOf(0) }
      var lightRequirements by remember { mutableStateOf("") }
      var soilType by remember { mutableStateOf("") }
      var lastCare by remember { mutableStateOf("") }
      var photoUri by remember { mutableStateOf<String?>(null) }
      var notes by remember { mutableStateOf("") }

      Column {
        OutlinedTextField(value = name, onValueChange = { name = it }, label = { Text("Name") })
        OutlinedTextField(value = type, onValueChange = { type = it }, label = { Text("Type") })
        OutlinedTextField(value = location, onValueChange = { location = it }, label = { Text("Location") })
        OutlinedTextField(value = wateringInterval.toString(), onValueChange = { wateringInterval = it.toIntOrNull() ?: 0 }, label = { Text("Watering Interval (days)") })
        OutlinedTextField(value = lightRequirements, onValueChange = { lightRequirements = it }, label = { Text("Light Requirements") })
        OutlinedTextField(value = soilType, onValueChange = { soilType = it }, label = { Text("Soil Type") })
        OutlinedTextField(value = lastCare, onValueChange = { lastCare = it }, label = { Text("Last Care") })
        OutlinedTextField(value = photoUri ?: "", onValueChange = { photoUri = it }, label = { Text("Photo URI") })
        OutlinedTextField(value = notes, onValueChange = { notes = it }, label = { Text("Notes") })
        Button(onClick = {
          val plant = Plant(name = name, type = type, location = location, wateringInterval = wateringInterval, lightRequirements = lightRequirements, soilType = soilType, lastCare = lastCare, photoUri = photoUri, notes = notes)
          viewModel.insertPlant(plant)
          onSave(plant)
        }) {
          Text("Save")
        }
      }
    }

    @Preview(showBackground = true)
    @Composable
    fun PlantFormScreenPreview() {
      PlantFormScreen(viewModel = PlantViewModel(PlantDatabase.getDatabase()), onSave = {})
    }
