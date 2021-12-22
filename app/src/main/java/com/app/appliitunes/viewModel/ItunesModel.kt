package com.app.appliitunes.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.app.appliitunes.remote.database.ItunesTable
import com.app.appliitunes.remote.response.ResponseDTO
import com.app.appliitunes.repository.ItunesRepo
import com.application.itunesapplication.remote.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class ItunesModel @Inject constructor(private val itunesRepo: ItunesRepo) : ViewModel() {
    fun getDataFromAPI(query: String): LiveData<Resource<ResponseDTO>> {
        return liveData(Dispatchers.IO) {
            val data = itunesRepo.getDataFromAPI(query)
            emit(data)
        }
    }
    fun insertDataInDb(itunesDbTable: ItunesTable) {
        itunesRepo.insertDataInDb(itunesDbTable)
    }
    fun deleteDataFromDb() {
        itunesRepo.deleteDataFromDb()
    }
    fun getDataFromDb() {
        itunesRepo.getDataFromDb()
    }
}