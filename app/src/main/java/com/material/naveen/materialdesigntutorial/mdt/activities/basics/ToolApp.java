package com.material.naveen.materialdesigntutorial.mdt.activities.basics;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/3/2015.
 */
public class ToolApp extends BaseActivity {
    TextView tv, tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolapp);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String create = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<android.support.v7.widget.Toolbar xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:local=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:id=\"@+id/toolbar\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"wrap_content\"\n" +
                "    android:minHeight=\"?attr/actionBarSize\"\n" +
                "    android:background=\"?attr/colorPrimary\"\n" +
                "    local:theme=\"@style/ThemeOverlay.AppCompat.Dark.ActionBar\"\n" +
                "    local:popupTheme=\"@style/ThemeOverlay.AppCompat.Light\" />";
        String inc = "<RelativeLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    tools:context=\".MainActivity\">\n" +
                " \n" +
                "    <LinearLayout\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_alignParentTop=\"true\"\n" +
                "        android:orientation=\"vertical\">\n" +
                " \n" +
                "        <include\n" +
                "            android:id=\"@+id/toolbar\"\n" +
                "            layout=\"@layout/toolbar\" />\n" +
                "    </LinearLayout>\n" +
                " \n" +
                " \n" +
                "</RelativeLayout>";
        String ja = "public class MainActivity extends AppCompatActivity {\n" +
                " \n" +
                "    private Toolbar mToolbar;\n" +
                " \n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_main);\n" +
                " \n" +
                "        mToolbar = (Toolbar) findViewById(R.id.toolbar);\n\n" +
                " \n" +
                "        setSupportActionBar(mToolbar);\n" +

                "    }\n" +
                "}\n";
        tv = (TextView) findViewById(R.id.tool_code);
        tv1 = (TextView) findViewById(R.id.tool_include);
        tv2 = (TextView) findViewById(R.id.tool_java);
        tv.setText(create);
        tv1.setText(inc);
        tv2.setText(ja);
    }
}
