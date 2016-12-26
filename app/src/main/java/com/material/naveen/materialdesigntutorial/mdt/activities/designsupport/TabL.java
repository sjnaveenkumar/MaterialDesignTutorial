package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;
import com.material.naveen.materialdesigntutorial.mdt.fragment.CenterAlignedFragment;
import com.material.naveen.materialdesigntutorial.mdt.fragment.FixedFragment;
import com.material.naveen.materialdesigntutorial.mdt.fragment.FullWidthFragment;
import com.material.naveen.materialdesigntutorial.mdt.fragment.HomeFragment;
import com.material.naveen.materialdesigntutorial.mdt.fragment.IconTextTabFragment;
import com.material.naveen.materialdesigntutorial.mdt.fragment.ScrollTabsFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Naveen on 12/9/2015.
 */
public class TabL extends BaseActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabl);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        viewPager = (ViewPager) findViewById(R.id.viewpager);

        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(), "HOME");
        adapter.addFragment(new FixedFragment(), "Fixed Tabs");
        adapter.addFragment(new FullWidthFragment(), "Full Width Tabs");
        adapter.addFragment(new CenterAlignedFragment(), "Center Aligned Tabs");
        adapter.addFragment(new ScrollTabsFragment(), "Scrollable Tabs");
        adapter.addFragment(new IconTextTabFragment(), "Tabs with Icons and Text");
        adapter.addFragment(new IconTabFragment(), "Tabs with only Icons");

        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


}
