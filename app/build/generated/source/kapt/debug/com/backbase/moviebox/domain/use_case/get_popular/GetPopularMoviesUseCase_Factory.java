// Generated by Dagger (https://dagger.dev).
package com.backbase.moviebox.domain.use_case.get_popular;

import com.backbase.moviebox.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetPopularMoviesUseCase_Factory implements Factory<GetPopularMoviesUseCase> {
  private final Provider<MovieRepository> repositoryProvider;

  public GetPopularMoviesUseCase_Factory(Provider<MovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetPopularMoviesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetPopularMoviesUseCase_Factory create(
      Provider<MovieRepository> repositoryProvider) {
    return new GetPopularMoviesUseCase_Factory(repositoryProvider);
  }

  public static GetPopularMoviesUseCase newInstance(MovieRepository repository) {
    return new GetPopularMoviesUseCase(repository);
  }
}