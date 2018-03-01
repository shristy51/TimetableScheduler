package com.example.shristy.timetablescheduler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2;
    EditText ed1, ed2;
    Spinner s;ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.bu1);
        ed1 = (EditText) findViewById(R.id.et1);
        ed2 = (EditText) findViewById(R.id.et2);
        s = (Spinner) findViewById(R.id.s);
        b2 = (Button) findViewById(R.id.bu2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("Student") && ed2.getText().toString().equals("Sgsitsit")) {
                    Intent i1 = new Intent(MainActivity.this, First.class);
                    startActivity(i1);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Register.class);
                startActivity(i);

            }
        });
    }

}