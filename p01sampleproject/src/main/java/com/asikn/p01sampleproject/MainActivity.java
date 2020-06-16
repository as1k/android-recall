package com.asikn.p01sampleproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView ivFirst;
    ImageView ivSecond;
    ImageView ivThird;
    TextView tvDescription;
    ImageView ivMain;
    EditText etName;
    ImageView ivFourth;
    Button buttonHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivFirst = findViewById(R.id.iv_first);
        ivSecond = findViewById(R.id.iv_second);
        ivThird = findViewById(R.id.iv_third);
        ivFourth = findViewById(R.id.iv_fourth);
        ivMain = findViewById(R.id.iv_main);
        tvDescription = findViewById(R.id.tv_description);
        etName = findViewById(R.id.et_name);

        ivFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Hello World!",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });

        ivSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDescription.setText("Hi");
                tvDescription.setTextSize(30f);
            }
        });

        ivThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivMain.setImageResource(android.R.drawable.ic_menu_camera);
            }
        });

        ivFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etName.getText().toString();
                Toast.makeText(
                        MainActivity.this,
                        text,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        buttonHello = findViewById(R.id.buttonHello);
        buttonHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.setText("hello");
            }
        });
    }
}
