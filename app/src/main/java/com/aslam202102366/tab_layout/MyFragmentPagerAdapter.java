package com.aslam202102366.tab_layout;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter
{
    private com.aslam202102366.tab_layout.BeritaFragment _beritaFragment = new BeritaFragment();
    private Context _context;
    private com.aslam202102366.tab_layout.ECommerceFragment _eCommerceFragment = new ECommerceFragment();
    private int _tabCount;
    private com.aslam202102366.tab_layout.KampusFragment _kampusFragment = new KampusFragment();

    public MyFragmentPagerAdapter(Context context, FragmentManager fragmentManager, int tabCount)
    {
        super(fragmentManager);

        _context = context;
        _tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return _eCommerceFragment;
            case 1:
                return _beritaFragment;
            default:
                return _kampusFragment;
        }
    }

    @Override
    public int getCount()
    {
        return _tabCount;
    }
}
