package com.example.myapplication.ui.characters.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.data.Repository
import com.example.myapplication.data.model.DataCharacters
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class CharactersListUiViewModel constructor(private val repository: Repository) : ViewModel() {

    val charactersList = MutableLiveData<List<DataCharacters>>()
    val errorMessage = MutableLiveData<String>()
}


class MyViewModelFactory(val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(CharactersListUiViewModel::class.java)) {
            CharactersListUiViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }
}


