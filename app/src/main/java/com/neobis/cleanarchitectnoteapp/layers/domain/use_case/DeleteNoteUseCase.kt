package com.neobis.cleanarchitectnoteapp.layers.domain.use_case

import com.neobis.cleanarchitectnoteapp.layers.domain.model.Note
import com.neobis.cleanarchitectnoteapp.layers.domain.repository.NoteRepository

class DeleteNoteUseCase(private val repository: NoteRepository) {
    suspend fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}