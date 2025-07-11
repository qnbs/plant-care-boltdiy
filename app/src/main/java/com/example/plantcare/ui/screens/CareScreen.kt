package com.example.plantcare.ui.screens

    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.navigation.NavHostController

    @Composable
    fun CareScreen(navController: NavHostController) {
      Scaffold(
        topBar = {
          TopAppBar(
            title = { Text("Care Tips") },
            navigationIcon = {
              IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
              }
            }
          )
        }
      ) {
        // Care tips screen content
      }
    }
