package com.dev.won.gridviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv_main;

    List<Item_GridView> list_gridView = new ArrayList<>();

    Adapter_GridView adapter_gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_main = findViewById(R.id.rv_main);

        for (int i = 0; i < 20; i++) {
            list_gridView.add(new Item_GridView(R.mipmap.ic_launcher, "title"));
        }

        rv_main.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        rv_main.setHasFixedSize(true);
        adapter_gridView = new Adapter_GridView(getApplicationContext(), list_gridView);
        rv_main.setAdapter(adapter_gridView);

    }

}
