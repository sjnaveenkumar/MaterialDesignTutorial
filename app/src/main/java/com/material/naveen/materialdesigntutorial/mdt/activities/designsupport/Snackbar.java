package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/8/2015.
 */
public class Snackbar extends BaseActivity {

    FloatingActionButton floatingActionButton;
    TextView tv1, tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        TextView tv = (TextView) findViewById(R.id.snackbar_code);
        tv1 = (TextView) findViewById(R.id.snackbar_eg_xml);
        tv2 = (TextView) findViewById(R.id.snackbar_eg_java);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_snack);
        final String snack = "Snackbar\n" +
                "  .make(parentLayout, R.string.snackbar_text, Snackbar.LENGTH_LONG)\n" +
                "  .setAction(R.string.snackbar_action, myOnClickListener)\n" +
                "  .show();";
        tv.setText(snack);
        String snack_eg_xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "\n" +
                "<android.support.design.widget.CoordinatorLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    xmlns:card_view=\"http://schemas.android.com/tools\"\n" +
                "    android:id=\"@+id/snack\"\n" +
                "    android:layout_width=\"match_parent\"\n" +
                "    android:layout_height=\"match_parent\">\n" +
                "\n" +
                "    <android.support.design.widget.AppBarLayout\n" +
                "        android:layout_width=\"fill_parent\"\n" +
                "        android:layout_height=\"wrap_content\">\n" +
                "\n" +
                "        <include layout=\"@layout/appbar\" />\n" +
                "    </android.support.design.widget.AppBarLayout>\n" +
                "\n" +
                "    <android.support.v4.widget.NestedScrollView\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        app:layout_behavior=\"@string/appbar_scrolling_view_behavior\">\n" +
                "\n" +
                "        <LinearLayout\n" +
                "            android:layout_width=\"wrap_content\"\n" +
                "            android:layout_height=\"wrap_content\"\n" +
                "            android:orientation=\"vertical\">\n" +
                "\n" +
                "           // your layout \n" +
                "\n" +
                "           \n" +
                "        </LinearLayout>\n" +
                "    </android.support.v4.widget.NestedScrollView>\n" +
                "\n" +
                "    <android.support.design.widget.FloatingActionButton xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        android:id=\"@+id/fab_snack\"\n" +
                "        android:layout_width=\"wrap_content\"\n" +
                "        android:layout_height=\"wrap_content\"\n" +
                "        android:layout_gravity=\"bottom|right\"\n" +
                "        android:layout_margin=\"16dp\"\n" +
                "        android:clickable=\"true\"\n" +
                "        android:src=\"@mipmap/ic_launcher\"\n" +
                "        app:backgroundTint=\"#3277D5\"\n" +
                "        app:borderWidth=\"0dp\"\n" +
                "        app:elevation=\"6dp\"\n" +
                "        app:fabSize=\"normal\"\n" +
                "        app:rippleColor=\"@color/colorPrimaryDarkHome\" />\n" +
                "\n" +
                "\n" +
                "</android.support.design.widget.CoordinatorLayout>\n" +
                "\n";
        tv1
                .setText(snack_eg_xml);
        String snack_eg_java = "\n" +
                "public class Snackbar extends AppCompatActivity {\n" +
                "\n" +
                "    FloatingActionButton floatingActionButton;\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_snackbar);\n" +
                "        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);\n" +
                "        setSupportActionBar(toolbar);\n" +
                "       \n" +
                "        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_snack);\n" +
                "        \n" +
                "        floatingActionButton.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View v) {\n" +
                "\n" +
                "                final android.support.design.widget.Snackbar snackBar = android.support.design.widget.Snackbar.make(findViewById(R.id.snack), \"Hi, i\\'m Snackbar, swipe me to dismiss\", android.support.design.widget.Snackbar.LENGTH_INDEFINITE);\n" +
                "\n" +
                "                snackBar.setAction(\"Show Toast\",new View.onClickListener(){\n" +
                "                @override\n" +
                "                public void onClick(View v){\n" +
                "                    Toast.makeText(this,\"Hello i\\'m Toast!\",LENGTH_SHORT).show();\n" +
                "                }\n" +
                "                });\n" +
                "                snackBar.show();\n" +
                "            }\n" +
                "        });\n" +
                "    }\n" +
                "}\n";
        tv2.setText(snack_eg_java);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final android.support.design.widget.Snackbar snackBar = android.support.design.widget.Snackbar.make(findViewById(R.id.snack), "Hi, i\'m Snackbar, swipe me to dismiss", android.support.design.widget.Snackbar.LENGTH_INDEFINITE);
                snackBar.setAction("Show Toast", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(Snackbar.this, "Hello i\'m Toast", Toast.LENGTH_SHORT).show();
                    }
                });

                snackBar.show();
            }
        });
    }
}
