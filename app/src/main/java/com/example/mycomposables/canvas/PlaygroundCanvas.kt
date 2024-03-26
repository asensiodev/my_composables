package com.example.mycomposables.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.unit.dp

@Composable
fun PlaygroundCanvas() {
    Canvas(
        modifier = Modifier.fillMaxSize(),
        onDraw = {
            drawCircle(
                Color.Green,
                center = Offset(20.dp.toPx(), 100.dp.toPx()),
                radius = 100.dp.toPx()
            )
        }
    )
}

@Composable
fun ScaleCanvas() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        scale(scaleX = 10f, scaleY = 15f) {
            drawCircle(Color.Green, radius = 20.dp.toPx())
        }
    }
}

@Composable
fun TranslateCanvas() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        translate(left = 100f, top = -300f) {
            drawCircle(Color.Green, radius = 200.dp.toPx())
        }
    }
}

@Composable
fun RotateCanvas() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        rotate(degrees = 45f) {
            drawRect(
                Color.Green,
                topLeft = Offset(
                    x = size.width / 3F,
                    y = size.height / 3F
                ),
                size = size / 3F
            )
        }
    }
}

@Composable
fun InsetCanvas() {
    Canvas(
        modifier = Modifier.fillMaxSize()
    ) {
        val quadrantSize = size / 2F
        inset(horizontal = 50f, vertical = 30f) {
            drawRect(Color.Green, size = quadrantSize)
        }
    }
}