package com.hfad.teachersandstudentsinformationrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TeachersListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_list);

        ArrayAdapter<TeacherDetail> listAdapter = new ArrayAdapter<TeacherDetail>(this,
                android.R.layout.simple_list_item_1, TeacherDetail.teachers);
        ListView teachersList = (ListView)findViewById(R.id.list_teachers);
        teachersList.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> teachersList, View view, int position, long id) {
                Intent intent = new Intent(TeachersListActivity.this,TeacherDetail.class);
                intent.putExtra(TeacherOne.EXTRA_INFO,(int)id);
                startActivity(intent);
            }
        };
    }
}
