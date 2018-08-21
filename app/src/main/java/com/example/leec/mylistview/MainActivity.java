package com.example.leec.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listItem =  {"Australia", "Belarus", "Canada", "Denmark", "England"};
        ListView simpleListView = findViewById(R.id.simpleList);
        ListAdapter arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listItem);

        simpleListView.setAdapter(arrayAdapter);
    }
}
