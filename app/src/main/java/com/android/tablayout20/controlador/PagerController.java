package com.android.tablayout20.controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {

    int numoftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        this.numoftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new BlankFragmentQueEstudio();
            case 1:
                return new BlankFragmentQuienSoy();
            case 2:
                return new BlankFragmentTecnologias();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {

        return numoftabs;
    }
}
