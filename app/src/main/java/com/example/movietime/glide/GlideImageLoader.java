package com.example.movietime.glide;

import android.content.Context;
import android.net.Uri;
import android.view.View;

import com.example.movietime.interactor.ImageLoadingLibrary;

public class GlideImageLoader implements ImageLoadingLibrary {
private Context context;

    public GlideImageLoader(Context context){
        this.context = context;
    }

    // TODO: see is it okay to use this class name as return type?
    @Override
    public ImageLoadingLibrary init() {
        return null;
    }

    @Override
    public void load(Uri uri, View imageView) {

    }
}
