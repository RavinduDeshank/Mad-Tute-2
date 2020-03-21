package com.example.mad_tute_02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Second extends AppCompatActivity {

    private static final String TAG ="three";
    EditText nu1;
    EditText nu2;
    TextView ans;
    Button add,sub,mul,div;

    double x;
    double y;
    double a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.min);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.dev);

        final Intent intent = getIntent();
        String n1 = intent.getStringExtra("n1");
        String n2 = intent.getStringExtra("n2");

        nu1 = findViewById(R.id.txt1);
        nu2 = findViewById(R.id.txt2);
        ans = findViewById(R.id.ans1);

        nu1.setText(n1);
        nu2.setText(n2);

        x = Double.parseDouble(n1);
        y = Double.parseDouble(n2);

        Log.i(TAG, "onCreate : x =" + x);
        Log.i(TAG, "onCreate : y =" + y);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(String.valueOf(x+y));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(String.valueOf(x-y));

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(String.valueOf(x/y));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ans.setText(String.valueOf(x*y));

            }
        });
    }
}

