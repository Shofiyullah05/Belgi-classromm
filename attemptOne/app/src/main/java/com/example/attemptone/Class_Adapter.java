package com.example.attemptone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Class_Adapter extends RecyclerView.Adapter<Class_Adapter.MyViewHolder> {
    Context context;
    ArrayList<Class_Model> classModels;

    public Class_Adapter(Context context, ArrayList<Class_Model>classModels ){
        this.context = context;
        this.classModels = classModels;
    }


    @NonNull
    @Override
    public Class_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.kelas_item, parent, false);
        return new Class_Adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Class_Adapter.MyViewHolder holder, int position) {
        holder.className.setText(classModels.get(position).getClassName());
        holder.imageView.setImageResource(classModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        //Menghitung jumlah Item
        return classModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        //Isi dari Item
        ImageView imageView;
        TextView className;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageClass);
            className = itemView.findViewById(R.id.className);

        }
    }
}
