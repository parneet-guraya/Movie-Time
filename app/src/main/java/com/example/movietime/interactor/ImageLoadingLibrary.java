package com.example.movietime.interactor;

import android.net.Uri;
import android.view.View;

public interface ImageLoadingLibrary {

    ImageLoadingLibrary init();
    void load(Uri uri, View imageView);

}
