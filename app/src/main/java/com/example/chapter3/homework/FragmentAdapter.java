package com.example.chapter3.homework;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter {
    private int mCount = 3 ;
    private String[] mStrings = new String[]{"这里是热门内容!", "这里是最新内容!", "这里是我的内容!"};
    private String[] mTitles = new String[]{"热门", "最新", "我的"};
    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return MyFragment.newInstance(mStrings[position]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}