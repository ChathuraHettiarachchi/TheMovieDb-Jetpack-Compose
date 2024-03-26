// Generated by Dagger (https://dagger.dev).
package com.backbase.moviebox.di;

import com.backbase.moviebox.data.remote.MovieDbAPI;
import com.backbase.moviebox.domain.repository.MovieRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesMovieRepositoryFactory implements Factory<MovieRepository> {
  private final Provider<MovieDbAPI> apiProvider;

  public AppModule_ProvidesMovieRepositoryFactory(Provider<MovieDbAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public MovieRepository get() {
    return providesMovieRepository(apiProvider.get());
  }

  public static AppModule_ProvidesMovieRepositoryFactory create(Provider<MovieDbAPI> apiProvider) {
    return new AppModule_ProvidesMovieRepositoryFactory(apiProvider);
  }

  public static MovieRepository providesMovieRepository(MovieDbAPI api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.providesMovieRepository(api));
  }
}