package com.example.c4q.seeds.rv;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.c4q.seeds.model.Seeds;

import java.util.ArrayList;

/**
 * Created by c4q on 6/21/18.
 */

public class SeedsAdapter extends RecyclerView.Adapter<SeedsViewHolder> {

    ArrayList<Seeds> seedsArrayList = new ArrayList<>();
    @Override
    public SeedsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(SeedsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return seedsArrayList.size();
    }
}
