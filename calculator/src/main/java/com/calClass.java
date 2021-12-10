package com;

import android.content.Context;
import android.content.Intent;

import com.example.AddActivity;

public class calClass {
    public  static void add(Context c){
        Intent intent = new Intent(c, AddActivity.class);
        c.startActivity(intent);
    }

}
