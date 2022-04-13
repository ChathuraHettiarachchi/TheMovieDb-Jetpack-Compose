package com.backbase.moviebox.domain.use_case.get_details

import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.data.remote.dto.toMovieDetails
import com.backbase.moviebox.data.remote.dto.toMovies
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MovieDetail
import com.backbase.moviebox.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketException
import javax.inject.Inject

/**
 * GetMovieDetailsUseCase is used to get movieDetails
 * Have used kotlin flow and will emit results from time to time
 */
class GetMovieDetailsUseCase @Inject constructor(
    private val repository: MovieRepository
){
    /**
     * Used kotlin operator function, so it's corresponding member function is called automatically
     *
     * @param movie will be movie id
     */
    operator fun invoke(movie: Long) : Flow<Resource<MovieDetail>> = flow {
        try{
            emit(Resource.Loading<MovieDetail>())
            val details = repository.getMovieDetails(id = movie).toMovieDetails()
            emit(Resource.Success<MovieDetail>(details))
        } catch (e: HttpException){
            emit(Resource.Error<MovieDetail>(e.localizedMessage ?: "There is an exception occurred on HTTP Connection"))
        } catch (e: IOException){
            emit(Resource.Error<MovieDetail>(e.localizedMessage ?: "Couldn't connect to server. Please check the network connection"))
        } catch (e: SocketException){
            emit(Resource.Error<MovieDetail>(e.localizedMessage ?: "There is an exception occurred on Socket Connection"))
        } catch (e: Exception){
            emit(Resource.Error<MovieDetail>(e.localizedMessage ?: "Something went wrong"))
        }
    }
}