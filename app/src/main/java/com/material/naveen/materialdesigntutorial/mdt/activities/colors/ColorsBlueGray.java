package com.material.naveen.materialdesigntutorial.mdt.activities.colors;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.base.BaseActivity;

/**
 * Created by Naveen on 1/7/2016.
 */
public class ColorsBlueGray extends BaseActivity {


    //String[] value_Accents = {"","", "", ""};
    String[] value_pallets = {"ECEFF1", "CFD8DC", "B0BEC5", "90A4AE", "78909C", "607D8B", "546E7A", "455A64", "37474F", "263238"};
    String[] name_Accents = {"A100", "A200", "A400", "A700"};
    int black_color = Color.parseColor("#000000");
    String[] name_pallets = {"50", "100", "200", "300", "400", "500", "600", "700", "800", "900"};
    String value_primary = "607D8B";
    String value_primaryDark = "455A64";
    String name_Primary = "500";
    String name_PrimaryDark = "700";
    TextView tv_primary_name, tv_primary_value, tv_primarydark_name, tv_primarydark_value,
            tv_accent_name_1, tv_accent_value_1, tv_accent_name_2, tv_accent_value_2, tv_accent_name_3, tv_accent_value_3, tv_accent_name_4, tv_accent_value_4,
            tv_color_name_50, tv_color_value_50, tv_color_name_100, tv_color_value_100, tv_color_name_200, tv_color_value_200, tv_color_name_300, tv_color_value_300,
            tv_color_name_400, tv_color_value_400, tv_color_name_500, tv_color_value_500, tv_color_name_600, tv_color_value_600,
            tv_color_name_700, tv_color_value_700, tv_color_name_800, tv_color_value_800, tv_color_name_900, tv_color_value_900, txtcolAcc;

