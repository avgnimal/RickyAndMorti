package com.example.myapplication.data

import com.example.myapplication.data.retrofit.CharactersInterface

class Repository constructor(private val charactersInterface: CharactersInterface) {

    suspend fun getAllCharacter() = charactersInterface.getAllCharacter()
}