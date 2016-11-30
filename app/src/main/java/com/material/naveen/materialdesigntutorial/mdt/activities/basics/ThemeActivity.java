package com.material.naveen.materialdesigntutorial.mdt.activities.basics;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/3/2015.
 */
public class ThemeActivity extends BaseActivity {

    TextView tv, tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv = (TextView) findViewById(R.id.theme_first);
        tv1 = (TextView) findViewById(R.id.theme_sec);
        String f = "@android:style/Theme.Material (dark version)\n\n" +
                "@android:style/Theme.Material.Light (light version)\n\n" +
                "@android:style/Theme.Material.Light.DarkActionBar\n\n" +
                "@android:style/Theme.AppCompat.DayNight";
        String s = "<resources>\n" +
                "  <!-- inherit from the material theme -->\n" +
                "  <style name=\"AppTheme\" parent=\"android:Theme.Material\">\n" +
                "    <!-- Main theme activity_colors -->\n" +
                "    <!--   your app branding color for the app bar -->\n" +
                "    <item name=\"android:colorPrimary\">@color/primary</item>\n" +
                "    <!--   darker variant for the status bar and contextual app bars -->\n" +
                "    <item name=\"android:colorPrimaryDark\">@color/primary_dark</item>\n" +
                "    <!--   theme UI controls like checkboxes and text fields -->\n" +
                "    <item name=\"android:colorAccent\">@color/accent</item>\n" +
                "  </style>\n" +
                "</resources>";
        tv.setText(f);
        tv1.setText(s);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tryitout, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.try_it_out:
                startActivity(new Intent(ThemeActivity.this, Theme_try.class));
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
