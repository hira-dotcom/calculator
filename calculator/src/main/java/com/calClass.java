package com;

import android.content.Context;
import android.content.Intent;

import com.example.MainActivity;

public class calClass {
    public  static void add(Context c){
        Intent intent = new Intent(c, MainActivity.class);
        c.startActivity(intent);
    }

}
