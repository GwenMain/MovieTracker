package com.example.movietracker

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private val movies = listOf(
        "Inception",
        "The Dark Knight",
        "Interstellar",
        "Fight Club",
        "Pulp Fiction"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Reference to the ListView
        val movieListView: ListView = findViewById(R.id.movie_list)

        // Set adapter for ListView
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, movies)
        movieListView.adapter = adapter

        // Set click listener for items
        movieListView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedMovie = movies[position]

            // Navigate to MovieDetailActivity
            val intent = Intent(this, MovieDetailActivity::class.java)
            intent.putExtra("MOVIE_TITLE", selectedMovie)
            startActivity(intent)
        }
    }
}
