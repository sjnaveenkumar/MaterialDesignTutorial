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
import android.support.design.widget.NavigationView;
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
import com.material.naveen.materialdesigntutorial.mdt.activities.designsupport.Navigation_View;
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
    private NavigationView mNavigationView;

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
        Glide.with(getApplicationContext()).load(R.drawable.materialdesignintro).into((ImageView) findViewById(R.id.img_collapse));
        Glide.with(getApplicationContext()).load(R.drawable.materialdesigngoalslanguage).into((ImageView) findViewById(R.id.img_goal_one));
        Glide.with(getApplicationContext()).load(R.drawable.materialdesigngoalssystem).into((ImageView) findViewById(R.id.img_goal_two));
        Glide.with(getApplicationContext()).load(R.drawable.one).into((ImageView) findViewById(R.id.img_one));
        Glide.with(getApplicationContext()).load(R.drawable.two).into((ImageView) findViewById(R.id.img_two));
        Glide.with(getApplicationContext()).load(R.drawable.three).into((ImageView) findViewById(R.id.img_three));
        Glide.with(getApplicationContext()).load(R.drawable.whatismaterialenvironment3d).into((ImageView) findViewById(R.id.img_3d_goal));
        Glide.with(getApplicationContext()).load(R.drawable.s1).into((ImageView) findViewById(R.id.img_las_one));
        Glide.with(getApplicationContext()).load(R.drawable.s2).into((ImageView) findViewById(R.id.img_las_two));
        Glide.with(getApplicationContext()).load(R.drawable.s3).into((ImageView) findViewById(R.id.img_las_three));
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


    private void initNavigationView() {

        mNavigationView = (NavigationView) findViewById(R.id.navigation_drawer);
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
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                switch (menuItem.getItemId()) {


                    case R.id.menu_themes:
                        startActivity(new Intent(HomeActivity.this, ThemeActivity.class));
                        break;
                    case R.id.menu_appbar:
                        startActivity(new Intent(HomeActivity.this, ToolApp.class));
                        break;
                    case R.id.menu_cardview:
                        startActivity(new Intent(HomeActivity.this, Card.class));
                        break;
                    case R.id.menu_recyclerview:
                        startActivity(new Intent(HomeActivity.this, Recycle.class));
                        break;
                    case R.id.menu_nav_view:
                        startActivity(new Intent(HomeActivity.this, Navigation_View.class));
                        break;
                    case R.id.menu_textinputlayout:
                        startActivity(new Intent(HomeActivity.this, TextInputL.class));
                        break;
                    case R.id.menu_fab:
                        startActivity(new Intent(HomeActivity.this, FAB.class));
                        break;
                    case R.id.menu_snackbar:
                        startActivity(new Intent(HomeActivity.this, Snackbar.class));
                        break;
                    case R.id.menu_tabs:
                        startActivity(new Intent(HomeActivity.this, TabL.class
                        ));
                        break;
                    case R.id.menu_cordinate:
                        startActivity(new Intent(HomeActivity.this, CoordinateLayout.class));
                        break;
                    case R.id.menu_collapse:
                        startActivity(new Intent(HomeActivity.this, Collapsing.class));
                        break;
                    case R.id.menu_color:
                        startActivity(new Intent(HomeActivity.this, Colors.class));
                        break;
                    case R.id.menu_about:
                        startActivity(new Intent(HomeActivity.this, About.class));
                        break;
                    case R.id.menu_dependencies:
                        startActivity(new Intent(HomeActivity.this, Dependencies.class));
                        break;
                    case R.id.menu_bottom_navigation:
                        startActivity(new Intent(HomeActivity.this, BottomNavigation.class));
                        break;
                    case R.id.menu_ratethisapp:
                        Uri uri = Uri.parse("market://details?id=" + getPackageName());
                        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                        // To count with Play market backstack, After pressing back button,
                        // to taken back to our application, we need to add following flags to intent.
                        goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                                Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET |
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
                    case R.id.menu_videotutorials:

                        startActivity(new Intent(HomeActivity.this, VideoTutorial.class));

                        break;
                    case R.id.menu_bottom_sheet:
                        startActivity(new Intent(HomeActivity.this, BottomSheets.class));
                        break;
                    case R.id.menu_custom_tabs:
                        startActivity(new Intent(HomeActivity.this, CustomChromeTabs.class));
                        break;
                    case R.id.menu_suggestion:
                        startActivity(new Intent(HomeActivity.this, Suggestion.class));
                        break;

                }


                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.extra, menu);
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
