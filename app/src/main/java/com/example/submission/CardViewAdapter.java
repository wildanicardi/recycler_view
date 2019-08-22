package com.example.submission;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.text.BreakIterator;
import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder> {

    private ArrayList<Bola> listBola;
    private Context context;

    public CardViewAdapter(ArrayList<Bola> list){
        this.listBola = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  final CardViewViewHolder holder, int i) {

        Bola bola = listBola.get(i);
        Glide.with(holder.itemView.getContext())
                .load(bola.getPhoto())
                .into(holder.imgPhoto);

        final String images = bola.getPhoto();
        final String nama = bola.getName();
        final String desc= bola.getDesc();

        holder.tvName.setText(nama);
        holder.tvDesc.setText(desc);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaDetail(nama,desc,images);
            }
        });

    }
    private void bukaDetail(String... holder){
        Intent intent = new Intent(context,Detail.class);
        intent.putExtra("NAMA",holder[0]);
        intent.putExtra("DESC",holder[1]);
        intent.putExtra("GAMBAR",holder[2]);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return listBola.size();
    }


    public class CardViewViewHolder extends RecyclerView.ViewHolder{
         ImageView imgPhoto;
         TextView tvName,tvDesc;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDesc = itemView.findViewById(R.id.tv_desc);
        }
    }
}
