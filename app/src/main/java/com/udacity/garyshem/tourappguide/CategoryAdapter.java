package com.udacity.garyshem.tourappguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Events";
            case 1:
                return "Restaurants";
            case 2:
                return "Historical locations";
            case 3:
            default:
                return "Shopping centers";

        }
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EventsFragment();
            case 1:
                return new RestaurantsFragment();
            case 2:
                return new HistoryFragment();
            case 3:
            default:
                return new ShopsFragment();

        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
