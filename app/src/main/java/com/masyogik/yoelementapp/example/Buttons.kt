package com.masyogik.yoelementapp.example

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
        YButton(text = "YButton", width = 300.dp)
        YButtonGhost(text = "YButtonGhost", width = 300.dp)
    }
}