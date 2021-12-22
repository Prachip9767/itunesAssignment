package com.app.appliitunes.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/app/appliitunes/repository/ItunesRepo;", "", "itunesDao", "Lcom/app/appliitunes/remote/database/ItunesDao;", "(Lcom/app/appliitunes/remote/database/ItunesDao;)V", "responseHandler", "Lcom/application/itunesapplication/remote/ResponseHandler;", "deleteDataFromDb", "", "getDataFromAPI", "Lcom/application/itunesapplication/remote/Resource;", "Lcom/app/appliitunes/remote/response/ResponseDTO;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDataFromDb", "Landroidx/lifecycle/LiveData;", "Lcom/app/appliitunes/remote/database/ItunesTable;", "insertDataInDb", "itunesDbTable", "app_debug"})
public final class ItunesRepo {
    private final com.app.appliitunes.remote.database.ItunesDao itunesDao = null;
    private final com.application.itunesapplication.remote.ResponseHandler responseHandler = null;
    
    @javax.inject.Inject()
    public ItunesRepo(@org.jetbrains.annotations.NotNull()
    com.app.appliitunes.remote.database.ItunesDao itunesDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDataFromAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.application.itunesapplication.remote.Resource<com.app.appliitunes.remote.response.ResponseDTO>> continuation) {
        return null;
    }
    
    public final void insertDataInDb(@org.jetbrains.annotations.NotNull()
    com.app.appliitunes.remote.database.ItunesTable itunesDbTable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.app.appliitunes.remote.database.ItunesTable> getDataFromDb() {
        return null;
    }
    
    public final void deleteDataFromDb() {
    }
}