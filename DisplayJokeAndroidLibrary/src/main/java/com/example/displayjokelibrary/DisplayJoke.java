package com.example.displayjokelibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJoke extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        String joke=getIntent().getStringExtra("joke");
        TextView jokeDisplay=findViewById(R.id.jokeDisplay);
        jokeDisplay.setText(joke);

    }
}
