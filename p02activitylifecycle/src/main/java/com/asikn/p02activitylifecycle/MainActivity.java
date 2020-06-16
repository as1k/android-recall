package com.asikn.p02activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int cnt = 0;

    private TextView textViewCounterResult;
    private Button buttonCount;
    private Button buttonNavigation;
    private Button buttonShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate");

        textViewCounterResult = findViewById(R.id.textViewCounterResult);
        buttonCount = findViewById(R.id.buttonCount);
        buttonNavigation = findViewById(R.id.buttonNavigation);
        buttonShare = findViewById(R.id.buttonShare);

        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;
                textViewCounterResult.setText(String.valueOf(cnt));
            }
        });

        buttonNavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("cnt_val", cnt);
                startActivity(intent);
            }
        });

        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, cnt);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        cnt = savedInstanceState.getInt("cnt");
        Log.d("lifecycle", "onRestoreInstanceState " + cnt);
        textViewCounterResult.setText(String.valueOf(cnt));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "onStop");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("cnt", cnt);
        Log.d("lifecycle", "onSaveInstanceState " + cnt);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy");
    }
}
