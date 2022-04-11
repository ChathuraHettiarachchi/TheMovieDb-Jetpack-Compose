package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.backbase.moviebox.theme.text

@Composable
fun ScreenTitle(title: String, isCentered: Boolean = false, size: Int = 24) {
    Column(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Spacer(Modifier.height(20.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            color = text,
            text = title,
            textAlign = if (isCentered) TextAlign.Center else TextAlign.Left,
            fontSize = size.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(20.dp))
    }
}

@Composable
@Preview
fun ScreenTitlePreview() {
    ScreenTitle("Playing now")
}

@Composable
@Preview
fun ScreenTitlePreviewCenter() {
    ScreenTitle("Playing now", true)
}
