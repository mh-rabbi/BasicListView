package com.demoapp.basiclistview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.demoapp.basiclistview.adapter.CustomAdapter;
import com.demoapp.basiclistview.adapter.RecViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class CustomRecylerView extends AppCompatActivity {

    RecyclerView myRecView;
    List<RecItemModel> recItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_recyler_view);

        myRecView = findViewById(R.id.rec_view);
        recItems.add(new RecItemModel("Header 1"," ","this is victory day"));
        recItems.add(new RecItemModel("Header 2","16th Dec","this is victory day"));
        recItems.add(new RecItemModel("Header 3","16th Dec","this is victory day"));
        recItems.add(new RecItemModel("Header 4","16th Dec","this is victory day"));
        recItems.add(new RecItemModel("Header 5","16th Dec","this is victory day"));
        recItems.add(new RecItemModel("Header 6","16th Dec","this is victory day"));

        RecViewAdapter recViewAdapter = new RecViewAdapter(CustomRecylerView.this, recItems);
        myRecView.setLayoutManager(new LinearLayoutManager(this));
        myRecView.setAdapter(recViewAdapter);

    }
}