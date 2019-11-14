package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("RRRRRR", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("RRRRRR", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("RRRRRR", "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("RRRRRR", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("RRRRRR", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("RRRRRR", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("RRRRRR", "onPause");
    }
}
