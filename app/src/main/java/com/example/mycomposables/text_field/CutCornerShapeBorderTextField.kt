package com.example.mycomposables.text_field

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun CutCornerShapeBorderTextField(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    TextField(
        value = text,
        onValueChange = {
            onValueChange(it)
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent,
            disabledContainerColor = Color.Transparent
        ),
        modifier = modifier.border(
            border = BorderStroke(
                brush = Brush.linearGradient(
                    listOf(Color.Red, Color.Green, Color.Blue),
                    start = Offset(0.0f, 50.0f),
                    end = Offset(0.0f, 100.0f)
                ),
                width = 2.dp
            ),
            shape = CutCornerShape(12.dp)
        )
    )
}
