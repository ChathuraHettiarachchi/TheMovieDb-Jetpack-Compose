package com.backbase.moviebox.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/backbase/moviebox/common/ConnectionState;", "", "()V", "Available", "Unavailable", "Lcom/backbase/moviebox/common/ConnectionState$Available;", "Lcom/backbase/moviebox/common/ConnectionState$Unavailable;", "app_release"})
public abstract class ConnectionState {
    
    private ConnectionState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/backbase/moviebox/common/ConnectionState$Available;", "Lcom/backbase/moviebox/common/ConnectionState;", "()V", "app_release"})
    public static final class Available extends com.backbase.moviebox.common.ConnectionState {
        @org.jetbrains.annotations.NotNull()
        public static final com.backbase.moviebox.common.ConnectionState.Available INSTANCE = null;
        
        private Available() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/backbase/moviebox/common/ConnectionState$Unavailable;", "Lcom/backbase/moviebox/common/ConnectionState;", "()V", "app_release"})
    public static final class Unavailable extends com.backbase.moviebox.common.ConnectionState {
        @org.jetbrains.annotations.NotNull()
        public static final com.backbase.moviebox.common.ConnectionState.Unavailable INSTANCE = null;
        
        private Unavailable() {
            super();
        }
    }
}