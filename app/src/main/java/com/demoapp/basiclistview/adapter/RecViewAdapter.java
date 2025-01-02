package com.demoapp.basiclistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demoapp.basiclistview.R;
import com.demoapp.basiclistview.RecItemModel;

import java.util.List;
import java.util.zip.Inflater;

public class RecViewAdapter extends RecyclerView.Adapter<RecViewAdapter.CustomViewHolder> {

    Context mContext;
    List<RecItemModel> recItems;

    public RecViewAdapter(Context mContext, List<RecItemModel> recItems) {
        this.mContext = mContext;
        this.recItems = recItems;
    }

    @NonNull
    @Override
    public RecViewAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_rec, parent, false);
        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewAdapter.CustomViewHolder holder, int position) {

        holder.txtHeader.setText(recItems.get(position).getHeader());
        holder.txtDescription.setText(recItems.get(position).getDescription());
        holder.txtDate.setText(recItems.get(position).getDate());

        holder.txtDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    @Override
    public int getItemCount() {
        return recItems.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView txtHeader, txtDescription, txtDate;
        public CustomViewHolder( View itemView) {
            super(itemView);

            txtHeader = itemView.findViewById(R.id.txt_header);
            txtDescription = itemView.findViewById(R.id.txt_description);
            txtDate = itemView.findViewById(R.id.txt_date);

        }
    }
}
