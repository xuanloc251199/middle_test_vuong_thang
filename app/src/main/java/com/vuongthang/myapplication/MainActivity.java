package com.vuongthang.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Thêm các Fragment vào adapter
        adapter.addFragment(new Fragment1(), "Tab 1");
        adapter.addFragment(new Fragment2(), "Tab 2");
        adapter.addFragment(new Fragment3(), "Tab 3");

        // Set adapter cho ViewPager
        viewPager.setAdapter(adapter);

        // Liên kết ViewPager với TabLayout
        tabLayout.setupWithViewPager(viewPager);
    }
}
