package com.material.naveen.materialdesigntutorial.mdt.activities.basics;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/4/2015.
 */
public class Card_try extends BaseActivity {

    SeekBar seekBar_ele, seekBar_rad;
    CardView card_elevation, card_radius;
    TextView tv, tv1, tv2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_try);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        seekBar_ele = (SeekBar) findViewById(R.id.seekbar_elevation);
        card_elevation = (CardView) findViewById(R.id.card_elevation);
        tv = (TextView) findViewById(R.id.txt_xml_cardEle);
        tv2 = (TextView) findViewById(R.id.txt_ripple_card);
        seekBar_rad = (SeekBar) findViewById(R.id.seekbar_rad);
        card_radius = (CardView) findViewById(R.id.card_radius);
        tv1 = (TextView) findViewById(R.id.txt_xml_cardRad);
        tv.setText("card_view:cardElevation=\"4dp\"");
        tv1.setText("card_view:cardCornerRadius=\"4dp\"");

        tv2.setText("android:clickable=\"true\"\n" +
                "android:foreground=\"?attr/selectableItemBackground\"");

        seekBar_rad.setProgress(4);
        seekBar_rad.setMax(30);
        seekBar_ele.setProgress(4);
        seekBar_ele.setMax(30);
        seekBar_rad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                card_radius.setRadius(progress);
                tv1.setText("card_view:cardCornerRadius=\"" + progress + "dp\"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar_ele.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                card_elevation.setCardElevation(progress);
                tv.setText("card_view:cardElevation=\"" + progress + "dp\"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
