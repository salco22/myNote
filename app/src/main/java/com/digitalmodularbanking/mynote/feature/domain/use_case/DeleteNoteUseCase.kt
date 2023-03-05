package com.digitalmodularbanking.mynote.feature.domain.use_case

import com.digitalmodularbanking.mynote.feature.domain.model.Note
import com.digitalmodularbanking.mynote.feature.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note){
        repository.deleteNote(note)
    }

}