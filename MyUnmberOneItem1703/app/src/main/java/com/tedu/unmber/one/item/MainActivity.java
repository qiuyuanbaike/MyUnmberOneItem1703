package com.tedu.unmber.one.item;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<String> list = new ArrayList<>();
    private RecyclerView.Adapter adapter;
    private TextView textViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);
        textViews = (TextView) findViewById(R.id.textId);
        recyclerView.setHasFixedSize(true);
        initDatas();


    }


    private void initDatas() {
        list = new ArrayList<String>();
        for (char i = 'A'; i <= 'Z'; i++) {
            list.add("" + i);

            adapter = new RecyclerViewAdapter(this, list);
            recyclerView.setAdapter(adapter);
            StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);

        }
    }

}



