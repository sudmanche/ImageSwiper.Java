package com.sudmanche.imageswiper.java.fullPager;


import com.sudmanche.imageswiper.java.R;
import com.sudmanche.imageswiper.java.imagePager.ImageFragmentAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PageFragment extends Fragment {
	
	protected ImageFragmentAdapter imageAdapter;
    protected ViewPager imagePager;
    protected ImageView imageView;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //inflate view
        View itemView = inflater.inflate(R.layout.pageritemfragment, container, false);
        imagePager = (ViewPager) itemView.findViewById(R.id.imagePager);

        //create adapter, 3 images
        imageAdapter = new ImageFragmentAdapter(this.getFragmentManager(), 3);
        imagePager.setAdapter(imageAdapter);

        return itemView;
    }
   

}
