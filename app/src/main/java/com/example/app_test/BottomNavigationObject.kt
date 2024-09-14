package com.example.app_test

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationObjects(
    val title: String,
    val route: String,
    val icon: ImageVector
){

    object searchScreen: BottomNavigationObjects(
        route ="search",
        title = "Search",
        icon = Icons.Default.Search
    )
    object appointmentScreen: BottomNavigationObjects(
        route ="home",
        title = "home",
        icon = Icons.Default.Home
    )
    object exploreScreen: BottomNavigationObjects(
        route = "explore",
        title = "Explore",
        icon = Icons.Default.Face
    )
    object profileScreen: BottomNavigationObjects(
        route = "profile",
        title = "Profile",
        icon =Icons.Default.AccountCircle
    )
}