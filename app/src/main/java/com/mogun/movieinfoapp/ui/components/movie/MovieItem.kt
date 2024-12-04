package com.mogun.movieinfoapp.ui.components.movie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Scale
import com.mogun.movieinfoapp.R
import com.mogun.movieinfoapp.features.common.entity.MovieFeedItemEntity
import com.mogun.movieinfoapp.features.feed.presentation.input.IFeedViewModelInput
import com.mogun.movieinfoapp.ui.theme.Paddings

private val CARD_WIDTH = 150.dp
private val ICON_SIZE = 12.dp

@Composable
fun MovieItem(
    movie: MovieFeedItemEntity,
    input: IFeedViewModelInput,
) {
    Column(
        modifier = Modifier
            .width(CARD_WIDTH)
            .padding(Paddings.large)
    ) {
        Poster(
            thumnailMovie = movie,
            input = input
        )

        Text(
            text = movie.title,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = Paddings.large),
            style = MaterialTheme.typography.bodyMedium
        )

        Row(
            modifier = Modifier.padding(vertical = Paddings.medium),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                modifier = Modifier
                    .padding(Paddings.small)
                    .size(ICON_SIZE),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_rating),
                contentDescription = "rating icon",
                tint = Color.Black.copy(
                    alpha = 0.5f
                )
            )
            Text(
                text = "${movie.rating}",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurface.copy(
                    alpha = 0.5f
                )
            )
        }
    }
}

@Composable
fun Poster(
    thumnailMovie: MovieFeedItemEntity,
    input: IFeedViewModelInput
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = {
            input.openDetail(
                thumnailMovie.title
            )
        }
    ) {
        Image(
            painter = rememberAsyncImagePainter(
                ImageRequest
                    .Builder(LocalContext.current)
                    .data(data = thumnailMovie.thumbUrl)
                    .apply {
                        crossfade(true)
                        scale(Scale.FILL)
                    }.build()
            ),
            modifier = Modifier.width(CARD_WIDTH).height(200.dp),
            contentScale = ContentScale.FillHeight,
            contentDescription = "Movie Poster Image"
        )
    }
}

