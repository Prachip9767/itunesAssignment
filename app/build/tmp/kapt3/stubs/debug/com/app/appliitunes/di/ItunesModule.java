package com.app.appliitunes.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lcom/app/appliitunes/di/ItunesModule;", "", "()V", "apiService", "Lcom/app/appliitunes/remote/ApiClient;", "dataToDao", "Lcom/app/appliitunes/remote/database/ItunesDao;", "db", "Lcom/app/appliitunes/remote/database/ItunesDatabase;", "roomDb", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class ItunesModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.app.appliitunes.di.ItunesModule INSTANCE = null;
    
    private ItunesModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.app.appliitunes.remote.ApiClient apiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.app.appliitunes.remote.database.ItunesDatabase roomDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.app.appliitunes.remote.database.ItunesDao dataToDao(@org.jetbrains.annotations.NotNull()
    com.app.appliitunes.remote.database.ItunesDatabase db) {
        return null;
    }
}