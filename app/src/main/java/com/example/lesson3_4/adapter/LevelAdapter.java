package com.example.lesson3_4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson3_4.ItemListener;
import com.example.lesson3_4.R;
import com.example.lesson3_4.data.QuestionModel;

import java.util.ArrayList;
import java.util.List;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.LevelViewHolder> {
    List<QuestionModel> list = new ArrayList();
    public LevelAdapter(List<QuestionModel> list) {
        this.list = list;
    }

    public void setListener(ItemListener listener) {
        this.listener = listener;
    }

    ItemListener listener;

    @NonNull
    @Override
    public LevelAdapter.LevelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_level,parent,false);
        return new LevelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LevelAdapter.LevelViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class LevelViewHolder extends RecyclerView.ViewHolder {
        TextView txtLevel;
        public LevelViewHolder(@NonNull  View itemView) {
            super(itemView);
            txtLevel = itemView.findViewById(R.id.txt_level);
        }

        public void onBind(QuestionModel model){
            txtLevel.setText(model.getCurrentLevel());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(model);
                }
            });

        }
    }
}

