package com.backbase.moviebox.domain.use_case.get_genres

import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.data.remote.dto.toGenres
import com.backbase.moviebox.data.remote.dto.toMovieDetails
import com.backbase.moviebox.data.remote.dto.toMovies
import com.backbase.moviebox.domain.model.Genre
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MovieDetail
import com.backbase.moviebox.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketException
import javax.inject.Inject

class GetMovieGenresUseCase @Inject constructor(
    private val repository: MovieRepository
){
    operator fun invoke() : Flow<Resource<List<Genre>>> = flow {
        try{
            emit(Resource.Loading<List<Genre>>())
            val genres = repository.getMovieGenres().toGenres()
            emit(Resource.Success<List<Genre>>(genres))
        } catch (e: HttpException){
            emit(Resource.Error<List<Genre>>(e.localizedMessage ?: "There is an exception occurred on HTTP Connection"))
        } catch (e: IOException){
            emit(Resource.Error<List<Genre>>(e.localizedMessage ?: "Couldn't connect to server. Please check the network connection"))
        } catch (e: SocketException){
            emit(Resource.Error<List<Genre>>(e.localizedMessage ?: "There is an exception occurred on Socket Connection"))
        }
    }
}