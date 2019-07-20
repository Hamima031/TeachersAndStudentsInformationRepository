
package com.hfad.teachersandstudentsinformationrepository;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.Activity;
        import android.os.Bundle;

public class StuffDetail {
    private String name;
    private String description;

    public static final StuffDetail[] stuffs = {
            new StuffDetail("Md.karim","office Assistant"),
            new StuffDetail("Rahim","Oa"),
            new StuffDetail("Tipu","Lab Assistant"),

    };


    private StuffDetail(String name,String description) {
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