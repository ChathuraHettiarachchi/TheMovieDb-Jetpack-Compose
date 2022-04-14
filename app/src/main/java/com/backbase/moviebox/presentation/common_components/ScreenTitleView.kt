package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.backbase.moviebox.theme.text

/**
 * ScreenTitleView, will used to display main headings of the application
 *
 * @param title will be the text
 * @param isCentered used to center the text, default is false and left align
 * @param size will be the font size
 * @param top top margin
 * @param bottom bottom margin
 * @param weight fontWeight of the title
 * @param paddingStart will be the padding from start of text
 * @param paddingEnd will be the padding from end of title
 */
@Composable
fun ScreenTitleView(
    title: String,
    isCentered: Boolean = false,
    size: Int = 24,
    top: Int = 20,
    bottom: Int = 20,
    weight: FontWeight = FontWeight.Bold,
    paddingStart: Int = 0,
    paddingEnd: Int = 0
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Spacer(Modifier.height(top.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = false)
                .padding(start = paddingStart.dp, end = paddingEnd.dp),
            color = MaterialTheme.colors.onSurface,
            text = title,
            textAlign = if (isCentered) TextAlign.Center else TextAlign.Left,
            fontSize = size.sp,
            fontWeight = weight,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(Modifier.height(bottom.dp))
    }
}

@Composable
@Preview
fun ScreenTitlePreview() {
    ScreenTitleView("Playing now")
}

@Composable
@Preview
fun ScreenTitlePreviewCenter() {
    ScreenTitleView("Playing now", true)
}
