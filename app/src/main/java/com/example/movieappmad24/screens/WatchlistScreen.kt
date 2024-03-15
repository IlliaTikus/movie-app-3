package com.example.movieappmad24.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.movieappmad24.components.movie.MovieList
import com.example.movieappmad24.components.appbar.SimpleBottomAppBar
import com.example.movieappmad24.components.appbar.SimpleTopAppBar
import com.example.movieappmad24.models.getMovies

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WatchlistScreen(navController: NavController) {
    Scaffold(
        topBar = { SimpleTopAppBar(navController = navController, title = "Your watchlist") },
        bottomBar = { SimpleBottomAppBar(navController) }
    ) { innerPadding ->
        MovieList(
            modifier = Modifier.padding(innerPadding),
            movies = getMovies(),
            navController = navController
        )
    }
}