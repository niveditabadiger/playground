package com.example.hp.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class AndroidLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_lifecycle);
        Log.d("onCreate","onCreate is started");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","onStart is started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","onResume is started");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","onPause is started");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","onStop is started");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart","onRestart is started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","onDestroy is started");
    }


}
