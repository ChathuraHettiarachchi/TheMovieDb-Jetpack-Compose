// Generated by Dagger (https://dagger.dev).
package com.backbase.moviebox.domain.use_case.get_details;

import com.backbase.moviebox.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetMovieDetailsUseCase_Factory implements Factory<GetMovieDetailsUseCase> {
  private final Provider<MovieRepository> repositoryProvider;

  public GetMovieDetailsUseCase_Factory(Provider<MovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetMovieDetailsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetMovieDetailsUseCase_Factory create(
      Provider<MovieRepository> repositoryProvider) {
    return new GetMovieDetailsUseCase_Factory(repositoryProvider);
  }

  public static GetMovieDetailsUseCase newInstance(MovieRepository repository) {
    return new GetMovieDetailsUseCase(repository);
  }
}
