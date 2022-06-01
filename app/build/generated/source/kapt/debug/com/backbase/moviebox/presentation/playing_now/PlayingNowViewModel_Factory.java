// Generated by Dagger (https://dagger.dev).
package com.backbase.moviebox.presentation.playing_now;

import com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayingNowViewModel_Factory implements Factory<PlayingNowViewModel> {
  private final Provider<GetNowPlayingMoviesUseCase> nowPlayingMoviesUseCaseProvider;

  public PlayingNowViewModel_Factory(
      Provider<GetNowPlayingMoviesUseCase> nowPlayingMoviesUseCaseProvider) {
    this.nowPlayingMoviesUseCaseProvider = nowPlayingMoviesUseCaseProvider;
  }

  @Override
  public PlayingNowViewModel get() {
    return newInstance(nowPlayingMoviesUseCaseProvider.get());
  }

  public static PlayingNowViewModel_Factory create(
      Provider<GetNowPlayingMoviesUseCase> nowPlayingMoviesUseCaseProvider) {
    return new PlayingNowViewModel_Factory(nowPlayingMoviesUseCaseProvider);
  }

  public static PlayingNowViewModel newInstance(
      GetNowPlayingMoviesUseCase nowPlayingMoviesUseCase) {
    return new PlayingNowViewModel(nowPlayingMoviesUseCase);
  }
}