    CardView card_primary, card_primarydark, card_accent1, card_accent2, card_accent3, card_accent4,
            card_color_50, card_color_100, card_color_200, card_color_300, card_color_400, card_color_500, card_color_600, card_color_700, card_color_800, card_color_900;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_pallets);
        Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        init();

        card_primary.setCardBackgroundColor(Color.parseColor("#" + value_primary));
        card_primarydark.setCardBackgroundColor(Color.parseColor("#" + value_primaryDark));
        txtcolAcc.setVisibility(View.GONE);
        card_accent1.setVisibility(View.GONE);
        card_accent2.setVisibility(View.GONE);
        card_accent3.setVisibility(View.GONE);
        card_accent4.setVisibility(View.GONE);

        card_color_50.setCardBackgroundColor(Color.parseColor("#" + value_pallets[0]));
        card_color_100.setCardBackgroundColor(Color.parseColor("#" + value_pallets[1]));
        card_color_200.setCardBackgroundColor(Color.parseColor("#" + value_pallets[2]));
        card_color_300.setCardBackgroundColor(Color.parseColor("#" + value_pallets[3]));
        card_color_400.setCardBackgroundColor(Color.parseColor("#" + value_pallets[4]));
        card_color_500.setCardBackgroundColor(Color.parseColor("#" + value_pallets[5]));
        card_color_600.setCardBackgroundColor(Color.parseColor("#" + value_pallets[6]));
        card_color_700.setCardBackgroundColor(Color.parseColor("#" + value_pallets[7]));
        card_color_800.setCardBackgroundColor(Color.parseColor("#" + value_pallets[8]));
        card_color_900.setCardBackgroundColor(Color.parseColor("#" + value_pallets[9]));

        tv_primary_name.setText(name_Primary);
        tv_primary_value.setText("#" + value_primary);

        tv_primarydark_name.setText(name_PrimaryDark);
        tv_primarydark_value.setText("#" + value_primaryDark);


        tv_color_name_50.setText(name_pallets[0]);

        tv_color_name_100.setText(name_pallets[1]);

        tv_color_name_200.setText(name_pallets[2]);

        tv_color_name_300.setText(name_pallets[3]);

        tv_color_name_400.setText(name_pallets[4]);
        tv_color_name_500.setText(name_pallets[5]);
        tv_color_name_600.setText(name_pallets[6]);
        tv_color_name_700.setText(name_pallets[7]);
        tv_color_name_800.setText(name_pallets[8]);
        tv_color_name_900.setText(name_pallets[9]);
        tv_color_value_50.setText("#" + value_pallets[0]);
        tv_color_value_100.setText("#" + value_pallets[1]);
        tv_color_value_200.setText("#" + value_pallets[2]);
        tv_color_value_300.setText("#" + value_pallets[3]);


        tv_color_name_50.setTextColor(black_color);
        tv_color_name_100.setTextColor(black_color);
        tv_color_name_200.setTextColor(black_color);
        tv_color_name_300.setTextColor(black_color);


        tv_color_value_50.setTextColor(black_color);
        tv_color_value_100.setTextColor(black_color);
        tv_color_value_200.setTextColor(black_color);
        tv_color_value_300.setTextColor(black_color);


        tv_color_value_400.setText("#" + value_pallets[4]);
        tv_color_value_500.setText("#" + value_pallets[5]);
        tv_color_value_600.setText("#" + value_pallets[6]);
        tv_color_value_700.setText("#" + value_pallets[7]);
        tv_color_value_800.setText("#" + value_pallets[8]);
        tv_color_value_900.setText("#" + value_pallets[9]);


    }

    private void init() {

        tv_primary_name = (TextView) findViewById(R.id.txt_custom_primary_color_name);
        tv_primary_value = (TextView) findViewById(R.id.txt_custom_primary_color_value);

        tv_primarydark_name = (TextView) findViewById(R.id.txt_custom_primaryDark_color_name);
        tv_primarydark_value = (TextView) findViewById(R.id.txt_custom_primaryDark_color_value);

        tv_accent_name_1 = (TextView) findViewById(R.id.txt_custom_accent_color_name1);
        tv_accent_name_2 = (TextView) findViewById(R.id.txt_custom_accent_color_name2);
        tv_accent_name_3 = (TextView) findViewById(R.id.txt_custom_accent_color_name3);
        tv_accent_name_4 = (TextView) findViewById(R.id.txt_custom_accent_color_name4);
        tv_accent_value_1 = (TextView) findViewById(R.id.txt_custom_accent_color_value1);
        tv_accent_value_2 = (TextView) findViewById(R.id.txt_custom_accent_color_value2);
        tv_accent_value_3 = (TextView) findViewById(R.id.txt_custom_accent_color_value3);
        tv_accent_value_4 = (TextView) findViewById(R.id.txt_custom_accent_color_value4);

        tv_color_name_50 = (TextView) findViewById(R.id.txt_custom_colors_name50);
        tv_color_name_100 = (TextView) findViewById(R.id.txt_custom_colors_name100);
        tv_color_name_200 = (TextView) findViewById(R.id.txt_custom_colors_name200);
        tv_color_name_300 = (TextView) findViewById(R.id.txt_custom_colors_name300);
        tv_color_name_400 = (TextView) findViewById(R.id.txt_custom_colors_name400);
        tv_color_name_500 = (TextView) findViewById(R.id.txt_custom_colors_name500);
        tv_color_name_600 = (TextView) findViewById(R.id.txt_custom_colors_name600);
        tv_color_name_700 = (TextView) findViewById(R.id.txt_custom_colors_name700);
        tv_color_name_800 = (TextView) findViewById(R.id.txt_custom_colors_name800);
        tv_color_name_900 = (TextView) findViewById(R.id.txt_custom_colors_name900);
        tv_color_value_50 = (TextView) findViewById(R.id.txt_custom_colors_value50);
        tv_color_value_100 = (TextView) findViewById(R.id.txt_custom_colors_value100);
        tv_color_value_200 = (TextView) findViewById(R.id.txt_custom_colors_value200);
        tv_color_value_300 = (TextView) findViewById(R.id.txt_custom_colors_value300);
        tv_color_value_400 = (TextView) findViewById(R.id.txt_custom_colors_value400);
        tv_color_value_500 = (TextView) findViewById(R.id.txt_custom_colors_value500);
        tv_color_value_600 = (TextView) findViewById(R.id.txt_custom_colors_value600);
        tv_color_value_700 = (TextView) findViewById(R.id.txt_custom_colors_value700);
        tv_color_value_800 = (TextView) findViewById(R.id.txt_custom_colors_value800);
        tv_color_value_900 = (TextView) findViewById(R.id.txt_custom_colors_value900);
        txtcolAcc = (TextView) findViewById(R.id.txt_colAcct);

        card_primary = (CardView) findViewById(R.id.card_custom_primary);
        card_primarydark = (CardView) findViewById(R.id.card_custom_primaryDark);

        card_accent1 = (CardView) findViewById(R.id.card_custom_accent_pallet1);
        card_accent2 = (CardView) findViewById(R.id.card_custom_accent_pallet2);
        card_accent3 = (CardView) findViewById(R.id.card_custom_accent_pallet3);
        card_accent4 = (CardView) findViewById(R.id.card_custom_accent_pallet4);

        card_color_50 = (CardView) findViewById(R.id.card_custom_colors50);
        card_color_100 = (CardView) findViewById(R.id.card_custom_colors100);
        card_color_200 = (CardView) findViewById(R.id.card_custom_colors200);
        card_color_300 = (CardView) findViewById(R.id.card_custom_colors300);
        card_color_400 = (CardView) findViewById(R.id.card_custom_colors400);
        card_color_500 = (CardView) findViewById(R.id.card_custom_colors500);
        card_color_600 = (CardView) findViewById(R.id.card_custom_colors600);
        card_color_700 = (CardView) findViewById(R.id.card_custom_colors700);
        card_color_800 = (CardView) findViewById(R.id.card_custom_colors800);
        card_color_900 = (CardView) findViewById(R.id.card_custom_colors900);


    }

}
