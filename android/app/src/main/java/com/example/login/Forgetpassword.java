package com.example.login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Forgetpassword extends AppCompatActivity {
    ImageView i1;
    ImageView i2;
    TextView t1;
    TextView t2;
    Button continuebtn;

    AlertDialog.Builder alertBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        alertBuilder=new AlertDialog.Builder(this);
        final View alertView=getLayoutInflater().inflate(R.layout.activity_alertmsg,null);
        alertBuilder.setView(alertView);
        final AlertDialog alertDialog=alertBuilder.create();

        i1=findViewById(R.id.imageView);
        i2=findViewById(R.id.imageView4);
        t1=findViewById(R.id.textView8);
        t2=findViewById(R.id.textView9);
        continuebtn=findViewById(R.id.button);
        continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(),Forgetpassword.class);
//                startActivity(intent);
                i1.setVisibility(View.VISIBLE);
                i2.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);

                alertDialog.show();

            }
        });
    }
}
