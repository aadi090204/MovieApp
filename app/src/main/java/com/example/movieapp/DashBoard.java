package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashBoard extends AppCompatActivity {

    Button a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dash_board);


        a=(Button) findViewById(R.id.am);
        b=(Button) findViewById(R.id.sm);
        c=(Button) findViewById(R.id.vm);
        d=(Button) findViewById(R.id.ext);


        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(x);
            }
        });

    }
}