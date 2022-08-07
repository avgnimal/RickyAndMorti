package com.example.myapplication.ui.characters.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.model.Test
import com.example.myapplication.databinding.ViewForRecyclerViewBinding

class AdapterCharactersUiFragment() :
    RecyclerView.Adapter<AdapterCharactersUiFragment.CharactersUiFragmentViewHolder>() {
    class CharactersUiFragmentViewHolder(binding: ViewForRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: ViewForRecyclerViewBinding

        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharactersUiFragmentViewHolder {
        val binding = ViewForRecyclerViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CharactersUiFragmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharactersUiFragmentViewHolder, position: Int) {
    holder.binding.name.text = list[position].name
    holder.binding.species.text = list[position].text
    }

    override fun getItemCount(): Int {
        return list.size
    }

    var list = listOf<Test>()
    fun aplist(list: List<Test>) {
        this.list = list
        notifyDataSetChanged()
    }
}