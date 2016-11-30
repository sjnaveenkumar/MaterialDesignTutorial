package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by naveen on 10/11/16.
 */

public class BottomNavigation extends BaseActivity {

    ImageView imageView;
    TextView tXml, tCode;
    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;
    String xmlCode = "   <android.support.design.widget.BottomNavigationView\n" +
            "        android:id=\"@+id/bottom_navigation\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_alignParentBottom=\"true\"\n" +
            "        app:itemBackground=\"@color/colorPrimary\"\n" +
            "        app:itemIconTint=\"@color/white\"\n" +
            "        app:itemTextColor=\"@color/white\"\n" +
            "        app:menu=\"@menu/bottom_navigation_main\" />";
    String javaCode = "BottomNavigationView bottomNavigationView = (BottomNavigationView)\n" +
            "                findViewById(R.id.bottom_navigation);\n" +
            "        \n" +
            "bottomNavigationView.setOnNavigationItemSelectedListener(\n" +
            "        new BottomNavigationView.OnNavigationItemSelectedListener() {\n" +
            "            @Override\n" +
            "            public boolean onNavigationItemSelected(@NonNull MenuItem item) {\n" +
            "                switch (item.getItemId()) {\n" +
            "                    case R.id.custom_tabs:\n" +
            "                        \n" +
            "                        break;\n" +
            "                    case R.id.navigation_view:\n" +
            "                    \n" +
            "                        break;\n" +
            "                    case R.id.textinputlayout:\n" +
            "                    \n" +
            "                        break;\n" +
            "                }\n" +
            "                return false;\n" +
            "            }\n" +
            "        });";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnavigationview);
        toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        imageView = (ImageView) findViewById(R.id.bottom_img);
        tXml = (TextView) findViewById(R.id.bottom_xml_code);
        tCode = (TextView) findViewById(R.id.bottom_java_code);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        Glide.with(this).load(R.drawable.bottomnavigation).into(imageView);
        tXml.setText(xmlCode);
        tCode.setText(javaCode);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_custom_tabs:
                        Toast.makeText(BottomNavigation.this, "You clicked Custom Tabs", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_nav_view:
                        Toast.makeText(BottomNavigation.this, "You clicked Navigation View", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_textinputlayout:
                        Toast.makeText(BottomNavigation.this, "You clicked TextInputLayout", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }
}
