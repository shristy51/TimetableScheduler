package com.example.shristy.timetablescheduler;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class Timetable extends AppCompatActivity {
    Button button4, button5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.timetable );
        button4 = (Button) findViewById ( R.id.button4 );
        button5 = (Button) findViewById ( R.id.button5 );
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(Timetable.this, Timetable.class);
                startActivity(i1);
            }

        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(Timetable.this, First.class);
                startActivity(i1);

            }
        });
    }}

