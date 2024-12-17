package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddMovie extends AppCompatActivity {

    String m="Movie details added ",ma,ms,md,mf,mg,mh;
    Button e,f;
    EditText t,y,u,i,o,p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_movie);

        e=(Button) findViewById(R.id.sub);
        f=(Button) findViewById(R.id.backbt);
        t=(EditText) findViewById(R.id.mn);
        y=(EditText) findViewById(R.id.lg);
        u=(EditText) findViewById(R.id.dn);
        i=(EditText) findViewById(R.id.ar);
        o=(EditText) findViewById(R.id.ars);
        p=(EditText) findViewById(R.id.ry);


        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ab=new Intent(getApplicationContext(), DashBoard.class);
                startActivity(ab);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma=t.getText().toString();
                ms=t.getText().toString();
                md=t.getText().toString();
                mf=t.getText().toString();
                mg=t.getText().toString();
                mh=t.getText().toString();
                Toast.makeText(getApplicationContext(),m,Toast.LENGTH_LONG).show();
            }
        });

    }
}