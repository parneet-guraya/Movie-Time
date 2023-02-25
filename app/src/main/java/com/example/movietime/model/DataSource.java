package com.example.movietime.model;

import android.content.Context;

import com.example.movietime.R;

import java.util.LinkedList;
import java.util.List;

public class DataSource {
    private final List<Movie> list = new LinkedList<>();
    private Context applicationContext;
    private final String[] movieNamesArr = applicationContext.getResources().getStringArray(R.array.movie_names);
    private final String[] mPosterUrl = applicationContext.getResources().getStringArray(R.array.movie_poster_images);

    public DataSource(Context applicationContext) {
       this.applicationContext = applicationContext;
    }

    public DataSource loadListData() {
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
