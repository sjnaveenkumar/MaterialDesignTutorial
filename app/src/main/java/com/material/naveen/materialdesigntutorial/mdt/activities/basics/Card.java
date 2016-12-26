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
 * Created by Naveen on 12/4/2015.
 */
public class Card extends BaseActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tv = (TextView) findViewById(R.id.card_implement);
        String imp = "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
                "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
                "    xmlns:card_view=\"http://schemas.android.com/apk/res-auto\"\n" +
                "    ... >\n" +
                "    <!-- A CardView that contains a TextView -->\n" +
                "    <android.support.v7.widget.CardView\n" +
                "        xmlns:card_view=\"http://schemas.android.com/apk/res-auto\"\n" +
                "        android:id=\"@+id/card_view\"\n" +
                "        android:layout_gravity=\"center\"\n" +
                "        android:layout_width=\"200dp\"\n" +
                "        android:layout_height=\"200dp\"\n" +
                "        card_view:cardCornerRadius=\"4dp\">\n" +
                "\n" +
                "        <TextView\n" +
                "            android:id=\"@+id/info_text\"\n" +
                "            android:layout_width=\"match_parent\"\n" +
                "            android:layout_height=\"match_parent\" />\n" +
                "    </android.support.v7.widget.CardView>\n" +
                "</LinearLayout>";
        tv.setText(imp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_tryitout, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.try_it_out:
                startActivity(new Intent(Card.this, CardTry.class));
                break;
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
