package com.example.jasmi.instagramclone.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/*
Class that store fragments for the apps
 */
public class SectionPageAdapter extends FragmentPagerAdapter{

    private static final String TAG = "SectionsPagerAdapter";

    private final List<Fragment>  mFragmentList = new ArrayList<>();

    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        return mFragmentList.get(position);
    }

    @Override
    public int getCount(){
        return mFragmentList.size();
    }

    public void addFragment(Fragment fragment){
        mFragmentList.add(fragment);
    }

}
