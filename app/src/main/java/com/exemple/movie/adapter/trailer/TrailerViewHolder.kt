package com.exemple.movie.adapter.trailer

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.exemple.movie.databinding.TrailerItemBinding
import com.exemple.movie.model.response.trailer.Result

class TrailerViewHolder(val binding: TrailerItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bindData(data:Result){

//        binding.title.text = data.title
//        val imageUrl = "https://image.tmdb.org/t/p/original"+data.posterPath
//        binding.image.load(imageUrl)

    }
}