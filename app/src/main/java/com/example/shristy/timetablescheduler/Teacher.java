package com.example.shristy.timetablescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
public class Teacher extends AppCompatActivity {
    Button button2, button3;
    EditText ed1, ed2,ed3,ed4,ed5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.teacher );
        button2 = (Button) findViewById ( R.id.button2 );
        button3 = (Button) findViewById ( R.id.button3 );
        ed1 = (EditText) findViewById(R.id.t1);
        ed2 = (EditText) findViewById(R.id.t2);
        ed3 = (EditText) findViewById(R.id.t3);
        ed4 = (EditText) findViewById(R.id.t4);
        ed5 = (EditText) findViewById(R.id.t5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(Teacher.this, Teacher.class);
                startActivity(i1);
            }

        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Teacher.this, First.class);
                startActivity(i1);

            }
        });
    }}