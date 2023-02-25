package com.example.movietime;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import com.example.movietime.adapter.MovieAdapter;
import com.example.movietime.databinding.ActivityMainBinding;
import com.example.movietime.glide.GlideImageLoader;
import com.example.movietime.model.DataSource;
import com.example.movietime.model.Movie;

import java.util.List;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());


        List<Movie> movieList = new DataSource(getApplicationContext()).loadListData().getMovieList();
        MovieAdapter adapter = new MovieAdapter(this,movieList,new GlideImageLoader(this));


        mainBinding.movieListRecyclerView.setLayoutManager(new GridLayoutManager(this,2));
        mainBinding.movieListRecyclerView.setAdapter(adapter);


    }
}