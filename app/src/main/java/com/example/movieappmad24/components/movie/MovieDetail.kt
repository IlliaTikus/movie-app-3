import com.example.movieappmad24.models.Movie

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movieappmad24.components.movie.MovieImage
import com.example.movieappmad24.components.movie.MovieRow

@Composable
fun MovieDetail(movie: Movie, innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(innerPadding)) {
        MovieRow(modifier = Modifier.padding(), movie = movie) {
            // Handle MovieRow actions if necessary
        }

        LazyRow(
            modifier = Modifier
                .padding(20.dp)
                .height(200.dp)
        ) {
            items(movie.images.size) { item ->
                MovieImage(
                    imageUrl = movie.images[item],
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                )
            }
        }
    }
}
