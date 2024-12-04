package com.mogun.movieinfoapp.ui.components.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mogun.movieinfoapp.features.common.entity.CategoryEntity
import com.mogun.movieinfoapp.features.feed.presentation.input.IFeedViewModelInput
import com.mogun.movieinfoapp.ui.theme.MovieInfoAppTheme
import com.mogun.movieinfoapp.ui.theme.Paddings
import com.mogun.movieinfoapp.ui.theme.h5Title

@Composable
fun CategoryRow(
    categoryEntity: CategoryEntity,
    input: IFeedViewModelInput
) {
    Column {
        CategoryTitle(categoryEntity.genre)
        LazyRow(
            contentPadding = PaddingValues(
                horizontal = Paddings.large
            )
        ) {
            itemsIndexed(categoryEntity.movieFeedEntities) { _, item ->
                MovieItem(
                    movie = item,
                    input = input
                )
            }
        }
    }
}

@Composable
fun CategoryTitle(genre: String) {
    Text(
        text = genre,
        modifier = Modifier.padding(
            vertical = Paddings.large,
            horizontal = Paddings.extra
        ),
        style = MaterialTheme.typography.h5Title,
    )
}