package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.layout.*
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

@Composable
fun ScreenTitleView(title: String, isCentered: Boolean = false, size: Int = 24, top: Int = 20, bottom: Int = 20) {
    Column(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Spacer(Modifier.height(top.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f, fill = false),
            color = text,
            text = title,
            textAlign = if (isCentered) TextAlign.Center else TextAlign.Left,
            fontSize = size.sp,
            fontWeight = FontWeight.Bold,
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
