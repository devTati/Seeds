package com.example.c4q.seeds.view;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.seeds.R;
import com.example.c4q.seeds.model.Seeds;
import com.example.c4q.seeds.rv.SeedsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeedHomeFragment extends Fragment {

    View rootView;
    Context context;

    public SeedHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        rootView = inflater.inflate(R.layout.fragment_seed_home, container, false);
        context = rootView.getContext();

        List<Seeds> seedsList = new ArrayList<>();

        Seeds seeds1 = new Seeds("Church of the Palms", "3224 Beed RidgeRd", "Sarasota, FL", "Monday-Friday 10AM-4PM", "N/A", "(941) 924-1323");
        Seeds seeds2 = new Seeds("All Faiths Food Bank", "8171 Blaikie Ct", "Sarasota, FL", "Call for hours of operation", "N/A","(941) 379-6333");
        Seeds seeds3 = new Seeds("First Church of the Nazarene", "3375 Fruitville Road", "Sarasota, FL", "Call for hours of opertaion", "N/A","(941) 365-2654");

        seedsList.add(seeds1);
        seedsList.add(seeds2);
        seedsList.add(seeds3);

        RecyclerView recyclerView = rootView.findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        SeedsAdapter seedsAdapter = new SeedsAdapter(seedsList);
        recyclerView.setAdapter(seedsAdapter);
        return rootView;
    }

}
