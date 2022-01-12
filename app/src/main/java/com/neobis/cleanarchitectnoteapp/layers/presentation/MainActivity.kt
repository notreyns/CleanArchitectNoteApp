package com.neobis.cleanarchitectnoteapp.layers.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.neobis.cleanarchitectnoteapp.R
import com.neobis.cleanarchitectnoteapp.ui.theme.CleanArchitectureNoteAppTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            CleanArchitectureNoteAppTheme() {

            }
        }
    }
}