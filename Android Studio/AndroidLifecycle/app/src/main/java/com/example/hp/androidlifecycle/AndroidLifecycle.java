package com.example.hp.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class AndroidLifecycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_lifecycle);
        Log.d("onCreate","onCreate is started");
        Toast.makeText(this, "onCreate is started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart","onStart is started");
        Toast.makeText(this,"onStart is started",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","onResume is started");
        Toast.makeText(this,"onResume is started",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","onPause is started");
        Toast.makeText(this,"onPause is started",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","onStop is started");
        Toast.makeText(this,"onStop is started",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart","onRestart is started");
        Toast.makeText(this,"onRestart is started",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","onDestroy is started");
        Toast.makeText(this,"onDestroy is started",Toast.LENGTH_LONG).show();
    }


}
