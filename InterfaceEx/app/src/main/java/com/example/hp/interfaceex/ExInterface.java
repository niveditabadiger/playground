package com.example.hp.interfaceex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExInterface extends AppCompatActivity implements Exampleinterface, Interface2{
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex_interface);
        test();
        add();

        click = findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                construct b = new construct();
                System.out.println("Area of rectang = "+ b.area(getApplicationContext()));
                b.area(getApplicationContext());
            }
        });
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
