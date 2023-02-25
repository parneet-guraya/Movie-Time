package com.example.movietime.glide;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.RequestManager;
import com.example.movietime.interactor.ImageLoadingLibrary;

public class GlideImageLoader implements ImageLoadingLibrary {
    private final Context context;

    public GlideImageLoader(Context context) {
        this.context = context;
    }

    // TODO: see is it okay to use this class name as return type?
    @Override
    public ImageLoadingLibrary init() {

        return this;
    }

    @Override
    public void load(Uri uri, View imageView) {
        Glide.with(context).load(uri).into((ImageView)imageView);
    }
}
