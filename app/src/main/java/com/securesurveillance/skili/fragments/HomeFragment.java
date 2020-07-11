package com.securesurveillance.skili.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.securesurveillance.skili.R;
import com.securesurveillance.skili.adapter.HomePagerAdapter;
import com.securesurveillance.skili.utility.PagerSlidingTabStrip;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private PagerSlidingTabStrip tabs;
    public static ViewPager pager;
    private HomePagerAdapter adapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        tabs = (PagerSlidingTabStrip) view.findViewById(R.id.tabs);
        pager = (ViewPager) view.findViewById(R.id.pager);
        adapter = new HomePagerAdapter(getChildFragmentManager());
        pager.setAdapter(adapter);
        tabs.setViewPager(pager);
        pager.setOffscreenPageLimit(0);
        pager.setCurrentItem(1);
        return view;
    }

}
