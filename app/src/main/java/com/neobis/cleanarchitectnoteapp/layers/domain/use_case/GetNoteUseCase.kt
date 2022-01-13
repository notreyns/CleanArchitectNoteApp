package com.neobis.cleanarchitectnoteapp.layers.domain.use_case

import com.neobis.cleanarchitectnoteapp.layers.domain.model.Note
import com.neobis.cleanarchitectnoteapp.layers.domain.repository.NoteRepository

class GetNoteUseCase(private val repository: NoteRepository) {
    suspend operator fun invoke(id:Int): Note?{
        return repository.getNoteById(id)
    }
}