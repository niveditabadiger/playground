package com.example.hp.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ButtonToast extends AppCompatActivity {

    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_toast);


//        Log.d("onCreate","onCreate is started");
        android.widget.Toast.makeText(this, "onCreate is started", android.widget.Toast.LENGTH_SHORT).show();

        click=findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("U ENTERDE IN WRONG PLACE !.......");
            }
        });
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d("onStart","onStart is started");
//        android.widget.Toast.makeText(this,"onStart is started", android.widget.Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d("onResume","onResume is started");
//        android.widget.Toast.makeText(this,"onResume is started", android.widget.Toast.LENGTH_LONG).show();
//
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d("onPause","onPause is started");
//        android.widget.Toast.makeText(this,"onPause is started", android.widget.Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d("onStop","onStop is started");
//        android.widget.Toast.makeText(this,"onStop is started", android.widget.Toast.LENGTH_LONG).show();
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("onRestart","onRestart is started");
//        android.widget.Toast.makeText(this,"onRestart is started", android.widget.Toast.LENGTH_LONG).show();
//
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("onDestroy","onDestroy is started");
//        android.widget.Toast.makeText(this,"onDestroy is started", android.widget.Toast.LENGTH_LONG).show();
//    }

}
