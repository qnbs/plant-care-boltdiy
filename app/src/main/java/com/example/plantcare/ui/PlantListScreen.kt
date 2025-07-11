package com.example.plantcare.ui

    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.livedata.observeAsState
    import androidx.lifecycle.viewmodel.compose.viewModel
    import com.example.plantcare.viewmodel.PlantViewModel

    @Composable
    fun PlantListScreen(viewModel: PlantViewModel = viewModel()) {
      val plants = viewModel.getAllPlants().observeAsState(emptyList())
      LazyColumn {
        items(plants.value) { plant ->
          Text(text = plant.name)
        }
      }
    }
