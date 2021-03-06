package com.backbase.moviebox.presentation.movie_details.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.backbase.moviebox.data.remote.dto.SpokenLanguage
import com.backbase.moviebox.domain.model.Genre
import com.backbase.moviebox.theme.genre
import com.backbase.moviebox.theme.genreText
import com.backbase.moviebox.theme.text
import com.google.accompanist.flowlayout.FlowRow
import java.util.*

/**
 * GenreChipCollection will use flowRow to populate and distribute all genres that are
 * available. If the width is not enough, it will expand the height
 *
 * @param genres will be the list of genres from the movie
 */
@Composable
fun GenreChipCollectionView(genres: List<Genre>?) {
    FlowRow(mainAxisSpacing = 8.dp, crossAxisSpacing = 8.dp, modifier = Modifier.fillMaxWidth()) {
        genres?.forEach { item ->
            GenreChipView(item.name)
        }
    }
}

/**
 * GenreChip view will act as a text holder for type of genre
 *
 * @param lan will be the text
 */
@Composable
fun GenreChipView(lan: String) {
    Card(
        backgroundColor = genre,
        shape = RoundedCornerShape(4.dp),
    ) {
        Row(Modifier.padding(6.dp)) {
            Text(text = lan.uppercase(Locale.getDefault()), color = genreText, textAlign = TextAlign.Center, fontSize = 14.sp)
        }
    }
}

@Composable
@Preview
fun GenreChipCollectionViewPreview() {
    GenreChipCollectionView(
        listOf(
            Genre(name = "Biography"),
            Genre(name = "Drama"),
            Genre(name = "Music")
        )
    )
}