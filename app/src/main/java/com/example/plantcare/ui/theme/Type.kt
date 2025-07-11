package com.example.plantcare.ui.theme

    import androidx.compose.material3.Typography
    import androidx.compose.ui.text.font.FontFamily
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.unit.sp

    val Typography = Typography(
      bodyLarge = androidx.compose.material3.Typography.bodyLarge.copy(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
      )
    )
