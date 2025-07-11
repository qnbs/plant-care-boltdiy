package com.example.plantcare.ui.theme

    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable

    private val DarkColorPalette = darkColorScheme(
      primary = Purple200,
      secondary = Teal200
    )

    private val LightColorPalette = lightColorScheme(
      primary = Purple500,
      secondary = Teal200
    )

    @Composable
    fun PlantCareTheme(
      darkTheme: Boolean = isSystemInDarkTheme(),
      content: @Composable () -> Unit
    ) {
      val colors = if (darkTheme) {
        DarkColorPalette
      } else {
        LightColorPalette
      }

      MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
      )
    }
