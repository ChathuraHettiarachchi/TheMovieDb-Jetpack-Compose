package com.backbase.moviebox.common

import android.content.res.Resources
import kotlin.math.roundToInt
import kotlin.math.roundToLong

val Int.toPx get() = (this * Resources.getSystem().displayMetrics.density).toInt()

val Int.toDp get() = (this / Resources.getSystem().displayMetrics.density).toInt()

/**
 * Fix size of text on jet pack compose composable to work with maxLines and ...
 * lines = number of new lines you need to add or text to fill in the ui
 */
fun String.addEmptyLines(lines: Int) = this + "\n".repeat(lines)

/**
 * Linearly interpolate between [start] and [stop] with [fraction] fraction between them.
 */
fun lerp(start: Float, stop: Float, fraction: Float): Float {
    return (1 - fraction) * start + fraction * stop
}

