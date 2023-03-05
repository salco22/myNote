package com.digitalmodularbanking.mynote.feature.domain.use_case

import com.digitalmodularbanking.mynote.feature.domain.model.InvalidNoteException
import com.digitalmodularbanking.mynote.feature.domain.model.Note
import com.digitalmodularbanking.mynote.feature.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {

        if (note.title.isBlank()){
            throw InvalidNoteException("Il titolo non può essere vuoto")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("Il contentuto non può essere vuoto")
        }
        repository.insertNote(note)
    }
}