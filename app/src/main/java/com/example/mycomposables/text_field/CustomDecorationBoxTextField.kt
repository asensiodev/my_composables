package com.example.mycomposables.text_field

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomDecorationBoxTextField(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier
) {
    BasicTextField(
        value = text,
        onValueChange = {
            onValueChange(it)
        },
        decorationBox = { innerTextField ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.LightGray)
                    .padding(5.dp)
            ) {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = "account")
                innerTextField()
            }
        },
        modifier = modifier
    )
}

