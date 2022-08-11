package com.example.myapplication.data.retrofit

import android.telecom.Call
import com.example.myapplication.data.model.DataCharacters
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CharactersInterface {

    @GET("character")
    suspend fun getAllCharacter(): DataCharacters

    companion object {
        var charactersInterface: CharactersInterface? = null

        fun getIntance(): CharactersInterface {
            if(charactersInterface == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://rickandmortyapi.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(CharactersInterface::class.java)
            }
            return charactersInterface!!
            }
    }
}

