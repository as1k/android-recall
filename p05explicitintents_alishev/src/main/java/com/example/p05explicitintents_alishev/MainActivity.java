package com.example.p05explicitintents_alishev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNameEntry;
    private Button btnChangeActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNameEntry = findViewById(R.id.et_text_entry);
        btnChangeActivity = findViewById(R.id.btn_change_activity);

        btnChangeActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                String etText = etNameEntry.getText().toString();
//                String message = "Button clicked!";
//                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, ChildActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT, etText);

                startActivity(intent);
            }
        });
    }
}
