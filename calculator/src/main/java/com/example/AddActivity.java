package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calculator.R;

public class AddActivity extends AppCompatActivity {

    Button btn_sum ;
    EditText ed1,ed2;
    int v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_sum = findViewById(R.id.sum);
        ed1 = findViewById(R.id.val1);
        ed2 = findViewById(R.id.val2);
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1 = Integer.parseInt(ed1.getText().toString());
                v2 = Integer.parseInt(ed2.getText().toString());
                int result = v1+v2;
                Toast.makeText(AddActivity.this, "result "+result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}