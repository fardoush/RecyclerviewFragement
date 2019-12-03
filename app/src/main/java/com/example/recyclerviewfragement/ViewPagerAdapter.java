package com.example.recyclerviewfragement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> listFragement= new ArrayList<>();
    private  final List<String> listTitle= new ArrayList<>();

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTitle.get(position);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFragement.get(position);
    }

    @Override
    public int getCount() {
        return listTitle.size();
    }


    public void AddFragement(Fragment fragment, String title){
        listFragement.add(fragment);
        listTitle.add(title);

    }
}
