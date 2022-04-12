package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.backbase.moviebox.theme.text

@Composable
fun ToolbarWithButtonView(title: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onClick) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Close",
                Modifier.size(24.dp),
                tint = text
            )
        }
        ScreenTitleView(title = title, size = 20, weight = FontWeight.W400)
    }
}

@Composable
@Preview
fun ToolbarWithButtonViewPreview() {
    ToolbarWithButtonView("Sonic the Hedgehog 2", {})
}