package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/5/2015.
 */
public class NavigationView extends BaseActivity {

    TextView tv, tv1, tv2, tv3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv = (TextView) findViewById(R.id.nav_code);
        tv1 = (TextView) findViewById(R.id.nav_menu);
        tv2 = (TextView) findViewById(R.id.nav_header);
        tv3 = (TextView) findViewById(R.id.nav_toggle);
        String fcode = "<android.support.v4.widget.DrawerLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:fitsSystemWindows=\"true\">\n" +
                "\n" +
                "    <!-- your content layout -->\n" +
                "\n" +
                "    <android.support.design.widget.NavigationView\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            android:layout_gravity=\"start\"\n" +
                "            app:headerLayout=\"@layout/drawer_header\"\n" +
                "            app:menu=\"@menu/image4\"/>\n" +
                "</android.support.v4.widget.DrawerLayout>";
        String men = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<menu xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
                "    <group>\n" +
                "        <item android:title=\"Creating Apps with Material Design\">\n" +
                "            <menu>\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_themes\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"Themes\" />\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_appbar\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"Toolbar/AppBar\" />\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_cardview\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"CardView\" />\n" +
                "\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_recyclerview\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"RecyclerView\" />\n" +
                "\n" +
                "\n" +
                "            </menu>\n" +
                "        </item>\n" +
                "    </group>\n" +
                "    <group>\n" +
                "        <item android:title=\"Design Support Library\">\n" +
                "            <menu>\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_nav_view\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"Navigation View\" />\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_textinputlayout\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"TextInputLayout\" />\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_fab\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"Floating Action Button\" />\n" +
                "\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_snackbar\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"Snackbar\" />\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_tabs\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"Tabs\" />\n" +
                "\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_cordinate\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"CoordinatorLayout\" />\n" +
                "\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_appbarlayout\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"AppBarLayout\" />\n" +
                "\n" +
                "                <item\n" +
                "                    android:id=\"@+id/menu_collapse\"\n" +
                "                    android:icon=\"@mipmap/ic_launcher\"\n" +
                "                    android:title=\"CollapsingToolbarLayout\" />\n" +
                "\n" +
                "\n" +
                "            </menu>\n" +
                "        </item>\n" +
                "    </group>\n" +
                "\n" +
                "</menu>";
        String head = "<android.support.design.widget.CoordinatorLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    android:layout_width=\"fill_parent\"\n" +
                "    android:layout_height=\"240dp\"\n" +
                "    android:background=\"@color/colorPrimaryHome\">\n" +
                "\n" +
                "\n" +
                "    <ImageView\n" +
                "        android:id=\"@+id/img_drawer_header\"\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        android:src=\"@drawable/mdt1\"\n" +
                "        android:scaleType=\"centerCrop\" />\n" +
                "</android.support.design.widget.CoordinatorLayout>\n";
        String tog = "\n" +
                "public class NavigationActivity extends AppCompatActivity {\n" +
                "\n" +
                "    private DrawerLayout mDrawerLayout;\n" +
                "    private ActionBarDrawerToggle mDrawerToggle;\n" +
                "    private NavigationView mNavigationView;\n" +
                "    Toolbar toolbar;\n" +
                "    CollapsingToolbarLayout collapsingToolbarLayout;\n" +
                "    AppBarLayout appBarLayout;\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(@Nullable Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.navi_layout);\n" +
                "       \n" +
                "\n" +
                "        toolbar = (Toolbar) findViewById(R.id.appbar);\n" +
                "        setSupportActionBar(toolbar);\n" +
                "        getSupportActionBar().setDisplayHomeAsUpEnabled(true);\n" +
                "        initNavigationView();\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    private void initNavigationView() {\n" +
                "\n" +
                "        mNavigationView = (NavigationView) findViewById(R.id.navigation_drawer);\n" +
                "        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);\n" +
                "\n" +
                "        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open_nav_drawer, R.string.close_nav_drawer) {\n" +
                "            @Override\n" +
                "            public void onDrawerOpened(View drawerView) {\n" +
                "                super.onDrawerOpened(drawerView);\n" +
                "                invalidateOptionsMenu();\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void onDrawerClosed(View drawerView) {\n" +
                "                super.onDrawerClosed(drawerView);\n" +
                "                invalidateOptionsMenu();\n" +
                "            }\n" +
                "        };\n" +
                "        mDrawerLayout.post(new Runnable() {\n" +
                "            @Override\n" +
                "            public void run() {\n" +
                "                mDrawerToggle.syncState();\n" +
                "            }\n" +
                "        });\n" +
                "        mDrawerToggle.setDrawerIndicatorEnabled(true);\n" +
                "        mDrawerLayout.setDrawerListener(mDrawerToggle);\n" +
                "        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {\n" +
                "            @Override\n" +
                "            public boolean onNavigationItemSelected(MenuItem menuItem) {\n" +
                "\n" +
                "                switch (menuItem.getItemId()) {\n" +
                "                    case R.id.menu_themes:\n" +
                "                        break;\n" +
                "                    case R.id.menu_appbar:\n" +
                "                        break;\n" +
                "                    case R.id.menu_cardview:\n" +
                "                        break;\n" +
                "                    case R.id.menu_recyclerview:\n" +
                "                        break;\n" +
                "                    case R.id.menu_nav_view:\n" +
                "                        break;\n" +
                "                }\n" +
                "                 return false;\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "\n" +
                "}\n";
        tv.setText(fcode);
        tv1.setText(men);
        tv2.setText(head);
        tv3.setText(tog);
    }
}
