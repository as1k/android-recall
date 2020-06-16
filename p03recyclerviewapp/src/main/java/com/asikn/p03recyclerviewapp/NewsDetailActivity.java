package com.asikn.p03recyclerviewapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewsDetailActivity extends AppCompatActivity {

    private TextView tvNewsDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        tvNewsDetail = findViewById(R.id.tvNewsDetail);

        News item = (News) getIntent().getParcelableExtra("news");
        tvNewsDetail.setText(item.getDate());
    }
}
