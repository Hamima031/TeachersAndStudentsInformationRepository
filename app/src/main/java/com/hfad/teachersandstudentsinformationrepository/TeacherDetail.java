package com.hfad.teachersandstudentsinformationrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class TeacherDetail {
    private String name;
    private String description;
    private int imageResourceId;

    public static final TeacherDetail[] teachers = {
            new TeacherDetail("Md.Tofayel Ahmed","Chairman",R.drawable.teacheroneimage),
            new TeacherDetail("Khondokoar Fida Hasan","Assistant Professor",R.drawable.teacheroneimage),
            new TeacherDetail("Dulal Chakraborty","Assistant Professor",R.drawable.teacheroneimage),
            new TeacherDetail("Md.Imran Hossain Hossain","Assistant Professor",R.drawable.teacheroneimage),
            new TeacherDetail("Md.Mehedi Hasan","Assistant Professor",R.drawable.teacheroneimage),
            new TeacherDetail("Md.Saifur Rahman","Assistant Professor",R.drawable.teacheroneimage),
            new TeacherDetail("Orvila Sarker","Assistant Professor",R.drawable.teacheroneimage),
            new TeacherDetail("Md.Sharif Hossen","Lecturer",R.drawable.teacheroneimage),
            new TeacherDetail("Sadia Sultana","Lecturer",R.drawable.teacheroneimage),
            new TeacherDetail("Md.Ariful Islam","Lecturer",R.drawable.teacheroneimage),
            new TeacherDetail("Md.Rakib Hasan","Lecturer",R.drawable.teacheroneimage),
            new TeacherDetail("Amena Begum","Lecturer",R.drawable.teacheroneimage)

    };


    private TeacherDetail(String name,String description,int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }


    public String toString() {
        return this.name;
    }
}