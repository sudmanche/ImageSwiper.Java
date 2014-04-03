package com.sudmanche.imageswiper.java.imagePager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ImageFragmentAdapter extends FragmentStatePagerAdapter {

	private int count;
	
	public ImageFragmentAdapter(FragmentManager fm, int itemCount) {
		super(fm);
		count = itemCount;
	}

	@Override
	public Fragment getItem(int arg0) {
		return new ImageFragment();
	}

	@Override
	public int getCount() {
		return count;
	}

}
