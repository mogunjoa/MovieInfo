package com.mogun.movieinfoapp.features.detail.presentation.output

import com.mogun.movieinfoapp.features.common.entity.MovieDetailEntity


sealed class MovieDetailState {
    object Initial : MovieDetailState()
    class Main(val movieDetailEntity: MovieDetailEntity) : MovieDetailState()
}
