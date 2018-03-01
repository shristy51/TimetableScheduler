package com.example.shristy.timetablescheduler;

/**
 * Created by wel come on 18-02-2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class First extends AppCompatActivity {
    Button b, b2, b3, b4, b6;
    ImageView i1, i2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.first );
        b = (Button) findViewById ( R.id.b );
        b2 = (Button) findViewById ( R.id.b2 );
        b3 = (Button) findViewById ( R.id.b3 );
        b4 = (Button) findViewById ( R.id.b4 );
        b6 = (Button) findViewById ( R.id.b6 );
        i1 = (ImageView) findViewById ( R.id.iv2 );
        i2 = (ImageView) findViewById ( R.id.iv3 );

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First.this, Course.class);
                startActivity(i);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First.this, Classroom.class);
                startActivity(i);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First.this, Teacher.class);
                startActivity(i);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First.this, Timetable.class);
                startActivity(i);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(First.this, MainActivity.class);
                startActivity(i1);

            }
        });





    }
}
