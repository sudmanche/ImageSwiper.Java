package com.sudmanche.imageswiper.java.imagePager;

import com.sudmanche.imageswiper.java.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageFragment extends Fragment {

    public ImageView imageView;
    public LinearLayout layout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //inflate view
        View _view = inflater.inflate(R.layout.imagefragment, container, false);
        imageView = (ImageView) _view.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.ic_launcher);

        return _view;
    }
}
