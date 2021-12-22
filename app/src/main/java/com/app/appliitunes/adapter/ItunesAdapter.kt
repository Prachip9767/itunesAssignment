package com.app.appliitunes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.app.appliitunes.R
import com.app.appliitunes.databinding.ItemLayoutBinding
import com.app.appliitunes.remote.response.Result
import com.bumptech.glide.Glide

class ItunesAdapter (
    private val resultList: List<Result>) : RecyclerView.Adapter<ItunesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItunesViewHolder {
        val itemLayoutBinding: ItemLayoutBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_layout, parent, false)
        return ItunesViewHolder(itemLayoutBinding)
    }
    override fun onBindViewHolder(holder: ItunesViewHolder, position: Int) {
        val resultModel = resultList[position]
        holder.onBind(resultModel)
    }
    override fun getItemCount(): Int {
        return resultList.size
    }
}
class ItunesViewHolder(private val itemLayoutBinding: ItemLayoutBinding, ) : RecyclerView.ViewHolder(itemLayoutBinding.root) {
    fun onBind(result: Result) {
        itemLayoutBinding.resultModel = result
        Glide.with(itemLayoutBinding.artistImage).load(result.artworkUrl100).into(itemLayoutBinding.artistImage)
    }
}