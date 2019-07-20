package com.hfad.teachersandstudentsinformationrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id)
            {
             if( position == 0)
             {
                 Intent intent = new Intent(MainActivity.this,TeachersListActivity.class);
                 startActivity(intent);
             }

                if( position == 1)
                {
                    Intent intent1 = new Intent(MainActivity.this,StudentsListActivity.class);
                    startActivity(intent1);
                }

                if( position == 2)
                {
                    Intent intent2 = new Intent(MainActivity.this,StuffListActivity.class);
                    startActivity(intent2);
                }

                if( position == 3)
                {
                    Intent intent3 = new Intent(MainActivity.this,About.class);
                    startActivity(intent3);
                }
            }
        };

        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
