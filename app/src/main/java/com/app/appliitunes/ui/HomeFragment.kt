package com.app.appliitunes.ui

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.app.appliitunes.R
import com.app.appliitunes.adapter.ItunesAdapter
import com.app.appliitunes.databinding.FragmentHomeBinding
import com.app.appliitunes.remote.database.ItunesTable
import com.app.appliitunes.remote.response.Result
import com.app.appliitunes.viewModel.ItunesModel
import com.application.itunesapplication.remote.Status
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment() {
   private lateinit var bindingHomeFragment: FragmentHomeBinding
    private val viewModel: ItunesModel by viewModels()
   private lateinit var itunesAdapter: ItunesAdapter
    val resultList = mutableListOf<Result>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingHomeFragment =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        return bindingHomeFragment.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        bindingHomeFragment.etEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                bindingHomeFragment.etEditText.clearFocus()
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                loadApi(s.toString())
            }
            override fun afterTextChanged(s: Editable?) {
            }
        })
    }

    fun loadApi(query: String) {
        viewModel.getDataFromAPI(query).observe(viewLifecycleOwner,  {
            when (it.status) {
                Status.ERROR -> {
                    viewModel.getDataFromDb()
                    Toast.makeText(context, "Error", Toast.LENGTH_SHORT).show()
                }
                Status.SUCCESS -> {
                    resultList.clear()
                    it.data?.results.let {
                        if (it != null) {
                            resultList.addAll(it)
                            itunesAdapter.notifyDataSetChanged()
                        }
                    }
                    CoroutineScope(Dispatchers.Default).launch {
                        insertDataToDb(it.data!!.results)
                    }
                }
            }
        })
        viewModel.getDataFromAPI(query)
    }
    private fun insertDataToDb(result: List<Result>) {
        viewModel.deleteDataFromDb()
        result.forEach {
            val itunesDb = ItunesTable(it.artistName, it.artworkUrl100)
            viewModel.insertDataInDb(itunesDb)
        }
    }
    private fun setRecyclerView() {
        itunesAdapter = ItunesAdapter(resultList)
        bindingHomeFragment.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 3)
            adapter = itunesAdapter
        }
    }

}