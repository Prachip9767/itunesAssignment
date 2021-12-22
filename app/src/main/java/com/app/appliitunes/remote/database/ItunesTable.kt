package com.app.appliitunes.remote.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Itunes_Table")
data class ItunesTable(
    @ColumnInfo(name = "artistName")
    val artistName: String,
    @ColumnInfo(name = "artistImageUrl")
    val artistImageUrl: String
) {
    @PrimaryKey
    @ColumnInfo(name = "id")
    var id: Int? = null
}
