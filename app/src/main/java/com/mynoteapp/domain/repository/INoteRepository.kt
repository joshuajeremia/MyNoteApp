package com.mynoteapp.domain.repository

import com.mynoteapp.data.model.NoteData
import kotlinx.coroutines.flow.Flow

interface INoteRepository {
    suspend fun getAllNote(): Flow<List<NoteData>>
    suspend fun insertNote(noteData: NoteData)
    suspend fun updateNote(noteData: NoteData)
    suspend fun deleteNote(noteData: NoteData)
    suspend fun deleteAllNote()
    suspend fun searchNote(query: String): Flow<List<NoteData>>
    suspend fun sortByHighPriority(): Flow<List<NoteData>>
    suspend fun sortByLowPriority(): Flow<List<NoteData>>
}