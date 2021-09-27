package com.example.qlm1

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Place
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Page(val route: String, val label: String, val icon: ImageVector) {
    object Home : Page("home", "Home", Icons.Outlined.Home)
    object Sub : Page("sub", "Sub", Icons.Outlined.Place)
    object Local : Page("local", "Local", Icons.Outlined.LocationOn)
    object Mine : Page("mine", "Mine", Icons.Outlined.Home)
}