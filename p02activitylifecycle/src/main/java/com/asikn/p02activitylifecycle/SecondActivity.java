package com.asikn.p02activitylifecycle;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textViewIntentResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewIntentResult = findViewById(R.id.textViewIntentResult);

        int result = getIntent().getIntExtra("cnt_val", 0);
        textViewIntentResult.setText(String.valueOf(result));
    }
}
