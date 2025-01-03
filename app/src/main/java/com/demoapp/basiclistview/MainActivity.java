package com.demoapp.basiclistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.demoapp.basiclistview.adapter.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    String[] country = {"Bangladesh","Pakistan","Nepal","Japan"};
    String[] capital = {"Dhaka","Islamabad","Kathmundu","Tokyo"};
    int[] flags = {R.drawable.bangladesh,R.drawable.bangladesh,R.drawable.bangladesh,R.drawable.bangladesh};
    ListView lstCountryList;
//    ArrayList<String> countries = new ArrayList<>();

//    GridView lstCountryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        lstCountryList = findViewById(R.id.lst_country);

//        ArrayAdapter myAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,country);

        CustomAdapter myCustomAdapter = new CustomAdapter(MainActivity.this,country,capital,flags);
//        BaseAdapter myBaseAdapter = new BaseAdapter() {
//            @Override
//            public int getCount() {
//                return country.length;
//            }
//
//            @Override
//            public Object getItem(int i) {
//                return null;
//            }
//
//            @Override
//            public long getItemId(int i) {
//                return 0;
//            }
//
//            @Override
//            public View getView(int position, View view, ViewGroup viewGroup) {
//                if(view == null){
//                    view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_list,viewGroup,false);
//                }
//                TextView txtCountry = view.findViewById(R.id.txt_country);
//                TextView txtCapital = view.findViewById(R.id.txt_capital);
//                ImageView img;
//                txtCountry.setText(country[position]);
//                txtCapital.setText(capital[position]);
////                img.setImageDrawable(flags[position]);
//
//                txtCountry.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        Toast.makeText(MainActivity.this, capital[position], Toast.LENGTH_SHORT).show();
//                    }
//                });
//                return view;
//            }
//        };
        lstCountryList.setAdapter(myCustomAdapter);



        lstCountryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, country[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}