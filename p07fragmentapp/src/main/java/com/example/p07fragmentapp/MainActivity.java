package com.example.p07fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.FragmentButtonListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragment = new FirstFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, fragment)
                .commitAllowingStateLoss();

        Fragment fragment2 = new ThirdFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.second_container, fragment2)
                .commitAllowingStateLoss();
    }

    public void openNextScreen(String text) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, SecondFragment.newInstance(text))
                .addToBackStack("second")
                .commitAllowingStateLoss();
    }

    @Override
    public void myClick(String text) {
        Fragment fragment = getSupportFragmentManager()
                .findFragmentById(R.id.second_container);
        ((ThirdFragment)fragment).setTitle(text);
    }
}
