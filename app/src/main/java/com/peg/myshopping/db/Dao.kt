package com.peg.myshopping.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.peg.myshopping.entities.NoteItem
import kotlinx.coroutines.flow.Flow

@androidx.room.Dao
interface Dao {
    @Query("SELECT * FROM NoteItem")
    fun getAllNotes(): Flow<List<NoteItem>>

    @Insert
    suspend fun insertNote(note: NoteItem)
}