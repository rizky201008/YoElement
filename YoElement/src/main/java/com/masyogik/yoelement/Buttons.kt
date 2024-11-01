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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun YButton(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.primary, // Background color of the button,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    textStyle: TextStyle = TextStyle(), // Text color of the button
    text: String = "Button", // Text of the button
    shape: Shape = MaterialTheme.shapes.medium, // Shape of the button
    onClick: () -> Unit = {} // Click listener of the button
) {
    Box(
        modifier = modifier
            .clip(shape)
            .clickable { onClick() }
            .background(color = containerColor, shape = shape)
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = textStyle.copy(color = contentColor, fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
fun YButtonGhost(
    modifier: Modifier = Modifier,
    containerColor: Color = MaterialTheme.colorScheme.primary, // Background color of the button,
    contentColor: Color = MaterialTheme.colorScheme.onPrimary,
    textStyle: TextStyle = TextStyle(), // Text color of the button
    text: String = "Button", // Text of the button
    shape: Shape = MaterialTheme.shapes.medium, // Shape of the button
    onClick: () -> Unit = {} // Click listener of the button
) {
    Box(
        modifier = modifier
            .clip(shape)
            .clickable { onClick() }
            .background(color = containerColor, shape = shape)
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = textStyle.copy(color = contentColor, fontWeight = FontWeight.Bold)
        )
    }
}