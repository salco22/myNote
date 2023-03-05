package com.digitalmodularbanking.mynote.feature.presentation.notes

import com.digitalmodularbanking.mynote.feature.domain.model.Note
import com.digitalmodularbanking.mynote.feature.domain.utils.NoteOrder
import com.digitalmodularbanking.mynote.feature.domain.utils.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
