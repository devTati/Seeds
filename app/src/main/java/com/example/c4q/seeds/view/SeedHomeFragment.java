package com.example.c4q.seeds.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.seeds.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeedHomeFragment extends Fragment {


    public SeedHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seed_home, container, false);
    }

}
