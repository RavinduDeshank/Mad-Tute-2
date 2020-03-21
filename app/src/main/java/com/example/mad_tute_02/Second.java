package com.example.mad_tute_02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    EditText num1;
    EditText num2;

    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Intent intent = getIntent();
        //String name = intent.getStringExtra("name");
        //TextView nameView = findViewById(R.id.txt1);
        //nameView.setText("Hello"+name);

        num1 = findViewById(R.id.nametxt2);
        num2 = findViewById(R.id.nametxt3);
        btnSend = findViewById(R.id.btn2);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                Intent intent = new Intent(Second.this, three.class);
                intent.putExtra("n1", n1);
                intent.putExtra("n2", n2);

                startActivity(intent);
            }
        });
    }
}
