package com.example.pivot;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class sucessfully_registrated extends AppCompatActivity {

    Button Continue;

   ImageView backButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucessfully_registrated);

        backButton= findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(sucessfully_registrated.this,confirm_password.class);
                startActivity(j);
            }
        });

        Continue = findViewById(R.id.Continue);
        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sucessfully_registrated.this,Homepage.class);
                startActivity(i);
            }
        });
    }
}