package com.example.c4q.seeds.rv;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.c4q.seeds.R;
import com.example.c4q.seeds.model.Seeds;

/**
 * Created by c4q on 6/21/18.
 */

public class SeedsViewHolder extends RecyclerView.ViewHolder {

    public TextView name, address, cityAndState, hour, requirements;

    public SeedsViewHolder(View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        address = itemView.findViewById(R.id.address);
        cityAndState = itemView.findViewById(R.id.cityAndState);
        hour = itemView.findViewById(R.id.hour);
        requirements = itemView.findViewById(R.id.requirements);

    }

    public void onBind(Seeds seeds) {
        address.setText(seeds.getAddress());
        name.setText(seeds.getName());
        cityAndState.setText(seeds.getCityAndState());
        hour.setText(seeds.getHours());
        requirements.setText(seeds.getRequirements());
    }
}
