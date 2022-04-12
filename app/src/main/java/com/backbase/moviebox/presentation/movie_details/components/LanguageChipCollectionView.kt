package com.backbase.moviebox.presentation.movie_details.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.capitalize
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.backbase.moviebox.data.remote.dto.SpokenLanguage
import com.backbase.moviebox.theme.text
import com.google.accompanist.flowlayout.FlowRow
import java.util.*

@Composable
fun LanguageChipCollectionView(languages: List<SpokenLanguage>?) {
    FlowRow(mainAxisSpacing = 8.dp, crossAxisSpacing = 8.dp, modifier = Modifier.fillMaxWidth()) {
        languages?.forEach { item ->
            LanguageChipView(item.english_name)
        }
    }
}

@Composable
fun LanguageChipView(lan: String) {
    Box(
        modifier = Modifier
            .border(width = 1.dp, color = text, shape = RoundedCornerShape(4.dp))
            .padding(6.dp)
    ) {
        Text(text = lan.uppercase(Locale.getDefault()), color = text, textAlign = TextAlign.Center, fontSize = 14.sp)
    }
}

@Composable
@Preview
fun LanguageChipsPreview() {
    LanguageChipCollectionView(
        listOf(
            SpokenLanguage(english_name = "English"),
            SpokenLanguage(english_name = "French"),
            SpokenLanguage(english_name = "Russian")
        )
    )
}