package com.example.plantcare

    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.navigation.NavHostController
    import androidx.navigation.compose.NavHost
    import androidx.navigation.compose.composable
    import androidx.navigation.compose.rememberNavController
    import com.example.plantcare.ui.screens.*

    @Composable
    fun PlantCareApp() {
      val navController = rememberNavController()
      NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("plants") { PlantsScreen(navController) }
        composable("care") { CareScreen(navController) }
        composable("calendar") { CalendarScreen(navController) }
        composable("settings") { SettingsScreen(navController) }
      }
    }
