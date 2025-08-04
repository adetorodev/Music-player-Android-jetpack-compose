package com.ezadetoro.musicplayer.presentation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ezadetoro.musicplayer.R
import com.ezadetoro.musicplayer.data.Song
import com.ezadetoro.musicplayer.ui.PlayerScreen

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val mysongList = intent.getParcelableArrayListExtra("songList") ?: emptyList<Song>()
        val initialIndex = intent.getIntExtra("position", 0)
        setContent{
            PlayerScreen(
                songList = mysongList,
                initialIndex = initialIndex,
                onBack = { finish() }
            )
        }

    }
}