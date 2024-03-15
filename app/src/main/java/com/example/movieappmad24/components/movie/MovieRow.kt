package com.example.movieappmad24.components.movie

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movieappmad24.models.Movie

@Composable
fun MovieRow(
    modifier: Modifier,
    movie: Movie,
    onItemClick: (String) -> Unit = {}
    ){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                onItemClick(movie.id)
            }
            .padding(10.dp),
        shape = ShapeDefaults.Large,
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column {

            MovieCardHeader(imageUrl = movie.images[0])

            MovieDescription(modifier = Modifier.padding(12.dp), movie = movie)

        }
    }
}