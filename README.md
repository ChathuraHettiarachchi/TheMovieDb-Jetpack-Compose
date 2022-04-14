
# Backbase - Movie Box - Android (TMDB)

![Poster](https://gitlab.com/chathurahettiarachchi/backbase-moviebox/-/raw/a252b74aefc5afc286f047854c6418c7cd547229/screen_shots/poster.jpg)

Movie Box is an Android application to showcase TheMovieDB API with Jetpack Compose as the UI builder. The goal of the project is to demonstrate best practices by using up to date tech-stack and presenting modern Android application Architecture that is scalable, maintainable, and testable. This application may look quite simple,
but it has all of these small details that will set the rock-solid foundation for the larger app suitable for bigger teams
and long application lifecycle.

## Project content

The MovieBox brings some of the best areas of Android development to one place.

* 100% Kotlin
* Clean architecture
* MVVM
* Kotlin Flows, coroutins
* Jetpack Compose
* Testing
* Dependency Injection with Dagger Hilt
* Material design

## Tech-stack
Because the minimum API level is set to 23, the provided approach is suitable for over 85% of Android devices. This project makes use of a number of well-known Android libraries and technologies. Unless there is a compelling need to use a non-stable dependency, the most of the libraries are in the stable version.

* Tech-stack
    * Koting + Coroutines
    * Dagger Hilt - dependency injection
    * Retrofit - networking
    * Coil - image loading library with memory caching
    * Lottie - animation library
    * Jetpack Compose, ViewModel, Repository
* Architecture
    * Clean Architecture
    * MVVM
* Tests
    * Unit test with JUnit4

## Architecture of the app

The MovieBox follows Clean Architecture with separating domain, data, and presentation as layers. The application use the data models and API implementations from the domains to populate the UI. The domain contains the useCase functions with Kotlin Flows to emit data to the viewModels when needed.

The Data layer contains the functionality to call APIs, map data to DTOs. All DTOs support extension functions to convert DTO to model from domain layer for data population. This works as removing unwanted values before mapping.

The benefits of the approch:
- better separation of concerns.
- can build use-case wise
- each use-case is issolate from other implementations

#### Presentation layer
This layer is closest to what the user sees on the screen. The `presentation` layer is made of `MVVM` (Jetpack `ViewModel` used to manage state of the data and support flows). All UIs are build with the `Jetpack Compose` composable items. 
`state` (for each main screen) approach has used to maintain state change from the APIs.

Components:
- **View (Composable)** - presents data on the screen and pass user interactions to View Model.
- **ViewModel** - use Kotlin Flows to check state changes to the view and deals with user interactions.
- **State** - state per main screen
- **NavGraph** - Jetpack compose, navigation manager

#### Domain layer
This is the application's main layer. It's worth noting that the 'domain' layer is separate from all other layers. This enables domain models and business logic to be separated from other levels.
In other words, modifications in other levels should have no impact on the 'domain' layer. For example, updating the database ('data' layer) or the screen UI ('presentation' layer) should not result in any code changes in the 'domain' layer.

Components:
- **UseCase** - contains business logic
- **DomainModel** - defies the core structure of the data that will be used within the application.
- **Repository interface** - required to keep the `domain` layer independent from the `data layer`.

#### Data layer
Manages application data and exposes these data sources to the 'domain' layer as repositories. This layer's typical tasks include retrieving data from the internet and, if desired, caching it locally.

Components:
- **Repository** is exposing data to the `domain` layer. Depending on application structure and quality of the external APIs repository can also merge, filter, and transform the data. The intention of
these operations is to create high-quality data source for the `domain` layer, not to perform any business logic (`domain` layer `use case` responsibility).
- **RetrofitService** - defines a set of API endpoints.
- **DataModel** - defines the structure of the data retrieved from the network and contains annotations, so Retrofit (GSON) understands how to parse this network data (JSON) this data into objects. This also inclues extension funstion to convert data to Domain-Models.

## Important view logics
#### RatingView
In the MovieBox application I'm using 100% `composables` for the UI or the presentation part. My inital intension was to go with XML based UIs and create a custom UI with extending from `View` and use `onDraw` overrides to create circle on top of another. Then I can use attributes to pass rating value, by that I can change the color of fill and the shadow.

But with `Jetpack Compose` it's much easier. Let's check that method with the code now.

```kotlin
/**
 * Rating view, can used to display rating value and dot icon with glowing shadow
 * any rating > 50 will be green and below will be red
 * either green or red, it will use liner gradient to fill the dot and shadow
 *
 * @param rating will be the rating value
 */
@Composable
fun RatingView(rating: Int){
    Row(horizontalArrangement = Arrangement.Start) {
        Column() {
            Spacer(Modifier.height(3.dp))
            RatingDot(rating = rating)
        }
        Spacer(Modifier.width(2.dp))
        Text(text = "$rating%", color = textRating, fontSize = 13.sp, textAlign = TextAlign.Center)
    }
}

/**
 * RatingDot, can used to display rating dot with glowing shadow
 * any rating > 50 will be green and below will be red
 * either green or red, it will use liner gradient to fill the dot and shadow
 *
 * @param rating will be the rating value
 */
@Composable
fun RatingDot(rating: Int){
    Box(
        modifier = Modifier
            .size(18.dp)
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        if (rating > 50) greenRatingShadow else redRatingShadow,
                        Color.Transparent
                    )
                )
            )
            .padding(bottom = 4.dp),
        contentAlignment = Alignment.Center
    ){
        Surface(
            shape = CircleShape,
            modifier = Modifier
                .size(12.dp)
                .background(Color.Transparent)
        ) {
            Box(
                modifier = Modifier
                    .size(17.dp)
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                if (rating > 50) greenRatingStart else redRatingStart,
                                if (rating > 50) greenRatingEnd else redRatingEnd
                            )
                        )
                    )
            )
        }

    }
}
```

First, the `RatingDot` which takes the rating value as a parameter (The TMDB sending voting_average value from 0-10, so I decide to multiply it by 10 to get the % value). Since the rating view contains 3 parts mainly, I decide to focus on dot and shadow on this composable funtion. As you can see, I have creates `Box` with background of a gradient. Starts from alpha color to end transparent. This will be the shadow. And on top of it I have a circle to fill with alphs 1f color gradient to match the UI.

Next, we have `RatingView` which combine text value and `RatingDot` as one single row.

This is how it looks on both below and over ratings.

![Screenshot_2022-04-13_at_23.22.23](/uploads/b1fefe650cca6b8ef90d8bb8f5b169af/Screenshot_2022-04-13_at_23.22.23.png)

#### Horizontal Pager for PopularMovies with Pagination
Well, Jetpack has no way to implement this one, so I had come combine some basic with Accompanist-pager library, knowledge about state and pagination logic to achive that. I'm requesting data and update the state when ever user is reaching at the end. The treshold is 6.
```kotlin
HorizontalPager(
                    count = pages.size,
                    state = pagerState,
                    contentPadding = PaddingValues(horizontal = 64.dp)
                ) { page ->
                    // custom logic to support pagination for pager
                    if (page > pages.size - 6 && !state.isLoading) {
                        viewModel.requestNextPage()
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .graphicsLayer {
                                val pageOffset =
                                    calculateCurrentOffsetForPage(page).absoluteValue

                                // scaling of poster view to change the size a little :)
                                lerp(
                                    start = 0.85f,
                                    stop = 1f,
                                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                                ).also { scale ->
                                    scaleX = scale
                                    scaleY = scale
                                }

                                // We animate the alpha, between 50% and 100%
                                alpha = lerp(
                                    start = 0.5f,
                                    stop = 1f,
                                    fraction = 1f - pageOffset.coerceIn(0f, 1f)
                                )
                            },
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        if (pages.size > 0 && page < pages.size)
                            MoviePosterView(posterPath = pages[page].poster_path, isDetails = true)
                    }
                }
```
<img src="/screen_shots/003.jpg" width="300">

Additionally I have added alpha change on page offset items and the size. Check how it looks.

## Demo of the application
![ezgif.com-gif-maker](/uploads/418bcc6482676851e75fe90233788b0c/ezgif.com-gif-maker.gif)

## Dependencies and the usage
```gradle
    // Compose dependencies
    // To get the lifecycle state to the application, as we do in activity and fragments
    implementation "androidx.lifecycle:lifecycle-viewmodel-compose:2.4.1"
    // To manage application navigation, data passing and all
    implementation "androidx.navigation:navigation-compose:2.4.2"
    // Used to get the material icons for compose modules
    implementation "androidx.compose.material:material-icons-extended:$compose_version"

    // Coroutines support for android
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.0'

    // Coroutine Lifecycle Scopes and viewmodel
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1"
    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"

    //Dagger - Hilt - dependancy injection
    implementation "com.google.dagger:hilt-android:2.38.1"
    kapt "com.google.dagger:hilt-android-compiler:2.38.1"
    implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    kapt "androidx.hilt:hilt-compiler:1.0.0"
    // Dagger support for navigation injections
    implementation 'androidx.hilt:hilt-navigation-compose:1.0.0'

    // Retrofit API calls
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    // GSON json converter and mapper
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    // OKHttp for logs and timeout overrieds
    implementation "com.squareup.okhttp3:okhttp:4.9.3"
    implementation "com.squareup.okhttp3:logging-interceptor:4.9.3"

    // coil image loader
    implementation("io.coil-kt:coil-compose:2.0.0-rc01")

    // flow layouts
    implementation "com.google.accompanist:accompanist-flowlayout:0.23.1"
    implementation "com.google.accompanist:accompanist-pager:0.23.1"

    // lottie animation
    implementation "com.airbnb.android:lottie-compose:5.0.3"
```

## Known issues
- Back press on landin initiate app to load again without bottom bar state.
