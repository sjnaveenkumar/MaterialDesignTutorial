package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/19/2015.
 */
public class Collapsing extends BaseActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv = (TextView) findViewById(R.id.txt_collapsing);
        String coll = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "\n" +
                "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:card_view=\"http://schemas.android.com/tools\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "\n" +
                "    <android.support.design.widget.CoordinatorLayout\n" +
                "        android:id=\"@+id/root_coordinator\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\">\n" +
                "\n" +
                "        <android.support.design.widget.AppBarLayout\n" +
                "            android:id=\"@+id/app_bar_layout\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"wrap_content\">\n" +
                "\n" +
                "            <android.support.design.widget.CollapsingToolbarLayout\n" +
                "                android:id=\"@+id/collapsing_toolbar_layout\"\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"wrap_content\"\n" +
                "                android:minHeight=\"?attr/actionBarSize\"\n" +
                "                app:contentScrim=\"?attr/colorPrimary\"\n" +
                "                app:layout_scrollFlags=\"scroll|exitUntilCollapsed\">\n" +
                "\n" +
                "                <ImageView\n" +
                "                    android:id=\"@+id/img_collapse\"\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"250dp\"\n" +
                "                    android:scaleType=\"centerCrop\"\n" +
                "                    app:layout_collapseMode=\"parallax\" />\n" +
                "\n" +
                "\n" +
                "                <android.support.v7.widget.Toolbar\n" +
                "                    android:id=\"@+id/appbar\"\n" +
                "                    android:layout_width=\"match_parent\"\n" +
                "                    android:layout_height=\"?attr/actionBarSize\"\n" +
                "                    android:theme=\"@style/ThemeOverlay.AppCompat.Dark.ActionBar\"\n" +
                "                    app:layout_collapseMode=\"pin\" />\n" +
                "            </android.support.design.widget.CollapsingToolbarLayout>\n" +
                "\n" +
                "\n" +
                "        </android.support.design.widget.AppBarLayout>\n" +
                "\n" +
                "        <android.support.v4.widget.NestedScrollView\n" +
                "            android:id=\"@+id/scroll\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"fill_parent\"\n" +
                "            android:clipToPadding=\"false\"\n" +
                "            app:layout_behavior=\"@string/appbar_scrolling_view_behavior\">\n" +
                "\n" +
                "\n" +
                "            <LinearLayout\n" +
                "                android:layout_width=\"match_parent\"\n" +
                "                android:layout_height=\"fill_parent\"\n" +
                "                android:orientation=\"vertical\">\n" +
                "\n" +
                "                    <-- your Layout here -->\n" +
                "\n" +
                "            </LinearLayout>\n" +
                "        </android.support.v4.widget.NestedScrollView>\n" +
                "\n" +
                "\n" +
                "    </android.support.design.widget.CoordinatorLayout>\n" +
                "</LinearLayout>";
        tv.setText(coll);

    }
}
