package com.example.calculatorlibray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.calClass;

public class MainActivity extends AppCompatActivity {
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
        v1 = Integer.parseInt(ed1.getText().toString());
        v2 = Integer.parseInt(ed2.getText().toString());
        int result = calClass.add(MainActivity.this,v1,v2);

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, ""+result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}