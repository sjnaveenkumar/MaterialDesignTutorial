package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/7/2015.
 */
public class TextInputL extends BaseActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textinp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv = (TextView) findViewById(R.id.txtinp_code);
        String co = "<android.support.design.widget.TextInputLayout\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"match_parent\" >\n" +
                "" +
                "\n" +
                "                    <EditText\n" +
                "\n" +
                "                        android:layout_width=\"match_parent\"\n" +
                "                        android:layout_height=\"match_parent\"\n" +
                "                        android:hint=\"Example\" />\n" +
                "                </android.support.design.widget.TextInputLayout>";
        tv.setText(co);
    }
}
