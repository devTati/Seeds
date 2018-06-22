package com.example.c4q.seeds.rv;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.seeds.R;
import com.example.c4q.seeds.model.Seeds;

import java.util.List;

/**
 * Created by c4q on 6/21/18.
 */

public class SeedsAdapter extends RecyclerView.Adapter<SeedsViewHolder> {
    List<Seeds> seedsList;
    Context context;

    public SeedsAdapter(Context context) {
        this.context = context;
    }

    public SeedsAdapter(List<Seeds> seedsArrayList) {
        this.seedsList = seedsArrayList;
    }

    @Override
    public SeedsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);

        context = view.getContext();

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.foodpantries.org/ci/fl-sarasota");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                context.startActivity(intent);
            }
        });
        return new SeedsViewHolder(view);


    }

    @Override
    public void onBindViewHolder(SeedsViewHolder holder, int position) {

        Seeds seeds = seedsList.get(position);

        holder.onBind(seeds);




    }

    @Override
    public int getItemCount() {
        return seedsList.size();
    }
}
