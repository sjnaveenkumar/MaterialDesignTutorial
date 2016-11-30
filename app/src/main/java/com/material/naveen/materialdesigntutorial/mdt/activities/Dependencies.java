package com.material.naveen.materialdesigntutorial.mdt.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 1/11/2016.
 */
public class Dependencies extends BaseActivity {

    TextView hs, notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependency);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        hs = (TextView) findViewById(R.id.txt_shorhidenotes);
        notes = (TextView) findViewById(R.id.txt_notes);
        hs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = hs.getText().toString();

                if (s.matches("show notes")) {

                    hs.setText("hide notes");
                    notes.setVisibility(View.VISIBLE);

                } else if (s.matches("hide notes")) {

                    hs.setText("show notes");
                    notes.setVisibility(View.GONE);

                }
            }
        });
    }
}
