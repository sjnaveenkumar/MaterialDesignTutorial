package com.material.naveen.materialdesigntutorial.mdt.activities.colors;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.adapters.Color_Adapter;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;
import com.material.naveen.materialdesigntutorial.mdt.interfaces.RecyclerItemClickListener;

/**
 * Created by Naveen on 12/19/2015.
 */
public class Colors extends BaseActivity {
    LinearLayoutManager layoutManager;
    RecyclerView recyclerView;

    String[] color_name = {"Red", "Pink", "Purple", "Deep Purple", "Indigo", "Blue", "Light Blue", "Cyan",
            "Teal", "Green", "Light Green", "Lime", "Yellow", "Amber", "Orange", "Deep Orange",
            "Brown", "Grey", "Blue Grey", "Black", "White"};

    String[] color_codes = {"F44336", "E91E63", "9C27B0", "673AB7", "3F51B5", "2196F3",
            "03A9F4", "00BCD4", "009688", "4CAF50", "8BC34A", "CDDC39", "FFEB3B", "FFC107",
            "FF9800", "FF5722", "795548", "9E9E9E", "607D8B", "000000", "FFFFFF"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        int screenSize = getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK;

        switch (screenSize) {
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    layoutManager = new GridLayoutManager(Colors.this, 4);
                } else {
                    layoutManager = new GridLayoutManager(Colors.this, 3);

                }
                break;
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    layoutManager = new GridLayoutManager(Colors.this, 3);
                } else {
                    layoutManager = new GridLayoutManager(Colors.this, 2);

                }
                break;
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
                if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                    layoutManager = new GridLayoutManager(Colors.this, 2);
                } else {
                    layoutManager = new GridLayoutManager(Colors.this, 1);

                }
                break;
            default:
        }


        recyclerView = (RecyclerView) findViewById(R.id.recycler_colors);
        recyclerView.setLayoutManager(layoutManager);

        Color_Adapter adapter = new Color_Adapter(Colors.this, color_name, color_codes);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(Colors.this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {


                switch (position) {
                    //19
                    case 0:
                        startActivity(new Intent(Colors.this, Colors_red.class));

                        break;
                    case 1:
                        startActivity(new Intent(Colors.this, Colors_pink.class));

                        break;
                    case 2:
                        startActivity(new Intent(Colors.this, Colors_purple.class));

                        break;
                    case 3:
                        startActivity(new Intent(Colors.this, Colors_deeppurple.class));

                        break;
                    case 4:
                        startActivity(new Intent(Colors.this, Colors_indigo.class));

                        break;
                    case 5:
                        startActivity(new Intent(Colors.this, Colors_blue.class));

                        break;
                    case 6:
                        startActivity(new Intent(Colors.this, Colors_lightblue.class));

                        break;
                    case 7:
                        startActivity(new Intent(Colors.this, Colors_cyan.class));

                        break;
                    case 8:
                        startActivity(new Intent(Colors.this, Colors_teal.class));

                        break;
                    case 9:
                        startActivity(new Intent(Colors.this, Colors_green.class));

                        break;
                    case 10:
                        startActivity(new Intent(Colors.this, Colors_lightgreen.class));

                        break;
                    case 11:
                        startActivity(new Intent(Colors.this, Colors_lime.class));

                        break;
                    case 12:
                        startActivity(new Intent(Colors.this, Colors_yellow.class));

                        break;
                    case 13:
                        startActivity(new Intent(Colors.this, Colors_amber.class));

                        break;
                    case 14:
                        startActivity(new Intent(Colors.this, Colors_orange.class));

                        break;
                    case 15:
                        startActivity(new Intent(Colors.this, Colors_deeporange.class));

                        break;
                    case 16:
                        startActivity(new Intent(Colors.this, Colors_brown.class));

                        break;
                    case 17:
                        startActivity(new Intent(Colors.this, Colors_grey.class));

                        break;
                    case 18:
                        startActivity(new Intent(Colors.this, Colors_bluegray.class));

                        break;
                }


            }
        }));

        // RecyclerViewAdapter adapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        //recyclerView.setAdapter(adapter);
    }
}
