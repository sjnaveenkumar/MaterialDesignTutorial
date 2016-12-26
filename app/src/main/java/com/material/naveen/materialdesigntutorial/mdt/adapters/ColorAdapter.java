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
public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.ViewHolder> {

    Context context;
    String[] color_name;
    String[] color_code;


    public ColorAdapter(Context context, String[] color_name, String[] color_code) {

        this.context = context;
        this.color_name = color_name;
        this.color_code = color_code;


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.color_custom_single_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.cardView.setCardBackgroundColor(Color.parseColor("#" + color_code[position]));
        holder.textView.setText(color_name[position]);


    }

    @Override
    public int getItemCount() {
        return color_name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.card_custom_color);
            textView = (TextView) itemView.findViewById(R.id.txt_custom_color);

        }
    }
}
