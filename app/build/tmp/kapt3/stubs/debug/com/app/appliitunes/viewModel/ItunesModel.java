package com.app.appliitunes.viewModel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/app/appliitunes/viewModel/ItunesModel;", "Landroidx/lifecycle/ViewModel;", "itunesRepo", "Lcom/app/appliitunes/repository/ItunesRepo;", "(Lcom/app/appliitunes/repository/ItunesRepo;)V", "deleteDataFromDb", "", "getDataFromAPI", "Landroidx/lifecycle/LiveData;", "Lcom/application/itunesapplication/remote/Resource;", "Lcom/app/appliitunes/remote/response/ResponseDTO;", "query", "", "getDataFromDb", "insertDataInDb", "itunesDbTable", "Lcom/app/appliitunes/remote/database/ItunesTable;", "app_debug"})
public final class ItunesModel extends androidx.lifecycle.ViewModel {
    private final com.app.appliitunes.repository.ItunesRepo itunesRepo = null;
    
    @javax.inject.Inject()
    public ItunesModel(@org.jetbrains.annotations.NotNull()
    com.app.appliitunes.repository.ItunesRepo itunesRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.application.itunesapplication.remote.Resource<com.app.appliitunes.remote.response.ResponseDTO>> getDataFromAPI(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public final void insertDataInDb(@org.jetbrains.annotations.NotNull()
    com.app.appliitunes.remote.database.ItunesTable itunesDbTable) {
    }
    
    public final void deleteDataFromDb() {
    }
    
    public final void getDataFromDb() {
    }
}