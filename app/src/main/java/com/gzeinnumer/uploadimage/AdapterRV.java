package com.gzeinnumer.uploadimage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.gzeinnumer.uploadimage.model.ImagesItem;
import com.gzeinnumer.uploadimage.model.ResponseGambar;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterRV extends RecyclerView.Adapter<AdapterRV.MyHolder> {

    private Context context;
    private List<ImagesItem> list;

    public AdapterRV(Context context, List<ImagesItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        Picasso.get().load(Constants.IMAGES_FOLDER_URL+list.get(position).getUrl()).placeholder(R.mipmap.ic_launcher).into(holder.imgItem);
        holder.namaItem.setText(list.get(position).getName());

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView imgItem;
        TextView namaItem;
        public MyHolder(View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
            namaItem =itemView.findViewById(R.id.imgNama);
        }
    }
}
