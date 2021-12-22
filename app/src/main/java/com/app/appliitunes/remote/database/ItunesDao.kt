package com.app.appliitunes.remote.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ItunesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addDataFromAPI(result: ItunesTable)

    @Query("select * from Itunes_Table")
    fun getResponseFromDb(): LiveData<ItunesTable>

    @Query("delete from Itunes_Table")
    fun deleteAllDataFromDB()
}