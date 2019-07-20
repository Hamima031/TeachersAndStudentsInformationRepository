package com.hfad.teachersandstudentsinformationrepository;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

public class StudentDetail {
    private String name;
    private String description;

    public static final StudentDetail[] students = {
            new StudentDetail("Saiful Islam","11609001"),
            new StudentDetail("Saiful Islam","11609002"),
            new StudentDetail("Saiful Islam","11609003"),
            new StudentDetail("Saiful Islam","11609004"),
            new StudentDetail("Saiful Islam","11609005"),
            new StudentDetail("Saiful Islam","11609006"),
            new StudentDetail("Saiful Islam","11609007"),
            new StudentDetail("Saiful Islam","11609008"),
            new StudentDetail("Saiful Islam","11609009"),
            new StudentDetail("Saiful Islam","11609010"),
            new StudentDetail("Saiful Islam","11609011"),
            new StudentDetail("Saiful Islam","11609012"),
            new StudentDetail("Saiful Islam","11609013"),
            new StudentDetail("Saiful Islam","11609014"),
            new StudentDetail("Saiful Islam","11609015"),
            new StudentDetail("Saiful Islam","11609016"),
            new StudentDetail("Saiful Islam","11609017"),
            new StudentDetail("Saiful Islam","11609018"),
            new StudentDetail("Saiful Islam","11609019"),
            new StudentDetail("Saiful Islam","11609020"),
            new StudentDetail("Saiful Islam","11609021"),
            new StudentDetail("Saiful Islam","11609022"),
            new StudentDetail("Saiful Islam","11609023"),
            new StudentDetail("Saiful Islam","11609024"),
            new StudentDetail("Saiful Islam","11609025"),
            new StudentDetail("Saiful Islam","11609026"),
            new StudentDetail("Saiful Islam","11609027"),
            new StudentDetail("Saiful Islam","11609028"),
            new StudentDetail("Saiful Islam","11609029"),


    };


    private StudentDetail(String name,String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName(){
        return name;
    }


    public String toString() {
        return this.name;
    }
}