package com.app.appliitunes.remote.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ItunesTable::class], version = 1)
abstract class ItunesDatabase : RoomDatabase() {
    abstract fun getResponseFromDao(): ItunesDao
}