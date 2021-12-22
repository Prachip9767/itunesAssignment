package com.app.appliitunes.remote.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/app/appliitunes/remote/database/ItunesDao;", "", "addDataFromAPI", "", "result", "Lcom/app/appliitunes/remote/database/ItunesTable;", "deleteAllDataFromDB", "getResponseFromDb", "Landroidx/lifecycle/LiveData;", "app_debug"})
public abstract interface ItunesDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void addDataFromAPI(@org.jetbrains.annotations.NotNull()
    com.app.appliitunes.remote.database.ItunesTable result);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Itunes_Table")
    public abstract androidx.lifecycle.LiveData<com.app.appliitunes.remote.database.ItunesTable> getResponseFromDb();
    
    @androidx.room.Query(value = "delete from Itunes_Table")
    public abstract void deleteAllDataFromDB();
}