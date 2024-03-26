package com.backbase.moviebox.domain.use_case.get_playing_now

import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.data.remote.dto.toMovies
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketException
import javax.inject.Inject

/**
 * GetNowPlayingMoviesUseCase is used to get now playing movies
 * Have used kotlin flow and will emit results from time to time
 */
class GetNowPlayingMoviesUseCase @Inject constructor(
    private val repository: MovieRepository
){
    /**
     * Used kotlin operator function, so it's corresponding member function is called automatically
     */
    operator fun invoke() : Flow<Resource<List<Movie>>> = flow {
        try{
            emit(Resource.Loading<List<Movie>>())
            val movies = repository.getNowPlayingMovies().toMovies()
            emit(Resource.Success<List<Movie>>(movies))
        } catch (e: HttpException){
            emit(Resource.Error<List<Movie>>(e.localizedMessage ?: "There is an exception occurred on HTTP Connection"))
        } catch (e: IOException){
            emit(Resource.Error<List<Movie>>(e.localizedMessage ?: "Couldn't connect to server. Please check the network connection"))
        } catch (e: SocketException){
            emit(Resource.Error<List<Movie>>(e.localizedMessage ?: "There is an exception occurred on Socket Connection"))
        } catch (e: Exception){
            emit(Resource.Error<List<Movie>>(e.localizedMessage ?: "Something went wrong"))
        }
    }
}