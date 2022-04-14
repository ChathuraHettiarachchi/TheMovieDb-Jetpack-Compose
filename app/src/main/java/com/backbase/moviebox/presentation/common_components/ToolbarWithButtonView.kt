package com.backbase.moviebox.presentation.common_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.backbase.moviebox.theme.text

/**
 * Toolbar with close action
 *
 * @param title will be the text
 * @param onClick is the action needs to trigger on icon/button click
 */
@Composable
fun ToolbarWithButtonView(title: String = "Movie",onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 4.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        IconButton(onClick = onClick) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Close",
                Modifier.size(24.dp),
                tint = MaterialTheme.colors.onSurface
            )
        }
        ScreenTitleView(title = title, size = 20, weight = FontWeight.W400, paddingEnd = 16, bottom = 20)
    }
}

@Composable
@Preview
fun ToolbarWithButtonViewPreview() {
    ToolbarWithButtonView("Sonic the Hedgehog 2",{})
}