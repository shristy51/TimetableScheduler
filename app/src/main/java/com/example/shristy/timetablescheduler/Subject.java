package com.example.shristy.timetablescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
public class Subject extends AppCompatActivity {
    Button button4, button6;
    Spinner s2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.subject );
        button4 = (Button) findViewById ( R.id.button4 );
        button6 = (Button) findViewById ( R.id.button6 );
        s2 = (Spinner) findViewById(R.id.s2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
            }

        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Subject.this, First.class);
                startActivity(i1);

            }
        });
    }}
