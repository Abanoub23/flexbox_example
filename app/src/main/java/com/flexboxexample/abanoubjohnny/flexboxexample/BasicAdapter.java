package com.flexboxexample.abanoubjohnny.flexboxexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BasicAdapter extends RecyclerView.Adapter<BasicAdapter.MyViewHolder> {

    private List<String> data;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView close;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.tvTag);
            close = (ImageView) view.findViewById(R.id.ivDelete);
        }
    }


    public BasicAdapter(List<String> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_tag_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String movie = data.get(position);
        holder.title.setText(movie);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}