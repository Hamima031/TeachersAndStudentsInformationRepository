package com.hfad.teachersandstudentsinformationrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StuffListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuff_list);
        ArrayAdapter<StuffDetail> listAdapter = new ArrayAdapter<StuffDetail>(this,
                android.R.layout.simple_list_item_1, StuffDetail.stuffs);
        ListView stuffsList = (ListView)findViewById(R.id.list_stuff);
        stuffsList.setAdapter(listAdapter);
    }
}
