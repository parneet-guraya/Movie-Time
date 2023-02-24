package com.example.movietime.model;

public class Movie {
    private final String movieName;
    private final int mPosterResId;

    public Movie(String movieName, int mPosterResId) {
        this.movieName = movieName;
        this.mPosterResId = mPosterResId;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMPosterResId() {
        return mPosterResId;
    }
}
