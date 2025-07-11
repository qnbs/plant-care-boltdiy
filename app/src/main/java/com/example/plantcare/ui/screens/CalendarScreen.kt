package com.example.plantcare.ui.screens

    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.navigation.NavHostController

    @Composable
    fun CalendarScreen(navController: NavHostController) {
      Scaffold(
        topBar = {
          TopAppBar(
            title = { Text("Calendar") },
            navigationIcon = {
              IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
              }
            }
          )
        }
      ) {
        // Calendar screen content
      }
    }
