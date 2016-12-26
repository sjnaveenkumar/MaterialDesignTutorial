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
public class IconTextTabFragment extends Fragment {


    TextView tv_init, tv_init_java, tv_red;
    ImageView img_tab;

    public IconTextTabFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_tabs, container, false);
        intit(v);
        String tinit = "tabLayout.getTabAt(0).setIcon(tabIcons[0]);\n" +
                "tabLayout.getTabAt(1).setIcon(tabIcons[1]);";

        tv_init.setText(tinit);
        tv_red.setText("key lines");
        String fixed_init = "public class Tab extends AppCompatActivity {\n" +
                " \n" +
                "    private Toolbar toolbar;\n" +
                "    private TabLayout tabLayout;\n" +
                "    private ViewPager viewPager;\n" +
                "    private int[] tabIcons = {\n" +
                "            R.drawable.ic_tab_favourite,\n" +
                "            R.drawable.ic_tab_call,\n" +
                "            R.drawable.ic_tab_contacts\n" +
                "    };\n" +
                " \n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
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
                "        setupTabIcons();\n" +
                "    }\n" +
                " \n" +
                "    private void setupTabIcons() {\n" +
                "        tabLayout.getTabAt(0).setIcon(tabIcons[0]);\n" +
                "        tabLayout.getTabAt(1).setIcon(tabIcons[1]);\n" +
                "        tabLayout.getTabAt(2).setIcon(tabIcons[2]);\n" +
                "    }\n" +
                " \n" +
                "    private void setupViewPager(ViewPager viewPager) {\n" +
                "        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());\n" +
                "        adapter.addFrag(new OneFragment(), \"ONE\");\n" +
                "        adapter.addFrag(new TwoFragment(), \"TWO\");\n" +
                "        adapter.addFrag(new ThreeFragment(), \"THREE\");\n" +
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
        img_tab.setImageResource(R.drawable.icon_text_tab);

    }


}
