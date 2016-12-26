package com.material.naveen.materialdesigntutorial.mdt.activities;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.activities.basics.Card;
import com.material.naveen.materialdesigntutorial.mdt.activities.basics.Recycle;
import com.material.naveen.materialdesigntutorial.mdt.activities.basics.ThemeActivity;
import com.material.naveen.materialdesigntutorial.mdt.activities.basics.ToolApp;
import com.material.naveen.materialdesigntutorial.mdt.activities.colors.Colors;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.BottomNavigation;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.BottomSheets;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.Collapsing;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.CoordinateLayout;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.CustomChromeTabs;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.FAB;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.NavigationView;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.Snackbar;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.TabL;
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.TextInputL;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/2/2015.
 */
public class HomeActivity extends BaseActivity {


    boolean isShow = false;
    int scrollRange = -1;
    Toolbar toolbar;
    CollapsingToolbarLayout collapsingToolbarLayout;
    AppBarLayout appBarLayout;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private android.support.design.widget.NavigationView mNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homelayout);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initNavigationView();
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        collapsingToolbarLayout.setTitle("M D T");
        collapsingToolbarLayout.setExpandedTitleColor(Color.BLACK);
        collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
        appBarLayout = (AppBarLayout) findViewById(R.id.app_bar_layout);
        loadImages(R.drawable.materialdesignintro, R.id.img_collapse);
        loadImages(R.drawable.materialdesigngoalslanguage, R.id.img_goal_one);
        loadImages(R.drawable.materialdesigngoalssystem, R.id.img_goal_two);
        loadImages(R.drawable.one, R.id.img_one);
        loadImages(R.drawable.two, R.id.img_two);
        loadImages(R.drawable.three, R.id.img_three);
        loadImages(R.drawable.whatismaterialenvironment3d, R.id.img_3d_goal);
        loadImages(R.drawable.s1, R.id.img_las_one);
        loadImages(R.drawable.s2, R.id.img_las_two);
        loadImages(R.drawable.s3, R.id.img_las_three);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbarLayout.setTitle("Material Design Tutorial");
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbarLayout.setTitle("M D T");
                    isShow = false;
                }
            }
        });
    }

    private void loadImages(int drawable, int resId) {
        Glide.with(getApplicationContext()).load(drawable).into((ImageView) findViewById(resId));
    }

    private void intentToClass(Class object) {
        startActivity(new Intent(HomeActivity.this, object));
    }

    private void initNavigationView() {

        mNavigationView = (android.support.design.widget.NavigationView) findViewById(R.id.navigation_drawer);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open_nav_drawer, R.string.close_nav_drawer) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                invalidateOptionsMenu();
            }
        };
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mNavigationView.setNavigationItemSelectedListener(new android.support.design.widget.NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                switch (menuItem.getItemId()) {


                    case R.id.menu_themes:
                        intentToClass(ThemeActivity.class);
                        break;
                    case R.id.menu_appbar:
                        intentToClass(ToolApp.class);
                        break;
                    case R.id.menu_cardview:
                        intentToClass(Card.class);
                        break;
                    case R.id.menu_recyclerview:
                        intentToClass(Recycle.class);
                        break;
                    case R.id.menu_nav_view:
                        intentToClass(NavigationView.class);
                        break;
                    case R.id.menu_textinputlayout:
                        intentToClass(TextInputL.class);
                        break;
                    case R.id.menu_fab:
                        intentToClass(FAB.class);
                        break;
                    case R.id.menu_snackbar:
                        intentToClass(Snackbar.class);
                        break;
                    case R.id.menu_tabs:
                        intentToClass(TabL.class);
                        break;
                    case R.id.menu_cordinate:
                        intentToClass(CoordinateLayout.class);
                        break;
                    case R.id.menu_collapse:
                        intentToClass(Collapsing.class);
                        break;
                    case R.id.menu_color:
                        intentToClass(Colors.class);
                        break;
                    case R.id.menu_about:
                        intentToClass(About.class);
                        break;
                    case R.id.menu_dependencies:
                        intentToClass(Dependencies.class);
                        break;
                    case R.id.menu_bottom_navigation:
                        intentToClass(BottomNavigation.class);
                        break;
                    case R.id.menu_ratethisapp:
                        Uri uri = Uri.parse("market://details?id=" + getPackageName());
                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                                Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                        try {
                            startActivity(goToMarket);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
                        }
                        break;
                    case R.id.menu_material_icons:
                        String url = "https://design.google.com/icons/";
                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(url));
                        startActivity(i);
                        break;
                    case R.id.menu_bottom_sheet:
                        intentToClass(BottomSheets.class);
                        break;
                    case R.id.menu_custom_tabs:
                        intentToClass(CustomChromeTabs.class);
                        break;
                    case R.id.menu_suggestion:
                        intentToClass(Suggestion.class);
                        break;

                }


                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_extra, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        mDrawerToggle.onOptionsItemSelected(item);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }


}
