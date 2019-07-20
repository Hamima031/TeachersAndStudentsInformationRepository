package com.hfad.teachersandstudentsinformationrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TeacherOne extends Activity {

    public static final String EXTRA_INFO = "teacherId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_one);
        int teacherId = (Integer)getIntent().getExtras().get(EXTRA_INFO);
        TeacherDetail teacher = TeacherDetail.teachers[teacherId];


        TextView name = (TextView)findViewById(R.id.teacher_one_detail);
        name.setText(teacher.getName());

        ImageView photo = (ImageView)findViewById(R.id.teacher_one_image);
        photo.setImageResource(teacher.getImageResourceId());
        photo.setContentDescription(teacher.getName());

    }
}
