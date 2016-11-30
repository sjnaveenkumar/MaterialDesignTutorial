package com.material.naveen.materialdesigntutorial.mdt.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.material.naveen.materialdesigntutorial.mdt.R;
import com.material.naveen.materialdesigntutorial.mdt.activities.VideoPlayer;

import java.util.List;

/**
 * Created by Naveen on 2/17/2016.
 */
public class Video_list_adapter extends RecyclerView.Adapter<Video_list_adapter.VH> {


    List<String> ltitle, llink, lphoto, ltime, lsno;
    Context context;


    public Video_list_adapter(Context context, List<String> ltitle, List<String> llink, List<String> lphoto, List<String> ltime, List<String> lsno) {

        this.context = context;
        this.ltitle = ltitle;
        this.llink = llink;
        this.lphoto = lphoto;
        this.ltime = ltime;
        this.lsno = lsno;

    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.custom_video_list, parent, false);


        return new VH(view);
    }

    @Override
    public void onBindViewHolder(VH holder, final int position) {

        holder.txt_title.setText(ltitle.get(position));
        holder.txt_time.setText(ltime.get(position));
        Glide.with(context).load(lphoto.get(position)).into(holder.img_photo);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent
                        = new Intent(context, VideoPlayer.class);
                intent.putExtra("vid", llink.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ltitle.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView txt_title, txt_time;
        ImageView img_photo;
        CardView cardView;

        public VH(View itemView) {
            super(itemView);
            txt_title = (TextView) itemView.findViewById(R.id.txt_custom_vlist_title);
            txt_time = (TextView) itemView.findViewById(R.id.txt_custom_vlist_time);
            img_photo = (ImageView) itemView.findViewById(R.id.img_custom_vlist_photo);
            cardView = (CardView) itemView.findViewById(R.id.card_custom_vlist);


        }
    }
}
