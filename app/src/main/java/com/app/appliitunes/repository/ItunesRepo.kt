package com.app.appliitunes.repository

import androidx.lifecycle.LiveData
import com.app.appliitunes.di.ItunesModule
import com.app.appliitunes.remote.database.ItunesDao
import com.app.appliitunes.remote.database.ItunesTable
import com.app.appliitunes.remote.response.ResponseDTO
import com.application.itunesapplication.remote.Resource
import com.application.itunesapplication.remote.ResponseHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class ItunesRepo @Inject constructor(private val itunesDao: ItunesDao) {
    private val responseHandler: ResponseHandler = ResponseHandler()
    suspend fun getDataFromAPI(query: String): Resource<ResponseDTO> {
        return try {
            val itunesResponseModel: ResponseDTO =
                ItunesModule.apiService().getResponse(query)
            responseHandler.handleSuccess(itunesResponseModel)
        } catch (e: Exception) {
            responseHandler.handleException(e)
        }
    }
    fun insertDataInDb(itunesDbTable: ItunesTable) {
        CoroutineScope(Dispatchers.IO).launch {
            itunesDao.deleteAllDataFromDB()
            itunesDao.addDataFromAPI(itunesDbTable)
        }
    }
    fun getDataFromDb(): LiveData<ItunesTable> {
        return  itunesDao.getResponseFromDb()
    }
    fun deleteDataFromDb(){
        itunesDao.deleteAllDataFromDB()
    }
}