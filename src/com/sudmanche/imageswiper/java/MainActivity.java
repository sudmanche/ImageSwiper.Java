package com.sudmanche.imageswiper.java;

import com.sudmanche.imageswiper.java.fullPager.ContentPagerAdapter;
import com.sudmanche.imageswiper.java.uIControls.NestingViewPager;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

	protected ContentPagerAdapter adapter;
    protected NestingViewPager pager;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.pagercontainerlayout);
        
        //if (savedInstanceState == null) {
		//	getSupportFragmentManager().beginTransaction()
		//			.add(R.id.container, new PlaceholderFragment()).commit();
		//}
        
        adapter = new ContentPagerAdapter(this.getSupportFragmentManager(), 3);

        pager = (NestingViewPager) this.findViewById(R.id.pager);
        pager.setAdapter(adapter);

        }
    }


