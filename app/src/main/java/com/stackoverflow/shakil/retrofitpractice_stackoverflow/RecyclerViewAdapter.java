package com.stackoverflow.shakil.retrofitpractice_stackoverflow;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<Answer> data;

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView text;
        public ViewHolder(View view){
            super(view);
            text=view.findViewById(android.R.id.text1);
        }
    }

    public  RecyclerViewAdapter(List<Answer> data){
        this.data=data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_selectable_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Answer answer=data.get(position);
        holder.text.setText(answer.toString());
        holder.itemView.setTag(answer.answer_id);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
