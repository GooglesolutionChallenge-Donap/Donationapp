package com.example.donationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class receiverhomepage extends AppCompatActivity {

    TabLayout tablayout;
    TabItem tabitem1, tabitem2;
    ViewPager viewpager;
    PagerAdapter pageradapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiverhomepage);

//        change status bar color
        statusbar.blackiconstatusbar(receiverhomepage.this,R.color.light_bg);

        tablayout=(TabLayout) findViewById(R.id.receiver_homepage);
        tabitem1=(TabItem) findViewById(R.id.receiver_foodtab);
        tabitem2=(TabItem) findViewById(R.id.receiver_clothtab);

        viewpager=(ViewPager) findViewById(R.id.receiver_vpager);

        pageradapter=new pageadapter(getSupportFragmentManager(), tablayout.getTabCount());
        viewpager.setAdapter(pageradapter);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());

                if (tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2)
                    pageradapter.notifyDataSetChanged();;
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

    }
}