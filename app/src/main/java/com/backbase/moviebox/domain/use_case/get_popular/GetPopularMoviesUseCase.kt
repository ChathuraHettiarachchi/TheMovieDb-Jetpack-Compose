package com.backbase.moviebox.domain.use_case.get_popular

import com.backbase.moviebox.common.Resource
import com.backbase.moviebox.data.remote.dto.toMovies
import com.backbase.moviebox.data.remote.dto.toPage
import com.backbase.moviebox.domain.model.Movie
import com.backbase.moviebox.domain.model.MoviePage
import com.backbase.moviebox.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.net.SocketException
import javax.inject.Inject

class GetPopularMoviesUseCase @Inject constructor(
    private val repository: MovieRepository
){
    operator fun invoke(pageId: Int) : Flow<Resource<MoviePage>> = flow {
        try{
            emit(Resource.Loading<MoviePage>())
            val page = repository.getPopularMovies(pageNumber = pageId).toPage()
            emit(Resource.Success<MoviePage>(page))
        } catch (e: HttpException){
            emit(Resource.Error<MoviePage>(e.localizedMessage ?: "There is an exception occurred on HTTP Connection"))
        } catch (e: IOException){
            emit(Resource.Error<MoviePage>(e.localizedMessage ?: "Couldn't connect to server. Please check the network connection"))
        } catch (e: SocketException){
            emit(Resource.Error<MoviePage>(e.localizedMessage ?: "There is an exception occurred on Socket Connection"))
        }
    }
}