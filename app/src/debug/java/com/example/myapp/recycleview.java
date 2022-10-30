package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class recycleview extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<location> userList;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        initData();
        intitRecyclerView();

    }

    private void initData() {
        userList=new ArrayList<>();
        userList.add(new location("colombo", R.drawable.colombo));
        userList.add(new location("kandy", R.drawable.kandy));
        userList.add(new location("sigiriya", R.drawable.sigiriya));
        userList.add(new location("ella", R.drawable.travelscreen1));


    }

    private void intitRecyclerView() {
        recyclerView=findViewById(R.id.recycleview1);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

}