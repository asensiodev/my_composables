package com.example.mycomposables.text_field

import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Composable
fun CursorBrushTextField(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    val gradientColors = listOf(Color.Green, Color.Yellow, Color.Red)

    BasicTextField(
        value = text,
        onValueChange = {
            onValueChange(it)
        },
        cursorBrush = Brush.linearGradient(gradientColors)
    )
}