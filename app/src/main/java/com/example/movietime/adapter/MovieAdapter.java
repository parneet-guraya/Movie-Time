package com.example.movietime.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movietime.databinding.MovieListItemBinding;
import com.example.movietime.glide.GlideImageLoader;
import com.example.movietime.interactor.ImageLoadingLibrary;
import com.example.movietime.model.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    private List<Movie> movieList;
    private Context context;
    private ImageLoadingLibrary imageLoadingLibrary;

    public MovieAdapter(Context context, List<Movie> movieList,ImageLoadingLibrary imageLoadingLibrary) {
        this.context = context;
        this.movieList = movieList;
        this.imageLoadingLibrary = imageLoadingLibrary;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView moviePosterIV;
        TextView movieNameTV;

        public MyViewHolder(MovieListItemBinding listItemBinding){
            super(listItemBinding.getRoot());
            moviePosterIV = listItemBinding.movieImage;
            movieNameTV = listItemBinding.movieName;
        }

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(MovieListItemBinding.inflate(LayoutInflater.from(context),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Movie mObj = movieList.get(position);
        loadImage(mObj.getMPosterResId(),holder.moviePosterIV);
        holder.movieNameTV.setText(mObj.getMovieName());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    void loadImage(String imageUri,ImageView imageView){
        imageLoadingLibrary.init().load(Uri.parse(imageUri),imageView);
    }
}
