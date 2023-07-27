package com.adrian.ec3.data.repository

import com.adrian.ec3.data.response.ListNoteResponse
import com.adrian.ec3.data.retrofit.RetrofitHelper

class NoteRepository {

    suspend fun getNotes(): NoteServiceResult<ListNoteResponse> {
        return try {
            val response = RetrofitHelper.noteService.getAllNotes()
            NoteServiceResult.Success(response)
        } catch (e: java.lang.Exception) {
            NoteServiceResult.Error(e)
        }
    }

}