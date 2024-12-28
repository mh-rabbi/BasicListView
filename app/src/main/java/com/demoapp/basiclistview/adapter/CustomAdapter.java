package com.demoapp.basiclistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.demoapp.basiclistview.R;


public class CustomAdapter extends BaseAdapter {
    Context mContext;
    String[] firstArray;
    String[] secondArray;
    int[] imageArray;

    public CustomAdapter(Context mContext, String[] firstArray, String[] secondArray, int[] imageArray) {
        this.mContext = mContext;
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        this.imageArray = imageArray;
    }

        public CustomAdapter(Context mContext) {
        this.mContext = mContext;
    }
//
//    public CustomAdapter(Context mContext, String[] firstArray) {
//        this.mContext = mContext;
//        this.firstArray = firstArray;
//    }

//    public void showToast(){
//        Toast.makeText(mContext, "", Toast.LENGTH_SHORT).show();
//    }

    @Override
    public int getCount() {
        return firstArray.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null){
                    view = LayoutInflater.from(mContext).inflate(R.layout.item_list,viewGroup,false);
                }



                TextView txtCountry = view.findViewById(R.id.txt_country);
                TextView txtCapital = view.findViewById(R.id.txt_capital);
                ImageView img;
                txtCountry.setText(firstArray[position]);
                txtCapital.setText(secondArray[position]);
//                img.setImageDrawable(flags[position]);

                txtCountry.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(mContext, secondArray[position], Toast.LENGTH_SHORT).show();
                    }
                });
                return view;
    }
}
