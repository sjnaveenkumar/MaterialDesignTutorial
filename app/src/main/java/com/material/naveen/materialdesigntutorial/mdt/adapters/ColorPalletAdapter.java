package com.material.naveen.materialdesigntutorial.mdt.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.material.naveen.materialdesigntutorial.mdt.R;


/**
 * Created by Naveen on 12/19/2015.
 */
public class ColorPalletAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context contex;
    String[] value_Accents, value_Pallets, name_Accents, name_pallets;
    String value_primary, value_primaryDark, name_Primary, name_PrimaryDark;

    public ColorPalletAdapter(Context contex, String[] value_Accents, String[] value_Pallets, String[] name_Accents, String[] name_pallets,
                              String value_primary, String value_primaryDark, String name_Primary, String name_PrimaryDark) {

        this.contex = contex;
        this.value_Accents = value_Accents;
        this.value_Pallets = value_Pallets;
        this.name_Accents = name_Accents;
        this.name_pallets = name_pallets;
        this.value_primary = value_primary;
        this.value_primaryDark = value_primaryDark;
        this.name_Primary = name_Primary;
        this.name_PrimaryDark = name_PrimaryDark;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view;
        if (viewType == 0) {

            view = LayoutInflater.from(contex).inflate(R.layout.custom_color_pallet_row_one, parent, false);

            return new ViewH1(view);
        } else if (viewType == 1) {

            view = LayoutInflater.from(contex).inflate(R.layout.custom_color_pallet_row_two, parent, false);

            return new ViewH2(view);
        } else {
            view = LayoutInflater.from(contex).inflate(R.layout.custom_color_pallet_row_three, parent, false);
            return new ViewH3(view);

        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holderr, int position) {
        if (position == 0) {

            final ViewH1 holder1 = (ViewH1) holderr;
            holder1.card_primary.setCardBackgroundColor(Color.parseColor("#" + value_primary));
            holder1.text_primary_cname.setText(name_Primary);
            holder1.text_primary_cvalue.setText(value_primary);
            holder1.card_PrimaryDark.setCardBackgroundColor(Color.parseColor("#" + value_primaryDark));
            holder1.text_pDark_cname.setText(name_PrimaryDark);
            holder1.text_pDark_cvalue.setText("#" + value_primaryDark);

        } else if (position == 1) {
            final ViewH2 holder = (ViewH2) holderr;
            holder.card_Accents.setCardBackgroundColor(Color.parseColor("#" + value_Accents[position - 1]));
            holder.text_accent_cname.setText(name_Accents[position - 1]);
            holder.text_accent_cvalue.setText("#" + value_Accents[position - 1]);

        } else {
            final ViewH3 holder3 = (ViewH3) holderr;

            holder3.card_pallets.setCardBackgroundColor(Color.parseColor("#" + value_Pallets[position - 1]));
            holder3.text_pallet_cname.setText(name_pallets[position - 1]);
            holder3.text_pallet_cvalue.setText("#" + value_Pallets[position - 1]);
        }

    }


    @Override
    public int getItemCount() {
        return name_pallets.length + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;

        } else if (position == 1) {
            return 1;
        } else {
            return 2;
        }
    }

    public class ViewH1 extends RecyclerView.ViewHolder {

        CardView card_primary, card_PrimaryDark, card_Accents, card_pallets;
        TextView text_primary_cname, text_primary_cvalue, text_pDark_cname, text_pDark_cvalue, text_accent_cname, text_accent_cvalue,
                text_pallet_cname, text_pallet_cvalue;


        public ViewH1(View v) {
            super(v);
            card_primary = (CardView) v.findViewById(R.id.card_custom_primary);
            card_PrimaryDark = (CardView) v.findViewById(R.id.card_custom_primaryDark);

            text_primary_cname = (TextView) v.findViewById(R.id.txt_custom_primary_color_name);
            text_primary_cvalue = (TextView) v.findViewById(R.id.txt_custom_primary_color_value);
            text_pDark_cname = (TextView) v.findViewById(R.id.txt_custom_primaryDark_color_name);
            text_pDark_cvalue = (TextView) v.findViewById(R.id.txt_custom_primaryDark_color_value);
        }
    }

    public class ViewH2 extends RecyclerView.ViewHolder {

        CardView card_primary, card_PrimaryDark, card_Accents, card_pallets;
        TextView text_primary_cname, text_primary_cvalue, text_pDark_cname, text_pDark_cvalue, text_accent_cname, text_accent_cvalue,
                text_pallet_cname, text_pallet_cvalue;


        public ViewH2(View v) {
            super(v);
            card_Accents = (CardView) v.findViewById(R.id.card_custom_accent_pallet);

            text_accent_cname = (TextView) v.findViewById(R.id.txt_custom_accent_color_name);
            text_accent_cvalue = (TextView) v.findViewById(R.id.txt_custom_accent_color_value);
        }
    }

    public class ViewH3 extends RecyclerView.ViewHolder {

        CardView card_primary, card_PrimaryDark, card_Accents, card_pallets;
        TextView text_primary_cname, text_primary_cvalue, text_pDark_cname, text_pDark_cvalue, text_accent_cname, text_accent_cvalue,
                text_pallet_cname, text_pallet_cvalue;


        public ViewH3(View v) {
            super(v);
            card_pallets = (CardView) v.findViewById(R.id.card_custom_pallet);

            text_pallet_cname = (TextView) v.findViewById(R.id.txt_custom_pallet_color_name);
            text_pallet_cvalue = (TextView) v.findViewById(R.id.txt_custom_pallet_color_value);
        }
    }
}
