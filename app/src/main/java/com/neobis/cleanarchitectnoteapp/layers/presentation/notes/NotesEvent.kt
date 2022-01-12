package com.neobis.cleanarchitectnoteapp.layers.presentation.notes

import com.neobis.cleanarchitectnoteapp.layers.domain.model.Note
import com.neobis.cleanarchitectnoteapp.layers.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}