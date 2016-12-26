package com.material.naveen.materialdesigntutorial.mdt.activities.basics;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.activities.colors.Colors;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 12/3/2015.
 */
public class ThemeTry extends BaseActivity implements View.OnClickListener {

    LinearLayout lp, lpd, lw, ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes_try);

        lp = (LinearLayout) findViewById(R.id.id_primary);
        lpd = (LinearLayout) findViewById(R.id.id_primaryDark);
        lw = (LinearLayout) findViewById(R.id.id_window);
        ln = (LinearLayout) findViewById(R.id.id_navigation);
        lp.setOnClickListener(this);
        lpd.setOnClickListener(this);
        lw.setOnClickListener(this);
        ln.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.id_primary:
                setcolor(R.color.colorPrimary, lp);
                break;
            case R.id.id_primaryDark:

                setcolor(R.color.colorPrimaryDark, lpd);
                break;
            case R.id.id_window:
                setcolor(R.color.drkgrey, lw);
                break;
            case R.id.id_navigation:
                setcolor(R.color.black, ln);
                break;
        }

    }

    public void setcolor(final int clr, final LinearLayout linearLayout) {
        LayoutInflater layoutInflater = LayoutInflater.from(ThemeTry.this);
        final View cusDialogView = layoutInflater.inflate(
                R.layout.custom_alert_dialog, null);
        final AlertDialog dia = new AlertDialog.Builder(ThemeTry.this).create();
        dia.setView(cusDialogView);
        cusDialogView.findViewById(R.id.btn_alert_apply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = (EditText) cusDialogView.findViewById(R.id.editText);
                String clr = editText.getText().toString();
                try {
                    linearLayout.setBackgroundColor(Color.parseColor("#" + clr));
                } catch (Exception e) {
                    Toast.makeText(ThemeTry.this, "Invalid Color code", Toast.LENGTH_SHORT).show();
                }

                dia.dismiss();

            }
        });
        cusDialogView.findViewById(R.id.btn_alert_reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout.setBackgroundColor(getResources().getColor(clr));
                dia.dismiss();

            }
        });
        cusDialogView.findViewById(R.id.txt_gotocolos).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ThemeTry.this, Colors.class));
            }
        });
        dia.show();


    }


}
