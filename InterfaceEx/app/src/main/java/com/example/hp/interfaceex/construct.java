package com.example.hp.interfaceex;

import android.widget.Toast;

import java.lang.reflect.GenericArrayType;

public class construct {

    int length;

    int breadth;
    public void construct() {
        length=5;
        breadth=6;

        System.out.println("hello.......");
//        Toast.makeText(this,"this is constrcter message",Toast.LENGTH_LONG).show();
//        Toast.makeText(this,"interface one is running",Toast.LENGTH_LONG).show();
    }

    int area()
    {
        int rectArea=length*breadth;

        return rectArea;

    }
}
