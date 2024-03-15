package com.example.movieappmad24.components.appbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.movieappmad24.navigation.Screen

@Composable
fun SimpleBottomAppBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route

    NavigationBar {
        NavigationBarItem(
            label = { Text("Home") },
            selected = currentDestination == Screen.HomeScreen.route,
            onClick = {
                if (currentDestination != Screen.HomeScreen.route) {
                    navController.navigate(Screen.HomeScreen.route)
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Go to home"
                )
            }
        )

        NavigationBarItem(
            label = { Text("Watchlist") },
            selected = currentDestination == Screen.WatchlistScreen.route,
            onClick = {
                if (currentDestination != Screen.WatchlistScreen.route) {
                    navController.navigate(Screen.WatchlistScreen.route)
                }
            },
            icon = {
                Icon(
                    imageVector = Icons.Filled.Star,
                    contentDescription = "Go to watchlist"
                )
            }
        )
    }
}
