package com.example.recyclerviewfragement;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayoutId);
        viewPager=findViewById(R.id.viewpager_id);
        adapter= new ViewPagerAdapter(getSupportFragmentManager());

        //add fragement

        adapter.AddFragement(new FragementCall(),"Call");
        adapter.AddFragement(new FragementContact(),"Contact");
        adapter.AddFragement(new FavFragement()," Favories") ;


        //
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_contacts);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);

        //remove shadov from the action bar

//        ActionBar actionBar = getSupportActionBar();
//        actionBar.setElevation();
    }
}
