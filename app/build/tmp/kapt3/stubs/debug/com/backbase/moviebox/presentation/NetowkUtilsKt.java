package com.backbase.moviebox.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b\u001a\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010*\u00020\u0002H\u0007\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"currentConnectivityState", "Lcom/backbase/moviebox/common/ConnectionState;", "Landroid/content/Context;", "getCurrentConnectivityState", "(Landroid/content/Context;)Lcom/backbase/moviebox/common/ConnectionState;", "NetworkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "callback", "Lkotlin/Function1;", "", "connectivityState", "Landroidx/compose/runtime/State;", "getCurrentState", "connectivityManager", "Landroid/net/ConnectivityManager;", "observeConnectivityAsFlow", "Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public final class NetowkUtilsKt {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.compose.runtime.Composable()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    public static final androidx.compose.runtime.State<com.backbase.moviebox.common.ConnectionState> connectivityState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.backbase.moviebox.common.ConnectionState getCurrentConnectivityState(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$currentConnectivityState) {
        return null;
    }
    
    private static final com.backbase.moviebox.common.ConnectionState getCurrentState(android.net.ConnectivityManager connectivityManager) {
        return null;
    }
    
    /**
     * Network Utility to observe availability or unavailability of Internet connection
     */
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.ExperimentalCoroutinesApi()
    public static final kotlinx.coroutines.flow.Flow<com.backbase.moviebox.common.ConnectionState> observeConnectivityAsFlow(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$observeConnectivityAsFlow) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.net.ConnectivityManager.NetworkCallback NetworkCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.backbase.moviebox.common.ConnectionState, kotlin.Unit> callback) {
        return null;
    }
}