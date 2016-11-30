package com.material.naveen.materialdesigntutorial.mdt.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 1/8/2016.
 */
public class About extends BaseActivity {

    CardView c_dp, c_dev, c_mdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        c_dp = (CardView) findViewById(R.id.card_designpicks);
        c_dev = (CardView) findViewById(R.id.card_devaccount);
        Glide.with(About.this).load("https://lh3.googleusercontent.com/x3_-wv6zoz6VZUYn1UEGguT4hoUQJUg0fY0viFLzh7i2uFyKSAFlFyoZs1wZDjHPe6k=w300-rw").into((ImageView) findViewById(R.id.designpicks));
        c_dp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/details?id=com.abara.fireclip&hl=en";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        c_dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://play.google.com/store/apps/dev?id=5533006317692836241";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
