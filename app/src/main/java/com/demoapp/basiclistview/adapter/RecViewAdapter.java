package com.demoapp.basiclistview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.demoapp.basiclistview.RecItemModel;

import java.util.List;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewAdapter.CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return recItems.size();
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        public CustomViewHolder( View itemView) {
            super(itemView);


        }
    }
}
