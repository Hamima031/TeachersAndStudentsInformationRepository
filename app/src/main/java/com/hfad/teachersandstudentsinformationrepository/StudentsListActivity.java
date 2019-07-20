package com.hfad.teachersandstudentsinformationrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StudentsListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);
        ArrayAdapter<StudentDetail> listAdapter = new ArrayAdapter<StudentDetail>(this,
                android.R.layout.simple_list_item_1, StudentDetail.students);
        ListView studentsList = (ListView)findViewById(R.id.list_students);
        studentsList.setAdapter(listAdapter);
    }
}
