package com.example.musicmanager

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MusicDetailsScreen : AppCompatActivity() {


    private lateinit var playlistEntries: ListView
    private lateinit var averageRating: TextView
    private lateinit var btnDisplayPlaylist: Button
    private lateinit var calculateRatingBtn: Button
    private lateinit var btnReturnToMain: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music_details_screen)


        playlistEntries = findViewById(R.id.playlistEntries)
        averageRating = findViewById(R.id.averageRating)
        btnDisplayPlaylist = findViewById(R.id.btnDisplayPlaylist)
        calculateRatingBtn = findViewById(R.id.calculateRatingBtn)
        btnReturnToMain = findViewById(R.id.btnReturnToMain)



        val songs = intent.getStringArrayExtra("songs") ?: return
        val artists = intent.getIntArrayExtra("artists") ?: return
        val comments= intent.getIntArrayExtra("comments") ?: return

        val averageRating = findViewById<TextView>(R.id.averageRating)
        val displayButton = findViewById<Button>(R.id.btnDisplayPlaylist)
        val returnToMain = findViewById<Button>(R.id.btnReturnToMain)





        btnReturnToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish(0)
        }





        }
    }
}