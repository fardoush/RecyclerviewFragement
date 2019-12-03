package com.example.recyclerviewfragement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
Context context;
List<Contact>Data;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
public RecyclerViewAdapter(Context context,List<Contact>Data){
        this.context=context;
        this.Data=Data;
}

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
            View view;


        public View getView() {
            return view;
        }

        public MyViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}

}


