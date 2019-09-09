package com.example.hp.interfaceex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ExInterface extends AppCompatActivity implements Exampleinterface, Interface2{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_interface);
        test();
        add();
        construct c = new construct();
        c.construct();
        System.out.println("Area of rectang = "+ c.area());
    }

    @Override
    public void test() {
        System.out.println("This is an interface example...........");
        Toast.makeText(this,"interface one is running",Toast.LENGTH_LONG).show();
    }

    @Override
    public void add() {
        int a,b = 2,c = 3;
        System.out.println("Enter two numbers..");
        a=b+c;
        System.out.println("Result of two number is : " +a);
        Toast.makeText(this,"interface two is running",Toast.LENGTH_LONG).show();
    }
}
