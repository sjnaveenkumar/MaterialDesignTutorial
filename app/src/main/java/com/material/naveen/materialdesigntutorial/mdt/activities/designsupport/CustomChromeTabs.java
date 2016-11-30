package com.material.naveen.materialdesigntutorial.mdt.activities.designsupport;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;


/**
 * Created by Naveen on 4/4/2016.
 */
public class CustomChromeTabs extends BaseActivity {

    public static final String CUSTOM_TAB_PACKAGE_NAME = "com.android.chrome";
    TextView tab_code;
    EditText editText;
    FloatingActionButton floatingActionButton;
    CustomTabsClient mClient;
    CustomTabsSession mCustomTabsSession;
    CustomTabsServiceConnection mCustomTabsServiceConnection;
    CustomTabsIntent customTabsIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customtabs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        tab_code = (TextView) findViewById(R.id.cus_tab_code);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab_custom_tab);
        editText = (EditText) findViewById(R.id.ed_custom_tabs);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = editText.getText().toString();
                if (url.isEmpty()) {
                    url = "http://google.com";
                    customTabsIntent.launchUrl(CustomChromeTabs.this, Uri.parse(url));
                } else {

                    if (url.contains("http://")) {
                        customTabsIntent.launchUrl(CustomChromeTabs.this, Uri.parse(url));
                    } else {
                        url = "http://" + url;
                        customTabsIntent.launchUrl(CustomChromeTabs.this, Uri.parse(url));
                    }

                }


            }
        });
        tab_code.setText("public class CustomTabsActivity extends AppCompatActivity {\n" +
                "\n" +
                "    public static final String CUSTOM_TAB_PACKAGE_NAME = \"com.android.chrome\";\n" +
                "\n" +
                "    CustomTabsClient mClient;\n" +
                "    CustomTabsSession mCustomTabsSession;\n" +
                "    CustomTabsServiceConnection mCustomTabsServiceConnection;\n" +
                "    CustomTabsIntent customTabsIntent;\n" +
                "\n" +
                "    static final String URL = \"http://www.google.com/\";\n" +
                "\n" +
                "\n" +
                "    @Override\n" +
                "    protected void onCreate(Bundle savedInstanceState) {\n" +
                "        super.onCreate(savedInstanceState);\n" +
                "        setContentView(R.layout.activity_custom_tabs);\n" +
                "\n" +
                "        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);\n" +
                "        setSupportActionBar(toolbar);\n" +
                "        getSupportActionBar().setDisplayHomeAsUpEnabled(true);\n" +
                "\n" +
                "        /*\n" +
                "            Setup Chrome Custom Tabs\n" +
                "         */\n" +
                "        mCustomTabsServiceConnection = new CustomTabsServiceConnection() {\n" +
                "            @Override\n" +
                "            public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {\n" +
                "\n" +
                "                //Pre-warming\n" +
                "                mClient = customTabsClient;\n" +
                "                mClient.warmup(0L);\n" +
                "                //Initialize a session as soon as possible.\n" +
                "                mCustomTabsSession = mClient.newSession(null);\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "            @Override\n" +
                "            public void onServiceDisconnected(ComponentName name) {\n" +
                "                mClient = null;\n" +
                "            }\n" +
                "        };\n" +
                "\n" +
                "        CustomTabsClient.bindCustomTabsService(CustomTabsActivity.this, CUSTOM_TAB_PACKAGE_NAME, mCustomTabsServiceConnection);\n" +
                "\n" +
                "        customTabsIntent = new CustomTabsIntent.Builder(mCustomTabsSession)\n" +
                "                .setToolbarColor(ContextCompat.getColor(this, R.color.colorPrimary))\n" +
                "                .setShowTitle(true)\n" +
                "                .build();\n" +
                "        /*\n" +
                "            End custom tabs setup\n" +
                "         */\n" +
                "\n" +
                "        FloatingActionButton activity_fab = (FloatingActionButton) findViewById(R.id.activity_fab);\n" +
                "        activity_fab.setOnClickListener(new View.OnClickListener() {\n" +
                "            @Override\n" +
                "            public void onClick(View view) {\n" +
                "\n" +
                "                // Launch Chrome Custom Tabs on click\n" +
                "                customTabsIntent.launchUrl(CustomTabsActivity.this, Uri.parse(URL));\n" +
                "\n" +
                "            }\n" +
                "        });\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "}");

        mCustomTabsServiceConnection = new CustomTabsServiceConnection() {
            @Override
            public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
                mClient = customTabsClient;
                mClient.warmup(0L);
                //Initialize a session as soon as possible.
                mCustomTabsSession = mClient.newSession(null);
            }

            @Override
            public void onServiceDisconnected(ComponentName name) {
                mClient = null;
            }
        };
        CustomTabsClient.bindCustomTabsService(CustomChromeTabs.this, CUSTOM_TAB_PACKAGE_NAME, mCustomTabsServiceConnection);

        customTabsIntent = new CustomTabsIntent.Builder(mCustomTabsSession)
                .setToolbarColor(ContextCompat.getColor(this, R.color.colorPrimaryHome))
                .setShowTitle(true)
                .build();

    }
}
