package com.example.monojit.assignment41;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static com.example.monojit.assignment41.R.id.listOfAdapters;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> list;
    ListView listOfAdapters;
    ArrayAdapter<String> displayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<String>();

        list.add("Mar");
        list.add("June");
        list.add("feb");
        list.add("jan");
        list.add("Apr");
        list.add("May");
         listOfAdapters=(ListView)findViewById(R.id.listOfAdapters);
        displayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listOfAdapters.setAdapter(displayAdapter);
    }
    public  void assOrder(View view){
        Collections.sort(list);
        displayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listOfAdapters.setAdapter(displayAdapter);
        displayAdapter.notifyDataSetChanged();
    }
    public  void desOrder(View view){
        Collections.reverse(list);
        displayAdapter.notifyDataSetChanged();
    }
}
