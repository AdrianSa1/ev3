package com.adrian.ec3.ui.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.adrian.ec3.data.repository.NoteRepository
import com.adrian.ec3.data.repository.NoteServiceResult
import com.adrian.ec3.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteListViewModel: ViewModel() {

    val notes: MutableLiveData<List<Note>> = MutableLiveData<List<Note>>()
    val repository = NoteRepository()

    /*
    fun getAllNotes() {
        val noteList = getData()
        notes.value = noteList
    }*/

    fun getNotesFromService() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getNotes()
            when(response) {
                is NoteServiceResult.Success -> {
                    notes.postValue(response.data.data)
                }
                is NoteServiceResult.Error -> {
                    //
                }
            }
        }
    }

}