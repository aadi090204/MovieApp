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

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    String s,s1,s2="theatre",s3="12345",s4="invalid creditionals";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.uname);
        e2=(EditText) findViewById(R.id.pwd);
        b1=(Button) findViewById(R.id.logbt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s=e1.getText().toString();
                s1=e2.getText().toString();
                if (s.equals(s2) && s1.equals(s3))
                {
                    Intent ob=new Intent(getApplicationContext(), DashBoard.class);
                    startActivity(ob);
                }
                else {
                    Toast.makeText(getApplicationContext(),s4,Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}