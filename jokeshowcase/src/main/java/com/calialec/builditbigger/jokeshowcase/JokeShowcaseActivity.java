package com.calialec.builditbigger.jokeshowcase;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeShowcaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_showcase);

        Intent intent = getIntent();
        TextView jokeText = (TextView) findViewById(R.id.joke_text);
        if (intent.hasExtra("joke")) {
            jokeText.setText(intent.getStringExtra("joke"));
        } else {
            jokeText.setText(R.string.showcase_error);
        }
    }
}
