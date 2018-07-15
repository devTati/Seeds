package com.example.c4q.seeds.view;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.c4q.seeds.R;
import com.example.c4q.seeds.model.Seeds;
import com.example.c4q.seeds.rv.SeedsAdapter;

import java.util.ArrayList;
import java.util.List;

public class SeedsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeds);



    }

}
