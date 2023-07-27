package com.adrian.ec3.data.retrofit

import com.adrian.ec3.data.response.ListNoteResponse
import retrofit2.http.GET

interface NoteService {

    @GET("cardinfo.php?cardset=metal%20raiders&num=5&offset=0")
    suspend fun getAllNotes(): ListNoteResponse

}