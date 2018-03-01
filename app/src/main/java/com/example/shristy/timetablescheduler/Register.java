package com.example.shristy.timetablescheduler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wel come on 21-01-2018.
 */

public class Register extends AppCompatActivity {
    Button b1;
    EditText ed1, ed2, ed3, ed4, ed5;
    TextView t1, t2;
    public int contentView;
    public Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState );
        setContentView ( R.layout.register );
        b1 = (Button) findViewById ( R.id.b );
        ed1 = (EditText) findViewById ( R.id.et1 );
        ed2 = (EditText) findViewById ( R.id.et2 );
        ed3 = (EditText) findViewById ( R.id.et3 );
        ed4 = (EditText) findViewById ( R.id.et4 );
        ed5 = (EditText) findViewById ( R.id.et5 );
        t1 = (TextView) findViewById ( R.id.tv1 );
        t2 = (TextView) findViewById ( R.id.tv2 );

        b1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Toast.makeText ( getApplicationContext (), "REGISTERED SUCCESSFULLY!!!", Toast.LENGTH_SHORT ).show ();
                Intent i1 = new Intent(Register.this, MainActivity.class);
                startActivity(i1);
            }
        });
    }}