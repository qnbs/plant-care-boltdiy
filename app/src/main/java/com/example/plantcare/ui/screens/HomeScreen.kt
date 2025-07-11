package com.example.plantcare.ui.screens

    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.navigation.NavHostController

    @Composable
    fun HomeScreen(navController: NavHostController) {
      Scaffold(
        topBar = {
          TopAppBar(
            title = { Text("Plant Care") },
            actions = {
              IconButton(onClick = { /* Handle settings */ }) {
                Icon(Icons.Default.Settings, contentDescription = "Settings")
              }
            }
          )
        },
        bottomBar = {
          BottomNavigation {
            BottomNavigationItem(
              icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
              label = { Text("Home") },
              selected = true,
              onClick = { /* Handle home click */ }
            )
            BottomNavigationItem(
              icon = { Icon(Icons.Default.List, contentDescription = "Plants") },
              label = { Text("Plants") },
              selected = false,
              onClick = { navController.navigate("plants") }
            )
            BottomNavigationItem(
              icon = { Icon(Icons.Default.CalendarToday, contentDescription = "Calendar") },
              label = { Text("Calendar") },
              selected = false,
              onClick = { navController.navigate("calendar") }
            )
            BottomNavigationItem(
              icon = { Icon(Icons.Default.Settings, contentDescription = "Settings") },
              label = { Text("Settings") },
              selected = false,
              onClick = { navController.navigate("settings") }
            )
          }
        }
      ) {
        // Home screen content
      }
    }
