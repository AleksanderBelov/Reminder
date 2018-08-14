package com.example.sasha.reminder.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

import com.example.sasha.reminder.fragment.CurrentTaskFragment;
import com.example.sasha.reminder.fragment.DoneTaskFragment;

public class TabAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;


    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new CurrentTaskFragment();
            case 1:
                return new DoneTaskFragment();
            default:
                return null;

        }


    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
