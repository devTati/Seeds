package com.example.c4q.seeds;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.c4q.seeds.model.Seeds;
import com.example.c4q.seeds.rv.SeedsAdapter;

import java.util.ArrayList;
import java.util.List;

public class SeedsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeds);

        List<Seeds> seedsList = new ArrayList<>();

        Seeds seeds1 = new Seeds("Church of the Palms", "3224 Beed RidgeRd", "Sarasota, FL", "Monday-Friday 10AM-4PM", "N/A", "(941) 924-1323");
        Seeds seeds2 = new Seeds("All Faiths Food Bank", "8171 Blaikie Ct", "Sarasota, FL", "Call for hours of operation", "N/A","(941) 379-6333");
        Seeds seeds3 = new Seeds("First Church of the Nazarene", "3375 Fruitville Road", "Sarasota, FL", "Call for hours of opertaion", "N/A","(941) 365-2654");

        seedsList.add(seeds1);
        seedsList.add(seeds2);
        seedsList.add(seeds3);

        RecyclerView recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        SeedsAdapter seedsAdapter = new SeedsAdapter(seedsList);
        recyclerView.setAdapter(seedsAdapter);

    }

}
