package com.masyogik.yoelement

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun YButton(
    width: Dp = 100.dp, // Width of the button
    backgroundColor: Color = MaterialTheme.colorScheme.primary, // Background color of the button
    textColor: Color = MaterialTheme.colorScheme.onPrimary, // Text color of the button
    text: String = "Button", // Text of the button
    shape: Shape = MaterialTheme.shapes.medium, // Shape of the button
    onClick: () -> Unit = {} // Click listener of the button
) {
    val padding = if (width > 100.dp) 10.dp else width / 10
    Box(
        modifier = Modifier
            .width(width)
            .clip(shape)
            .clickable { onClick() }
            .background(color = backgroundColor, shape = shape)
            .padding(padding),
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = textColor, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun YButtonGhost(
    width: Dp = 100.dp, // Width of the button
    textColor: Color = MaterialTheme.colorScheme.primary, // Text color of the button
    text: String = "Button", // Text of the button
    shape: Shape = MaterialTheme.shapes.medium, // Shape of the button
    onClick: () -> Unit = {} // Click listener of the button
) {
    val padding = if (width > 100.dp) 10.dp else width / 10
    Box(
        modifier = Modifier
            .width(width)
            .clip(shape)
            .clickable { onClick() }
            .background(color = Color.Transparent, shape = shape)
            .padding(padding),
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = textColor, fontWeight = FontWeight.Bold)
    }
}