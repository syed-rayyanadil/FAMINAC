package com.company.famanic.historyRecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.company.famanic.HistorySingleActivity;
import com.company.famanic.R;

import androidx.recyclerview.widget.RecyclerView;

public class HistoryViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView serviceId;
    public TextView time;
    public HistoryViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        serviceId = (TextView) itemView.findViewById(R.id.serviceId);
        time = (TextView) itemView.findViewById(R.id.time);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), HistorySingleActivity.class);
        Bundle b = new Bundle();
        b.putString("serviceId", serviceId.getText().toString());
        intent.putExtras(b);
        v.getContext().startActivity(intent);
    }
}

