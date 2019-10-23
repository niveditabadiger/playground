package com.example.hp.itemarray;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> sarr = new ArrayList<String>();

    TextView textView;
    Button Add;
    Button Display;
    Button Delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        editText=findViewById(R.id.editText);
        Add=findViewById(R.id.button1);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ArrayList<String> sarr = new ArrayList<String>();
                System.out.println("Adding a string");
                sarr.add("One");
                sarr.add("Two");
                sarr.add("Three");
                sarr.add("Four");
            }
        });

        Display=findViewById(R.id.button2);
        Display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView=findViewById(R.id.textView3);
                for (int i=0; i < sarr.size(); i++){
                    textView.setText(textView.getText()+sarr.get(i)+" , ");
                }
//                System.out.println("Displaying the string"+sarr);
            }
        });

        Delete=findViewById(R.id.button3);
        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sarr.clear();
                System.out.println("Deleted the array = " + sarr.size());
            }
        });
    }
}
