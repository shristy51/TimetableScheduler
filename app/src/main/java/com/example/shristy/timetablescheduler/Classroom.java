package com.example.shristy.timetablescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Classroom extends AppCompatActivity {
    Button button3, button4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.classroom );
        button3 = (Button) findViewById ( R.id.button3 );
        button4 = (Button) findViewById ( R.id.button4 );
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(Classroom.this, Classroom.class);
                startActivity(i1);
            }

        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Classroom.this, First.class);
                startActivity(i1);

            }
        });
    }}

