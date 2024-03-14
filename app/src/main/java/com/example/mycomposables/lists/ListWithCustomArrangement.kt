package com.example.mycomposables.lists

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.example.mycomposables.R
import com.example.mycomposables.card.CustomCard

@Composable
fun ListWithCustomArrangement(
    modifier: Modifier = Modifier,
    elementsList: List<DataPair> = listData
) {
    LazyColumn(
        modifier = modifier.fillMaxHeight(),
        verticalArrangement = TopWithFooter
    ) {

        items(elementsList) { item ->
            CustomCard(
                drawable = item.drawable,
                text = item.text,
                modifier = Modifier.padding(5.dp)
            )
        }


    }

}

object TopWithFooter : Arrangement.Vertical {
    override fun Density.arrange(
        totalSize: Int, // viewport height. Available space that can be occupied by the children, in pixels
        sizes: IntArray, // An array of sizes of all children, in pixels
        outPositions: IntArray // Calculated starting positions of each item relative to the top, in pixels
    ) {
        // position items one after another
        var yAxisPosition = 0
        sizes.forEachIndexed { index, size ->
            outPositions[index] = yAxisPosition
            yAxisPosition += size
        }

        // position footer if viewport height is not reached
        if (yAxisPosition < totalSize) {
            val lastIndex = outPositions.lastIndex
            outPositions[lastIndex] = totalSize - sizes.last()
        }
    }
}

val listData: List<DataPair> = listOf(
    R.drawable.ab1_inversions to R.string.sampleText,
    R.drawable.ab2_quick_yoga to R.string.sampleText,
    R.drawable.ab3_stretching to R.string.sampleText,
    R.drawable.ab4_tabata to R.string.sampleText,
    R.drawable.ab5_hiit to R.string.sampleText,
    R.drawable.ab6_pre_natal_yoga to R.string.sampleText
).map { DataPair(it.first, it.second) }

data class DataPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)