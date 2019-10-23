package com.example.hp.interfaceex;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class construct extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
        int length;

    int breadth;
     construct() {
        length=5;
        breadth=6;

        System.out.println("hello.......");

//        Toast.makeText(this,"interface one is running",Toast.LENGTH_LONG).show();
    }

    int area(Context applicationContext)
    {
        int rectArea=length*breadth;
        Toast.makeText(applicationContext,"this is a toast",Toast.LENGTH_LONG).show();

        return rectArea;
//        Toast.makeText(applicationContext,"thi is a toast",Toast.LENGTH_LONG).show();
//        toast.show();
    }
}
