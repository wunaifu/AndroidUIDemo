package com.wnf.androiduidemo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.wnf.androiduidemo.R;
import com.wnf.androiduidemo.fragment.OneFragment;

import java.util.ArrayList;
import java.util.List;

public class StartActivity1 extends FragmentActivity implements ViewPager.OnPageChangeListener {


    private ViewPager mViewPager;
    private List<Fragment> mTabs = new ArrayList<Fragment>();
    private FragmentPagerAdapter mAdapter;

    OneFragment homepageTabFragment = new OneFragment();
    OneFragment shareTabFragment = new OneFragment();
    OneFragment meTabFragment = new OneFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start1);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);//获取viewpager
        mTabs.add(homepageTabFragment);
        mTabs.add(shareTabFragment);
        mTabs.add(meTabFragment);

        mAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount(){
                return mTabs.size();
            }

            @Override
            public Fragment getItem(int position){
                return mTabs.get(position);
            }
        };
        mViewPager.setAdapter(mAdapter);//用adapter为viewpager赋值
        mViewPager.setOnPageChangeListener(this);

    }

    /*
     *从左到右和从右到左滑动，透明度变化
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
