package com.sudmanche.imageswiper.java.uIControls;

import com.sudmanche.imageswiper.java.R;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class NestingViewPager extends ViewPager {

	public NestingViewPager(final Context context, final AttributeSet attrs) {
	    super(context, attrs);
	}

	public NestingViewPager(final Context context) {
	    super(context);
	}
	
	@Override
	public boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
	    if (v != this && v instanceof ViewPager) {
	        return true;
	    }
	    return super.canScroll(v, checkV, dx, x, y);
	}
	
	@Override
	public boolean onInterceptTouchEvent (MotionEvent ev) {
		
		ViewPager pager = (ViewPager) findViewById(R.id.imagePager);
		
		if (pager != null)
		{
			pager.requestDisallowInterceptTouchEvent(true);
		}
		
		return super.onInterceptTouchEvent(ev);
	}
}
