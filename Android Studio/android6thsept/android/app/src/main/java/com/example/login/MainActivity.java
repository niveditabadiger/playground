package com.example.login;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button login;
 ImageView i1;
 ImageView i2;
 TextView i3;
 TextView i4;
 TextView forget;
 EditText name;

// AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        alertBuilder=new AlertDialog.Builder(this);
//        final View alertView=getLayoutInflater().inflate(R.layout.activity_alertmsg,null);
//        alertBuilder.setView(alertView);
//        final AlertDialog alertDialog=alertBuilder.create();

        login=findViewById(R.id.button4);
        i1=findViewById(R.id.imageView2);
        i2=findViewById(R.id.imageView5);
        i3=findViewById(R.id.textView);
        i4=findViewById(R.id.textView12);
        forget=findViewById(R.id.textView7);
        name=findViewById(R.id.editText5);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(),Forgetpassword.class);
//                startActivity(intent);
                if (name.getText().toString().equals("")) {
                    i1.setVisibility(View.VISIBLE);
                    i2.setVisibility(View.VISIBLE);
                    i3.setVisibility(View.VISIBLE);
                    i4.setVisibility(View.VISIBLE);
                }
                else {
//                    name.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
                            Intent intent=new Intent(getApplicationContext(),navmenu.class);
                            startActivity(intent);
//                        }
//                    });
//                    Intent intent=new Intent(getApplicationContext(),navmenu.class);
//                startActivity(intent);
                }
            }
        });
//
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Forgetpassword.class);
                startActivity(intent);

//                alertDialog.show();
            }
        });
    }
}
