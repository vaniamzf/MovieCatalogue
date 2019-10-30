package com.example.aplikasimovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovie extends AppCompatActivity {

    public static final String EXTRA = "extra";

    TextView Movejudul;
    TextView Movedeskripsi;
    TextView Movegenres;
    ImageView poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_detail);

        Movejudul = findViewById(R.id.txt_detail_title);
        Movedeskripsi = findViewById(R.id.txt_desc);
        Movegenres = findViewById(R.id.txt_genres);
        poster = findViewById(R.id.image_poster);

        Movie movie = getIntent().getParcelableExtra(EXTRA);

        Movejudul.setText(movie.getTitle());
        Movedeskripsi.setText(movie.getDescription());
        Movegenres.setText(movie.getGenres());
        poster.setImageResource(movie.getPhoto());
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
        ///
    }
}
