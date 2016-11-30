package com.material.naveen.materialdesigntutorial.mdt.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

public class SplashActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Glide.with(SplashActivity.this).load(R.drawable.mdt).into((ImageView) findViewById(R.id.img_splash));
        new CountDownTimer(1500, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            }
        }.start();
    }
}
