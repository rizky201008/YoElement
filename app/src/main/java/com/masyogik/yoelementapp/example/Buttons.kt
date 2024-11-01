package com.masyogik.yoelementapp.example

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.masyogik.yoelement.YButton
import com.masyogik.yoelement.YButtonGhost

@Composable
fun YButtonExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        YButton(
            text = "YButton",
            modifier = Modifier.fillMaxWidth()
        )
        YButtonGhost(
            text = "YButtonGhost",
            modifier = Modifier.fillMaxWidth(),
            containerColor = Color(0xFFFF0000),
            contentColor = Color(0xFFFFFFFF)
        )
    }
}

@Preview
@Composable
private fun YButtonExamplePreview() {
    YButtonExample()
}