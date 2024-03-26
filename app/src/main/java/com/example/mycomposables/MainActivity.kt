package com.example.mycomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposables.canvas.InsetCanvas
import com.example.mycomposables.canvas.MultipleTransformCanvas
import com.example.mycomposables.canvas.PlaygroundCanvas
import com.example.mycomposables.canvas.RotateCanvas
import com.example.mycomposables.canvas.ScaleCanvas
import com.example.mycomposables.canvas.TranslateCanvas
import com.example.mycomposables.card.CustomCard
import com.example.mycomposables.lists.ListWithCustomArrangement
import com.example.mycomposables.text_field.CursorBrushTextField
import com.example.mycomposables.text_field.CustomDecorationBoxTextField
import com.example.mycomposables.text_field.CutCornerShapeBorderTextField
import com.example.mycomposables.ui.theme.MyComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposablesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListWithCustomArrangement(modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun CustomCardPreview() {
    MyComposablesTheme {
        CustomCard(
            drawable = R.drawable.fc4_self_massage,
            text = R.string.sampleText,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun ImageAndFooterTextPreview() {
    MyComposablesTheme {
        ImageAndFooterText(
            drawable = R.drawable.fc4_self_massage,
            text = R.string.sampleText,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun CustomLazyRowPreview() {
    MyComposablesTheme {
        CustomLazyRow(elementsList = alignYourBodyData)
    }
}

@Preview(showSystemUi = true, showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun ListWithCustomArrangementPreview() {
    MyComposablesTheme {
        ListWithCustomArrangement(modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun CutCornerShapeBorderTextFieldPreview() {
    MyComposablesTheme {
        CutCornerShapeBorderTextField(
            text = "This is some sample text",
            onValueChange = {},
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun CursorBrushTextFieldPreview() {
    MyComposablesTheme {
        CursorBrushTextField(
            text = "This is some sample text",
            onValueChange = {},
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun CustomDecorationBoxTextFieldPreview() {
    MyComposablesTheme {
        CustomDecorationBoxTextField(
            text = "This is some sample text",
            onValueChange = {},
            modifier = Modifier.padding(2.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun PlaygroundCanvasPreview() {
    PlaygroundCanvas()
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun ScaleCanvasPreview() {
    ScaleCanvas()
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun TranslateCanvasPreview() {
    TranslateCanvas()
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun RotateCanvasPreview() {
    RotateCanvas()
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun InsetCanvasPreview() {
    InsetCanvas()
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun MultipleTransformCanvasPreview() {
    MultipleTransformCanvas()
}