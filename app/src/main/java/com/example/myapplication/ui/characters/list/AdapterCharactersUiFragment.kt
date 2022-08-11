package com.example.myapplication.ui.characters.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.data.model.DataCharacters
import com.example.myapplication.data.model.Result
import com.example.myapplication.data.model.Test
import com.example.myapplication.databinding.ViewForRecyclerViewBinding

class AdapterCharactersUiFragment(): RecyclerView.Adapter<AdapterCharactersUiFragment.CharactersUiFragmentViewHolder>() {



    class CharactersUiFragmentViewHolder(binding: ViewForRecyclerViewBinding): RecyclerView.ViewHolder(binding.root) {
        val binding: ViewForRecyclerViewBinding
        init {
            this.binding = binding
        }
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharactersUiFragmentViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ViewForRecyclerViewBinding.inflate(layoutInflater, parent, false)
        return CharactersUiFragmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharactersUiFragmentViewHolder, position: Int) {
        holder.binding.name.text = characters[position].name
        holder.binding.species.text = characters[position].species

    Glide
        .with(holder.binding.avatar)
        .load(characters[position])
        .into(holder.binding.avatar)
    }

    override fun getItemCount(): Int {
        return characters.size
    }

    var characters = listOf<Result>()
    fun dataCharacters(results: List<Result>) {
        this.characters = characters.toList()
        notifyDataSetChanged()
    }
}
