package com.example.movietime.model;

import android.content.Context;

import com.example.movietime.R;

import java.util.LinkedList;
import java.util.List;

public class DataSource {
    private final List<Movie> list = new LinkedList<>();
    private final Context applicationContext;

    public DataSource(Context applicationContext) {
       this.applicationContext = applicationContext;
    }

    public DataSource loadListData() {
        String[] movieNamesArr = applicationContext.getResources().getStringArray(R.array.movie_names);
        String[] mPosterUrl = applicationContext.getResources().getStringArray(R.array.movie_poster_images);
        for (int i = 0; i < movieNamesArr.length; i++) {
            list.add(new Movie(movieNamesArr[i], mPosterUrl[i]));
        }
        return this;
    }

    public List<Movie> getMovieList(){
        if(!list.isEmpty()){
            return list;
        }
        return null;
    }

}
