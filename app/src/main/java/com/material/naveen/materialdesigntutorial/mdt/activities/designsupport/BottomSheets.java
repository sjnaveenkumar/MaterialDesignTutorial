package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 3/6/2016.
 */
public class BottomSheets extends BaseActivity {

    TextView xml_code, java_code, last;
    Button btn;
    BottomSheetBehavior behavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomsheets);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Glide.with(BottomSheets.this).load(R.drawable.bottomsheet).into((ImageView) findViewById(R.id.bottom_img));
        xml_code = (TextView) findViewById(R.id.bottom_xml_code);
        java_code = (TextView) findViewById(R.id.bottom_java_code);
        last = (TextView) findViewById(R.id.bottom_last);
        btn = (Button) findViewById(R.id.bottom_try);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinate);
        View bottomSheet = coordinatorLayout.findViewById(R.id.bottom_sheet);
        behavior = BottomSheetBehavior.from(bottomSheet);
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {

            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
        behavior.setPeekHeight(1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
        last.setText("By attaching a BottomSheetBehavior to a child View of a CoordinatorLayout (i.e., adding app:layout_behavior=\"android.support.design.widget.BottomSheetBehavior\"), you’ll automatically get the appropriate touch detection to transition between five state:\n" +
                "\n\n" +
                "STATE_COLLAPSED: this collapsed state is the default and shows just a portion of the layout along the bottom. The height can be controlled with the app:behavior_peekHeight attribute (defaults to 0)\n\n" +
                "STATE_DRAGGING: the intermediate state while the user is directly dragging the bottom sheet up or down\n\n" +
                "STATE_SETTLING: that brief time between when the View is released and settling into its final position\n\n" +
                "STATE_EXPANDED: the fully expanded state of the bottom sheet, where either the whole bottom sheet is visible (if its height is less than the containing CoordinatorLayout) or the entire CoordinatorLayout is filled\n\n" +
                "STATE_HIDDEN: disabled by default (and enabled with the app:behavior_hideable attribute), enabling this allows users to swipe down on the bottom sheet to completely hide the bottom sheet\n\n" +
                "Keep in mind that scrolling containers in your bottom sheet must support nested scrolling (for example, NestedScrollView, RecyclerView, or ListView/ScrollView on API 21+).\n\n" +
                "\n");
        java_code.setText("CoordinatorLayout coordinatorLayout = (CoordinatorLayout) findViewById(R.id.main_content);\n" +
                "// The View with the BottomSheetBehavior\n" +
                "View bottomSheet = coordinatorLayout.findViewById(R.id.bottom_sheet);\n" +
                "final BottomSheetBehavior behavior = BottomSheetBehavior.from(bottomSheet);\n" +
                "behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {\n" +
                "    @Override\n" +
                "    public void onStateChanged(@NonNull View bottomSheet, int newState) {\n" +
                "        // React to state change\n" +
                "        Log.e(\"onStateChanged\", \"onStateChanged:\" + newState);\n" +
                "        if (newState == BottomSheetBehavior.STATE_EXPANDED) {\n" +
                "                activity_fab.setVisibility(View.GONE);\n" +
                "            } else {\n" +
                "                activity_fab.setVisibility(View.VISIBLE);\n" +
                "            }\n" +
                "    }\n" +
                "\n" +
                "    @Override\n" +
                "    public void onSlide(@NonNull View bottomSheet, float slideOffset) {\n" +
                "        // React to dragging events\n" +
                "        Log.e(\"onSlide\", \"onSlide\");\n" +
                "    }\n" +
                "});\n" +
                "\n" +
                "behavior.setPeekHeight(100);");
        xml_code.setText("<android.support.design.widget.CoordinatorLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    android:id=\"@+id/main_content\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\"\n" +
                "    android:fitsSystemWindows=\"true\">\n" +
                "\n" +
                "    <android.support.design.widget.AppBarLayout>\n" +
                "\n" +
                "        <android.support.design.widget.CollapsingToolbarLayout>\n" +
                "\n" +
                "            <ImageView/>\n" +
                "\n" +
                "            <android.support.v7.widget.Toolbar/>\n" +
                "\n" +
                "        </android.support.design.widget.CollapsingToolbarLayout>\n" +
                "\n" +
                "    </android.support.design.widget.AppBarLayout>\n" +
                "\n" +
                "    <android.support.v4.widget.NestedScrollView\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"match_parent\"\n" +
                "        app:layout_behavior=\"@string/appbar_scrolling_view_behavior\">\n" +
                "\n" +
                "        <LinearLayout>\n" +
                "\n" +
                "            //.....\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "\n" +
                "\n" +
                "    </android.support.v4.widget.NestedScrollView>\n" +
                "\n" +
                "    <FrameLayout\n" +
                "        android:id=\"@+id/bottom_sheet\"\n" +
                "        android:layout_width=\"match_parent\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        app:behavior_hideable=\"true\"\n" +
                "        app:layout_behavior=\"android.support.design.widget.BottomSheetBehavior\">\n" +
                "\n" +
                "        //your bottom sheet layout\n" +
                "\n" +
                "        </LinearLayout>\n" +
                "    </FrameLayout>\n" +
                "\n" +
                "\n" +
                "    <android.support.design.widget.FloatingActionButton/>\n" +
                "\n" +
                "</android.support.design.widget.CoordinatorLayout>\n");
    }


}
