package com.backbase.moviebox.presentation.playing_now

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.navigation.compose.rememberNavController
import com.backbase.moviebox.common.TestTag
import com.backbase.moviebox.presentation.MainActivity
import com.backbase.moviebox.theme.MovieBoxTheme
import com.backbase.moviebox.theme.primary
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class PlayingNowScreenKtTest{
    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {
        composeRule.setContent {
            MovieBoxTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = primary
                ) {
                    val navController = rememberNavController()
                    PlayingNowScreen(navController = navController)
                }
            }
        }
    }

    @Test
    fun loading_animation_visibility(){
        composeRule.waitForIdle()
        composeRule.onNodeWithTag(TestTag.LOADING).assertIsDisplayed()
    }
}