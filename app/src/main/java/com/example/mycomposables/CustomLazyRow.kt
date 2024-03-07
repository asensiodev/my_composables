package com.example.mycomposables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomLazyRow(
    modifier: Modifier = Modifier,
    elementsList: List<DrawableStringPair> = alignYourBodyData
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(16.dp),
        modifier = modifier
    ) {
        items(elementsList) { item ->
            ImageAndFooterText(
                drawable = item.drawable, text = item.text
            )
        }
    }
}

val alignYourBodyData: List<DrawableStringPair> = listOf(
    R.drawable.ab1_inversions to R.string.subtitle_item_text,
    R.drawable.ab2_quick_yoga to R.string.subtitle_item_text,
    R.drawable.ab3_stretching to R.string.subtitle_item_text,
    R.drawable.ab4_tabata to R.string.subtitle_item_text,
    R.drawable.ab5_hiit to R.string.subtitle_item_text,
    R.drawable.ab6_pre_natal_yoga to R.string.subtitle_item_text
).map { DrawableStringPair(it.first, it.second) }

data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)
