package com.neobis.cleanarchitectnoteapp.layers.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,

)