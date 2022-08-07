package com.example.myapplication.ui.characters.list

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.data.model.Test
import com.example.myapplication.databinding.FragmentCharactersListUiBinding
import com.example.myapplication.databinding.FragmentStartBinding

class   CharactersListUiFragment : Fragment() {

    private lateinit var binding: FragmentCharactersListUiBinding
    private lateinit var adapter: AdapterCharactersUiFragment


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharactersListUiBinding.inflate(inflater, container, false)
        adapter = AdapterCharactersUiFragment()
        adapter.aplist(list)
        val recyclerView = binding.itemRecycler
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        return binding.root
    }

    val list = listOf(Test("bob", "professor"),
        Test("bob", "professor"),
        Test("bob", "professor"),
        Test("bob", "professor"),
        Test("bob", "professor"),
        Test("bob", "professor"),
        Test("bob", "professor"),
        Test("bob", "professor"))
}

