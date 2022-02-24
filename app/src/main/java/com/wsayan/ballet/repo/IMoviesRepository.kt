package com.wsayan.ballet.repo

import com.wsayan.ballet.db.entity.ImagesConfig
import com.wsayan.ballet.network.data.ConfigurationResponse
import com.wsayan.ballet.network.data.Images
import com.wsayan.ballet.network.data.MovieDetailsResponse
import com.wsayan.ballet.network.data.MovieListResponse
import kotlinx.coroutines.flow.Flow

interface IMoviesRepository {
    suspend fun fetchPopularMovies(): MovieListResponse
    suspend fun fetchPopularMovies(page: Int): MovieListResponse
    suspend fun fetchMovieDetails(id: Int): MovieDetailsResponse
    suspend fun fetchConfigurations(): ConfigurationResponse
    suspend fun insertImageConfig(images: Images)
    fun selectImageConfig(): Flow<ImagesConfig>
    fun isEmptyImageConfig(): Flow<Boolean>
    fun cacheImageBaseUrl(url: String)
    val imageBaseUrl: String
}