package com.example.movietime.model;

public class Movie {
    private final String movieName;
    private final String mPosterUrl;

    public Movie(String movieName, String mPosterUrl) {
        this.movieName = movieName;
        this.mPosterUrl = mPosterUrl;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMPosterResId() {
        return mPosterUrl;
    }
}
