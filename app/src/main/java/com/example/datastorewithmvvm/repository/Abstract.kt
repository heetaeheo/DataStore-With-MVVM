package com.example.datastorewithmvvm.repository

import com.example.datastorewithmvvm.Phonebook
import kotlinx.coroutines.flow.Flow

interface Abstract {

    suspend fun savePhoneBook(phonebook: Phonebook)

    suspend fun getPhoneBook() : Flow<Phonebook>
}