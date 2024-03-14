package com.example.pivot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class reports extends AppCompatActivity {
 View rectangle_22793;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        rectangle_22793 = findViewById(R.id.rectangle_22793);
        rectangle_22793.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rectangle_22793 = new Intent(reports.this,Homepage.class);
                startActivity(rectangle_22793);
            }
        });
    }
}