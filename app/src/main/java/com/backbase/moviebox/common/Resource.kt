package com.backbase.moviebox.common

/**
 * A generic class to handle coroutine API state, no inheritance but instantiatable
 * Beauty will be, we can use this with custom objects and states
 *
 * @param data will be the output object/list
 * @param message will be the error/success message
 */
sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    /**
     * Resource.Success will used to notify success state
     *
     * @param data will be the success object
     */
    class Success<T>(data: T) : Resource<T>(data)

    /**
     * Resource.Error will used to nofity any error
     *
     * @param message will be the error message
     * @param data will be the output
     */
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)

    /**
     * Resource.Loading will use to notify still loading state
     *
     * @param data will be the output
     */
    class Loading<T>(data: T? = null) : Resource<T>(data)
}
