package com.sudmanche.imageswiper.java.fullPager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ContentPagerAdapter extends FragmentStatePagerAdapter {

	private int count;
	
	public ContentPagerAdapter(FragmentManager fm, int itemCount) {
		super(fm);
		count = itemCount;
	}

	@Override
	public Fragment getItem(int arg0) {
		return new PageFragment();
	}

	@Override
	public int getCount() {
		return count;
	}

}
