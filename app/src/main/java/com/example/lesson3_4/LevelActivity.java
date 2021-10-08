package com.example.lesson3_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson3_4.adapter.LevelAdapter;

import java.util.ArrayList;
import java.util.List;

import com.example.lesson3_4.data.QuestionModel;
import com.example.lesson3_4.data.QuizClient;

public class LevelActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    LevelAdapter adapter;
    List<QuestionModel> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        initAdapter();
    }

    private void initAdapter() {
        recyclerView = findViewById(R.id.recycler_view);
        list = QuizClient.getLevel();
        adapter = new LevelAdapter(list);
        recyclerView.setAdapter(adapter);
        adapter.setListener(new ItemListener() {
            @Override
            public void onItemClick(QuestionModel model) {
                Intent intent = new Intent(LevelActivity.this,GameActivity.class);
                intent.putExtra("model",model);
                startActivity(intent);
            }
        });
    }
}