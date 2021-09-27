package com.example.qlm1.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun StatusBarPlaceHolder() {
    Spacer(modifier = Modifier.size(43.dp))
}

@Composable
fun IconLabel(size:Dp,icon: ImageVector,iconSize:Dp, label: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(size = size)
    ) {
        Icon(imageVector = icon, contentDescription = label,modifier = Modifier.size(iconSize))
        Text(text = label)
    }
}