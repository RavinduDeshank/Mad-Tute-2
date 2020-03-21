package com.example.mad_tute_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.LayoutInflater;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;

    Button btnSend;
    CharSequence message = "Sending data...";
    Integer duration = Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        num1 = findViewById(R.id.nametxt2);
        num2 = findViewById(R.id.nametxt3);
        btnSend = findViewById(R.id.btn2);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String n1 = num1.getText().toString();
                String n2 = num2.getText().toString();

                //Toast message using text
                //Toast.makeText(getApplicationContext(), message, duration ).show();

                //Custom Toast Message with Image
                LayoutInflater layoutInflater = getLayoutInflater();
                View layout = layoutInflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_id));
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();

                Intent intent = new Intent(MainActivity.this, Second.class);
                intent.putExtra("n1", n1);
                intent.putExtra("n2", n2);

                startActivity(intent);
            }
        });
    }
}
