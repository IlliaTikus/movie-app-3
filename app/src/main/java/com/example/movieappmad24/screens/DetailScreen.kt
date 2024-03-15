package com.example.movieappmad24.screens

import MovieDetail
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieappmad24.components.movie.MovieImage
import com.example.movieappmad24.components.movie.MovieRow
import com.example.movieappmad24.components.appbar.SimpleTopAppBar
import com.example.movieappmad24.models.getMovies

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController, movieId: String?) {

    //fetching
    val movie = getMovies().find { it.id == movieId } ?: return

    Scaffold(topBar = { SimpleTopAppBar(navController = navController, title = movie.title, Icons.Filled.ArrowBack) })
    { innerPadding -> MovieDetail(movie = movie, innerPadding = innerPadding)
    }
}