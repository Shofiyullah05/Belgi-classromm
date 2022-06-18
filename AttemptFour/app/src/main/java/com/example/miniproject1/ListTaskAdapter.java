package com.example.miniproject1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class ListTaskAdapter extends RecyclerView.Adapter<ListTaskAdapter.ListViewHolder>{
    private ArrayList<Task> listTask;

    public ListTaskAdapter(ArrayList<Task> list) {
        this.listTask = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Task task= listTask.get(position);
        Glide.with(holder.itemView.getContext())
                .load(task.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvjudul.setText(task.getName());
        holder.tvdetail.setText(task.getDetail());
    }

    @Override
    public int getItemCount() {
        return listTask.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvjudul, tvdetail;

        ListViewHolder(View itemview) {
            super(itemview);
            imgPhoto = itemview.findViewById(R.id.gambar);
            tvjudul = itemview.findViewById(R.id.tvjudul);
            tvdetail = itemview.findViewById(R.id.tvdetail);
        }
    }
};

