package com.material.naveen.materialdesigntutorial.mdt.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;

/**
 * Created by Naveen on 12/18/2015.
 */
public class ScrollTabsFragment extends Fragment {


    TextView tv_init, tv_init_java, tv_red;
    ImageView img_tab;

    public ScrollTabsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tabs, container, false);
        intit(v);
        tv_red.setText("tab.xml (app:tabMode:\"scrollable\")");
        String tinit = "<android.support.design.widget.AppBarLayout\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"wrap_content\">\n" +
                "\n" +
                "                    <android.support.v7.widget.Toolbar\n" +
                "                        android:layout_width=\"match_parent\"\n" +
                "                        android:layout_height=\"?attr/actionBarSize\"\n" +
                "                        android:background=\"@color/colorPrimaryHome\">\n" +
                "\n" +
                "                        <TextView\n" +
                "                            android:layout_width=\"wrap_content\"\n" +
                "                            android:layout_height=\"wrap_content\"\n" +
                "                            android:text=\"Toolbar\"\n" +
                "                            android:textSize=\"24sp\" />\n" +
                "\n" +
                "                    </android.support.v7.widget.Toolbar>\n" +
                "\n" +
                "                    <android.support.design.widget.TabLayout\n" +
                "                        android:id=\"@+id/tabs\"\n" +
                "                        android:layout_width=\"match_parent\"\n" +
                "                        android:layout_height=\"wrap_content\"\n" +
                "\n" +
                "                        app:tabGravity=\"fill\"\n" +
                "                        app:tabMode=\"scrollable\" />\n" +
                "\n" +
                "                </android.support.design.widget.AppBarLayout>\n" +
                "\n" +
                "                <android.support.v4.view.ViewPager\n" +
                "                    android:id=\"@+id/viewpager\"\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"match_parent\"\n" +
                "                    app:layout_behavior=\"@string/appbar_scrolling_view_behavior\" />\n";

        tv_init.setText(tinit);

        String fixed_init = "public class Tab extends AppCompatActivity {\n" +
                " \n" +
                "    private Toolbar toolbar;\n" +
                "    private TabLayout tabLayout;\n" +
                "    private ViewPager viewPager;\n" +
                " \n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.tab);\n" +
                " \n" +
                "        toolbar = (Toolbar) findViewById(R.id.toolbar);\n" +
                "        setSupportActionBar(toolbar);\n" +
                "        getSupportActionBar().setDisplayHomeAsUpEnabled(true);\n" +
                " \n" +
                "        viewPager = (ViewPager) findViewById(R.id.viewpager);\n" +
                "        setupViewPager(viewPager);\n" +
                " \n" +
                "        tabLayout = (TabLayout) findViewById(R.id.tabs);\n" +
                "        tabLayout.setupWithViewPager(viewPager);\n" +
                "    }\n" +
                " \n" +
                "    private void setupViewPager(ViewPager viewPager) {\n" +
                "        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());\n" +
                "        adapter.addFrag(new OneFragment(), \"ONE\");\n" +
                "        adapter.addFrag(new TwoFragment(), \"TWO\");\n" +
                "        adapter.addFrag(new ThreeFragment(), \"THREE\");\n" +
                "        adapter.addFrag(new FourFragment(), \"FOUR\");\n" +
                "        adapter.addFrag(new FiveFragment(), \"FIVE\");\n" +
                "        adapter.addFrag(new SixFragment(), \"SIX\");\n" +
                "        adapter.addFrag(new SevenFragment(), \"SEVEN\");\n" +
                "        adapter.addFrag(new EightFragment(), \"EIGHT\");\n" +
                "        adapter.addFrag(new NineFragment(), \"NINE\");\n" +
                "        adapter.addFrag(new TenFragment(), \"TEN\");\n" +
                "        viewPager.setAdapter(adapter);\n" +
                "    }\n" +
                " \n" +
                "    class ViewPagerAdapter extends FragmentPagerAdapter {\n" +
                "        private final List<Fragment> mFragmentList = new ArrayList<>();\n" +
                "        private final List<String> mFragmentTitleList = new ArrayList<>();\n" +
                " \n" +
                "        public ViewPagerAdapter(FragmentManager manager) {\n" +
                "            super(manager);\n" +
                "        }\n" +
                " \n" +
                "        @Override\n" +
                "        public Fragment getItem(int position) {\n" +
                "            return mFragmentList.get(position);\n" +
                "        }\n" +
                " \n" +
                "        @Override\n" +
                "        public int getCount() {\n" +
                "            return mFragmentList.size();\n" +
                "        }\n" +
                " \n" +
                "        public void addFrag(Fragment fragment, String title) {\n" +
                "            mFragmentList.add(fragment);\n" +
                "            mFragmentTitleList.add(title);\n" +
                "        }\n" +
                " \n" +
                "        @Override\n" +
                "        public CharSequence getPageTitle(int position) {\n" +
                "            return mFragmentTitleList.get(position);\n" +
                "        }\n" +
                "    }\n" +
                "}";
        tv_init_java.setText(fixed_init);


        return v;
    }

    public void intit(View v) {
        tv_init = (TextView) v.findViewById(R.id.txt_tab_init);
        tv_init_java = (TextView) v.findViewById(R.id.txt_tab_init_classs);
        tv_red = (TextView) v.findViewById(R.id.txt_tab_red_xml);
        img_tab = (ImageView) v.findViewById(R.id.img_tab_eg);
        img_tab.setImageResource(R.drawable.scrollable_tabs);

    }


}
