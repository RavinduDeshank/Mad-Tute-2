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

    int x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        add=findViewById(R.id.add);
        sub=(Button)findViewById(R.id.min);
        mul=(Button)findViewById(R.id.mul);
        div=(Button)findViewById(R.id.dev);

        Intent intent=getIntent();
        String n1 = intent.getStringExtra("n1");
        String n2 = intent.getStringExtra("n2");

        nu1=findViewById(R.id.txt1);
        nu2=findViewById(R.id.txt2);
        ans=findViewById(R.id.ans1);

        nu1.setText(n1);
        nu2.setText(n2);

        x = Integer.parseInt(n1);
        y = Integer.parseInt(n2);

        Log.i(TAG,"onCreate : x =" + x);
        Log.i(TAG,"onCreate : y ="+y);

    }
    public void addition(View view){
        ans.setText(String.valueOf(x+y));
    }
    public void sub(View view){
        ans.setText(String.valueOf(x-y));
    }
    public void div(View view){
        ans.setText(String.valueOf(x/y));
    }
    public void mul(View view){
        ans.setText(String.valueOf(x*y));
    }
}

