package com.manas.musicstreamingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import com.manas.musicstreamingapp.data.songsList
import com.manas.musicstreamingapp.ui.screens.HomeScreen
import com.manas.musicstreamingapp.ui.theme.MusicStreamingAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicStreamingAppTheme {
                Scaffold(topBar = {
                    TopAppBar(
                        title = { Text(text = "Music Streaming App") },
                        backgroundColor = MaterialTheme.colors.primary
                    )
                }) { innerPadding ->
                    HomeScreen(songsList = songsList,innerPadding)
                }
            }
        }
    }

}