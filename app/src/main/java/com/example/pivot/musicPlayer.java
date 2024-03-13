package com.example.pivot;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tomer.fadingtextview.FadingTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class musicPlayer extends AppCompatActivity {
  Button musicPlayer;
  FadingTextView fadingTextView;
  String[] fading ={"Happy", "Sad","Fear","Neatural","Anger"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_music_player);

       fadingTextView = findViewById(R.id.fadingText);
       fadingTextView.setTexts(fading);
        musicPlayer = findViewById(R.id.musicPlayer);
        musicPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicPlayer = new Intent(musicPlayer.this,reports.class);
                startActivity(musicPlayer);
            }
        });

    }
}