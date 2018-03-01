package com.example.shristy.timetablescheduler;

/**
 * Created by shristy on 1/3/18.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Course extends AppCompatActivity {
    Button button4, button5, button6;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.course );
        button4 = (Button) findViewById ( R.id.button4 );
        button5 = (Button) findViewById ( R.id.button5 );
        button6 = (Button) findViewById ( R.id.button6 );
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Course.this, Subject.class);
                startActivity(i1);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent i1 = new Intent(Course.this, First.class);
                    startActivity(i1);

            }
        });
}}

