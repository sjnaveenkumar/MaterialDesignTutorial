package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/18/2015.
 */
public class CoordinateLayout extends BaseActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv = (TextView) findViewById(R.id.txt_coridate);
        String cdoe = "<android.support.design.widget.CoordinatorLayout\n" +
                "        xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "        xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\">\n" +
                "     \n" +
                "     <! -- Your Scrollable View -->\n" +
                "    <android.support.v7.widget.RecyclerView\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\"\n" +
                "            app:layout_behavior=\"@string/appbar_scrolling_view_behavior\" />\n" +
                "\n" +
                "    <android.support.design.widget.AppBarLayout\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\">\n" +
                "   <android.support.v7.widget.Toolbar\n" +
                "                  ...\n" +
                "                  app:layout_scrollFlags=\"scroll|enterAlways\">\n" +
                "\n" +
                "        <android.support.design.widget.TabLayout\n" +
                "                  ...\n" +
                "                  app:layout_scrollFlags=\"scroll|enterAlways\">\n" +
                "     </android.support.design.widget.AppBarLayout>\n" +
                "</android.support.design.widget.CoordinatorLayout>";

        tv.setText(cdoe);

    }
}
