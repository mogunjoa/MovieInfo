package com.mogun.movieinfoapp.features.common.mapper

import com.mogun.movieinfoapp.features.common.entity.EntityWrapper
import com.mogun.movieinfoapp.library.network.model.ApiResponse
import com.mogun.movieinfoapp.library.network.model.ApiResult

abstract class BaseMapper<M, E> {

    fun mapFromResult(result: ApiResult<M>, extra: Any? = null): EntityWrapper<E> =
        when (result.response) {
            is ApiResponse.Success -> getSuccess(model = result.response.data, extra = extra)
            is ApiResponse.Fail -> getFailure(error = result.response.error)
        }

    abstract fun getSuccess(model: M?, extra: Any?): EntityWrapper.Success<E>

    abstract fun getFailure(error: Throwable): EntityWrapper.Fail<E>
}
