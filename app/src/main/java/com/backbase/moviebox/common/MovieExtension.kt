package com.backbase.moviebox.common

import android.content.res.Resources
import kotlin.math.roundToInt
import kotlin.math.roundToLong

val Int.toPx get() = (this * Resources.getSystem().displayMetrics.density).toInt()

val Int.toDp get() = (this / Resources.getSystem().displayMetrics.density).toInt()

fun String.addEmptyLines(lines: Int) = this + "\n".repeat(lines)

/**
 * Linearly interpolate between [start] and [stop] with [fraction] fraction between them.
 */
fun lerp(start: Float, stop: Float, fraction: Float): Float {
    return (1 - fraction) * start + fraction * stop
}

/**
 * Linearly interpolate between [start] and [stop] with [fraction] fraction between them.
 */
fun lerp(start: Int, stop: Int, fraction: Float): Int {
    return start + ((stop - start) * fraction.toDouble()).roundToInt()
}

/**
 * Linearly interpolate between [start] and [stop] with [fraction] fraction between them.
 */
fun lerp(start: Long, stop: Long, fraction: Float): Long {
    return start + ((stop - start) * fraction.toDouble()).roundToLong()
}
