package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.TextView;

import com.example.login.global.Status;
import com.example.login.model.Requestmodel;

import java.util.ArrayList;

public class Navmenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView filter;
    TextView popup;
    ListPopupWindow listPopupWindow;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navmenu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        filter=findViewById(R.id.imageView8);
//        String[] content_list = {"CLEAR","APPROVED","AWAITED","DRAFT","REJECTED"};


//        popup = findViewById(R.id.)
        listPopupWindow = new ListPopupWindow(getApplicationContext());
        listPopupWindow.setAdapter(new ArrayAdapter(getApplicationContext(),R.layout.listcontents));
        listPopupWindow.setAnchorView(filter);
        listPopupWindow.setModal(true);

        listView=findViewById(R.id.listView);
//        String title[]={"Rose","Lotus","Jasmine","RCB","Bengularu Bulls"};
//        String date[]={"22-Aug","24-Aug","28-Aug","30-Aug","2-Sep"};
//        String status[]={"APPROVED","REJECTED","DRAFT","AWAITING","COMPLETED"};
//        listView.setAdapter(new ArrayAdapter<>(getApplicationContext(),R.layout.listcontent,list));
//        ListAdapter listAdapter=new mylistadapter(getApplicationContext(),title,date,status);

//        listView.setAdapter(listAdapter);


//        final ArrayList<String> Array = new ArrayList<String>(6);
//
//        final ArrayList<String> ArrayA = new ArrayList<String>(6);
//
//        final ArrayList<String> ArrayB = new ArrayList<String>(6);
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26july2019");
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26july2019");
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26july2019");
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26july2019");
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26july2019");
//
//        Array.add("pur-056-2019");
//        ArrayA.add("Approval");
//        ArrayB.add("26july2019");
        final ArrayList<Requestmodel> requestmodel_list=new ArrayList();
        Requestmodel requestmodel=new Requestmodel();

        requestmodel.setRequestnum("pur-2019-056");
        requestmodel.setRequeststatus(Status.APPROVED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setRequestnum("pur-2019-057");
        requestmodel.setRequeststatus(Status.AWAITING);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setRequestnum("pur-2019-058");
        requestmodel.setRequeststatus(Status.CLOSED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setRequestnum("pur-2019-059");
        requestmodel.setRequeststatus(Status.REJECTED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setRequestnum("pur-2019-060");
        requestmodel.setRequeststatus(Status.DRAFT);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setRequestnum("pur-2019-061");
        requestmodel.setRequeststatus(Status.APPROVED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);





        ListAdapter LA = new listadapter(getApplicationContext(),requestmodel_list);
        listView.setAdapter(LA);


        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listPopupWindow.show();
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Requestmodel request=requestmodel_list.get(position);
                Intent intent=new Intent(getApplicationContext(),RequestView.class);
                Bundle requestDataBundle = new Bundle();
                requestDataBundle.putString("RequestNo",request.getRequestnum());
                requestDataBundle.putString("RequestDate",request.getRequestdate());
                requestDataBundle.putString("RequestStatus",request.getRequeststatus().toString());

                intent.putExtra("request",requestDataBundle);
                startActivity(intent);

            }
        });



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
