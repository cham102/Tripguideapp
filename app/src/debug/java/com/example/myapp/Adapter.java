package com.example.myapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<location> userlist;
    public Adapter(List<location> userlist) {
        this.userlist = userlist;
    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleviewrow,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource=userlist.get(position).getImage();
        String name=userlist.get(position).getLoc();

        holder.setData(resource,name);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageview1;
        TextView textView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview1=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView2);



        }

        public void setData(int resource, String name) {
            imageview1.setImageResource(resource);
            textView.setText(name);

        }
    }
}

