package com.digitalmodularbanking.mynote.feature.domain.model

import android.graphics.Color
import android.provider.CalendarContract
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(Color.CYAN,Color.MAGENTA,Color.YELLOW,Color.GREEN)
    }
}

class InvalidNoteException(message: String): Exception(message)
