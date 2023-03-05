package com.digitalmodularbanking.mynote.feature.presentation.notes

import com.digitalmodularbanking.mynote.feature.domain.model.Note
import com.digitalmodularbanking.mynote.feature.domain.utils.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
