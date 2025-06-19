package com.example.musicmanager

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import java.util.ArrayList

class MusicInputScreen : AppCompatActivity() {

    private lateinit var  songs: Array<String>
    private lateinit var artists: Array<String>
    private lateinit var comments: Array<String>

    private lateinit var edArtistName: EditText
    private lateinit var edSongTitle: EditText
    private lateinit var spinnerRating: Spinner
    private lateinit var userComments: EditText
    private lateinit var addPlyBtn: Button
    private lateinit var nextBtn: Button
    private lateinit var exitBtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music_input_screen)


        edArtistName = findViewById(R.id.edArtistName)
        edSongTitle = findViewById(R.id.edSongTitle)
        userComments = findViewById(R.id.userComments)
        addPlyBtn = findViewById(R.id.addPlyBtn)
        nextBtn = findViewById(R.id.nextBtn)
        exitBtn = findViewById(R.id.exitBtn)


        initPlaylist()

        val spinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,spinnerRating)
        spinnerRating.adapter = spinnerAdapter


        addPlyBtn.setOnClickListener {
            songs [index] = edSongTitle.text.toString()
            artists[index] = edArtistName.text.toString()
            comments[index] = userComments.text.toString()

            Toast.makeText(this, "Data saved for ${spinnerRating[index]}", Toast.LENGTH_SHORT).show()
            edSongTitle.text.clear()
            edArtistName.text.clear()
            userComments.text.clear()


        }



            nextBtn.setOnClickListener {
                if (songs.isNotEmpty())
                val intent = Intent(this, MusicDetailsScreen::class.java)
                intent.putExtra("songs", (songs))
                intent.putExtra("artists", (artists))
                intent.putExtra("comments", (comments))
                startActivity(intent)


            exitBtn.setOnClickListener {
                finishAffinity()
            }
        }




    }












