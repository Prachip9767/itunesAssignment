package com.app.appliitunes.remote.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItunesDao_Impl implements ItunesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItunesTable> __insertionAdapterOfItunesTable;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllDataFromDB;

  public ItunesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItunesTable = new EntityInsertionAdapter<ItunesTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Itunes_Table` (`artistName`,`artistImageUrl`,`id`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItunesTable value) {
        if (value.getArtistName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getArtistName());
        }
        if (value.getArtistImageUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getArtistImageUrl());
        }
        if (value.getId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllDataFromDB = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from Itunes_Table";
        return _query;
      }
    };
  }

  @Override
  public void addDataFromAPI(final ItunesTable result) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfItunesTable.insert(result);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllDataFromDB() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllDataFromDB.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllDataFromDB.release(_stmt);
    }
  }

  @Override
  public LiveData<ItunesTable> getResponseFromDb() {
    final String _sql = "select * from Itunes_Table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"Itunes_Table"}, false, new Callable<ItunesTable>() {
      @Override
      public ItunesTable call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfArtistName = CursorUtil.getColumnIndexOrThrow(_cursor, "artistName");
          final int _cursorIndexOfArtistImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "artistImageUrl");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final ItunesTable _result;
          if(_cursor.moveToFirst()) {
            final String _tmpArtistName;
            if (_cursor.isNull(_cursorIndexOfArtistName)) {
              _tmpArtistName = null;
            } else {
              _tmpArtistName = _cursor.getString(_cursorIndexOfArtistName);
            }
            final String _tmpArtistImageUrl;
            if (_cursor.isNull(_cursorIndexOfArtistImageUrl)) {
              _tmpArtistImageUrl = null;
            } else {
              _tmpArtistImageUrl = _cursor.getString(_cursorIndexOfArtistImageUrl);
            }
            _result = new ItunesTable(_tmpArtistName,_tmpArtistImageUrl);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
