// Generated by Dagger (https://dagger.dev).
package com.backbase.moviebox.data.repositories;

import com.backbase.moviebox.data.remote.MovieDbAPI;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieRepositoryImpl_Factory implements Factory<MovieRepositoryImpl> {
  private final Provider<MovieDbAPI> apiProvider;

  public MovieRepositoryImpl_Factory(Provider<MovieDbAPI> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public MovieRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static MovieRepositoryImpl_Factory create(Provider<MovieDbAPI> apiProvider) {
    return new MovieRepositoryImpl_Factory(apiProvider);
  }

  public static MovieRepositoryImpl newInstance(MovieDbAPI api) {
    return new MovieRepositoryImpl(api);
  }
}
