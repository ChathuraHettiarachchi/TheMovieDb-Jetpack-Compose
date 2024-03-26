package com.backbase.moviebox.common

sealed class ConnectionState {
    object Available : ConnectionState()
    object Unavailable : ConnectionState()
}