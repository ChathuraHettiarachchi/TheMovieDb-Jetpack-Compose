// Generated by Dagger (https://dagger.dev).
package com.backbase.moviebox.presentation;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.backbase.moviebox.MovieBoxApplication;
import com.backbase.moviebox.data.remote.MovieDbAPI;
import com.backbase.moviebox.di.AppModule;
import com.backbase.moviebox.di.AppModule_ProvideOkHttpClientFactory;
import com.backbase.moviebox.di.AppModule_ProvidesMovieDbAPIFactory;
import com.backbase.moviebox.di.AppModule_ProvidesMovieRepositoryFactory;
import com.backbase.moviebox.domain.repository.MovieRepository;
import com.backbase.moviebox.domain.use_case.get_details.GetMovieDetailsUseCase;
import com.backbase.moviebox.domain.use_case.get_genres.GetMovieGenresUseCase;
import com.backbase.moviebox.domain.use_case.get_playing_now.GetNowPlayingMoviesUseCase;
import com.backbase.moviebox.domain.use_case.get_popular.GetPopularMoviesUseCase;
import com.backbase.moviebox.presentation.most_popular.MostPopularViewModel;
import com.backbase.moviebox.presentation.most_popular.MostPopularViewModel_HiltModules_KeyModule_ProvideFactory;
import com.backbase.moviebox.presentation.movie_details.MovieDetailViewModel;
import com.backbase.moviebox.presentation.movie_details.MovieDetailViewModel_HiltModules_KeyModule_ProvideFactory;
import com.backbase.moviebox.presentation.playing_now.PlayingNowViewModel;
import com.backbase.moviebox.presentation.playing_now.PlayingNowViewModel_HiltModules_KeyModule_ProvideFactory;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC extends AnimatedSplashScreenKtTest_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC = this;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<MovieDbAPI> providesMovieDbAPIProvider;

  private Provider<MovieRepository> providesMovieRepositoryProvider;

  private DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    initialize(applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private MovieDbAPI movieDbAPI() {
    return AppModule_ProvidesMovieDbAPIFactory.providesMovieDbAPI(provideOkHttpClientProvider.get());
  }

  private MovieRepository movieRepository() {
    return AppModule_ProvidesMovieRepositoryFactory.providesMovieRepository(providesMovieDbAPIProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam) {
    this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonC, 2));
    this.providesMovieDbAPIProvider = DoubleCheck.provider(new SwitchingProvider<MovieDbAPI>(singletonC, 1));
    this.providesMovieRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<MovieRepository>(singletonC, 0));
  }

  @Override
  public void injectMovieBoxApplication(MovieBoxApplication arg0) {
  }

  @Override
  public void injectTest(AnimatedSplashScreenKtTest animatedSplashScreenKtTest) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public AnimatedSplashScreenKtTest_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements AnimatedSplashScreenKtTest_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(
        DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public AnimatedSplashScreenKtTest_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements AnimatedSplashScreenKtTest_HiltComponents.ActivityC.Builder {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public AnimatedSplashScreenKtTest_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements AnimatedSplashScreenKtTest_HiltComponents.FragmentC.Builder {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public AnimatedSplashScreenKtTest_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements AnimatedSplashScreenKtTest_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(
        DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public AnimatedSplashScreenKtTest_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements AnimatedSplashScreenKtTest_HiltComponents.ViewC.Builder {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public AnimatedSplashScreenKtTest_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements AnimatedSplashScreenKtTest_HiltComponents.ViewModelC.Builder {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public AnimatedSplashScreenKtTest_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements AnimatedSplashScreenKtTest_HiltComponents.ServiceC.Builder {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public AnimatedSplashScreenKtTest_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends AnimatedSplashScreenKtTest_HiltComponents.ViewWithFragmentC {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(
        DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends AnimatedSplashScreenKtTest_HiltComponents.FragmentC {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends AnimatedSplashScreenKtTest_HiltComponents.ViewC {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends AnimatedSplashScreenKtTest_HiltComponents.ActivityC {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(MostPopularViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MovieDetailViewModel_HiltModules_KeyModule_ProvideFactory.provide(), PlayingNowViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends AnimatedSplashScreenKtTest_HiltComponents.ViewModelC {
    private final SavedStateHandle savedStateHandle;

    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<MostPopularViewModel> mostPopularViewModelProvider;

    private Provider<MovieDetailViewModel> movieDetailViewModelProvider;

    private Provider<PlayingNowViewModel> playingNowViewModelProvider;

    private ViewModelCImpl(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.savedStateHandle = savedStateHandleParam;
      initialize(savedStateHandleParam);

    }

    private GetPopularMoviesUseCase getPopularMoviesUseCase() {
      return new GetPopularMoviesUseCase(singletonC.providesMovieRepositoryProvider.get());
    }

    private MostPopularViewModel mostPopularViewModel() {
      return new MostPopularViewModel(getPopularMoviesUseCase());
    }

    private GetMovieDetailsUseCase getMovieDetailsUseCase() {
      return new GetMovieDetailsUseCase(singletonC.providesMovieRepositoryProvider.get());
    }

    private GetMovieGenresUseCase getMovieGenresUseCase() {
      return new GetMovieGenresUseCase(singletonC.providesMovieRepositoryProvider.get());
    }

    private MovieDetailViewModel movieDetailViewModel() {
      return new MovieDetailViewModel(getMovieDetailsUseCase(), getMovieGenresUseCase(), savedStateHandle);
    }

    private GetNowPlayingMoviesUseCase getNowPlayingMoviesUseCase() {
      return new GetNowPlayingMoviesUseCase(singletonC.providesMovieRepositoryProvider.get());
    }

    private PlayingNowViewModel playingNowViewModel() {
      return new PlayingNowViewModel(getNowPlayingMoviesUseCase());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.mostPopularViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.movieDetailViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.playingNowViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>of("com.backbase.moviebox.presentation.most_popular.MostPopularViewModel", (Provider) mostPopularViewModelProvider, "com.backbase.moviebox.presentation.movie_details.MovieDetailViewModel", (Provider) movieDetailViewModelProvider, "com.backbase.moviebox.presentation.playing_now.PlayingNowViewModel", (Provider) playingNowViewModelProvider);
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.backbase.moviebox.presentation.most_popular.MostPopularViewModel 
          return (T) viewModelCImpl.mostPopularViewModel();

          case 1: // com.backbase.moviebox.presentation.movie_details.MovieDetailViewModel 
          return (T) viewModelCImpl.movieDetailViewModel();

          case 2: // com.backbase.moviebox.presentation.playing_now.PlayingNowViewModel 
          return (T) viewModelCImpl.playingNowViewModel();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends AnimatedSplashScreenKtTest_HiltComponents.ActivityRetainedC {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(
        DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends AnimatedSplashScreenKtTest_HiltComponents.ServiceC {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerAnimatedSplashScreenKtTest_HiltComponents_SingletonC singletonC,
        int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.backbase.moviebox.domain.repository.MovieRepository 
        return (T) singletonC.movieRepository();

        case 1: // com.backbase.moviebox.data.remote.MovieDbAPI 
        return (T) singletonC.movieDbAPI();

        case 2: // okhttp3.OkHttpClient 
        return (T) AppModule_ProvideOkHttpClientFactory.provideOkHttpClient();

        default: throw new AssertionError(id);
      }
    }
  }
}
