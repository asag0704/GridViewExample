package com.dev.won.gridviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_GridView extends RecyclerView.Adapter<Adapter_GridView.ViewHolder> {
    private Context context;
    private List<Item_GridView> item_gridViews;

    public Adapter_GridView(Context context, List<Item_GridView> item_gridViews) {
        this.context = context;
        this.item_gridViews = item_gridViews;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gridview, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item_GridView item_gridView = item_gridViews.get(position);

        holder.iv_thumbnail.setImageResource(item_gridView.getIv_thumbnail());
        holder.tv_title.setText(item_gridView.getTv_title());
    }

    @Override
    public int getItemCount() {
        return item_gridViews.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_thumbnail;
        TextView tv_title;
        public ViewHolder(View view) {
            super(view);
            iv_thumbnail = view.findViewById(R.id.iv_thumbnail);
            tv_title = view.findViewById(R.id.tv_title);
        }
    }
}
