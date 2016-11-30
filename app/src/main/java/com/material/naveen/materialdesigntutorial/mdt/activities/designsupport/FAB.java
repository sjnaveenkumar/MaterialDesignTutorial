package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/7/2015.
 */
public class FAB extends BaseActivity {

    FloatingActionButton floatingActionButton;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        tv = (TextView) findViewById(R.id.fab_code);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Hello, i\'m SnackBar", Snackbar.LENGTH_SHORT).show();
            }
        });

        String fcode = "<android.support.design.widget.FloatingActionButton xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "                    android:id=\"@+id/activity_fab\"\n" +
                "                    android:layout_width=\"wrap_content\"\n" +
                "                    android:layout_height=\"wrap_content\"\n" +
                "                    android:clickable=\"true\"\n" +
                "                    android:src=\"@drawable/ic_bell_white_24dp\"\n" +
                "                    app:backgroundTint=\"@color/colorPrimaryHome\"\n" +
                "                    app:borderWidth=\"0dp\"\n" +
                "                    app:elevation=\"6dp\"\n" +
                "                    app:fabSize=\"normal\"\n" +
                "                    app:rippleColor=\"@color/colorPrimaryDarkHome\" />\n";
        tv.setText(fcode);
    }
}
