package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.ComposeViewport
import coil3.compose.AsyncImage
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        AsyncImage(
            model = null,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
                .background(Color.Red)
        )
    }
}
