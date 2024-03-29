package com.example.hp.fragmentreview;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.hp.fragmentreview.RequestviewDelegate.DelegateRequest;
import com.example.hp.fragmentreview.model.Requestmodel;

public class Main2Activity_request extends AppCompatActivity implements DelegateRequest{
        //implements NavigationView.OnNavigationItemSelectedListener,DelegateRequest {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_request);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//
//        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
//        navigationView.setNavigationItemSelectedListener(this);

        ListviewFragment  fragment=new ListviewFragment();
        fragment.setDelegateRequest(this);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.FrameLayoutFragment,fragment);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
      if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
          RequestviewFragment  fragment=new RequestviewFragment();
////            fragment.setDelegateRequest(this);
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.FrameLayoutFragment,fragment);
                        ft.addToBackStack(null);
            ft.commit();
        }
        else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            RequestviewFragment  fragment=new RequestviewFragment();
////              fragment.setDelegateRequest(this);
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.FrameholderLayout,fragment);
            ft.addToBackStack(null);
            ft.commit();
        }
    }

    @Override
//    public void onConfigurationChanged(Configuration newConfig){
//        super.onConfigurationChanged(newConfig);
    public void OnClickRequestviewItem(Requestmodel requestmodel) {
        int orientation =this.getResources().getConfiguration().orientation;
        if(orientation==Configuration.ORIENTATION_PORTRAIT) {
            RequestviewFragment fragment = new RequestviewFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.FrameLayoutFragment, fragment);
            ft.addToBackStack(null);
            ft.commit();
            ((RequestviewFragment) fragment).dataset(requestmodel);
        }
        else {
            RequestviewFragment fragment = new RequestviewFragment();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.FrameholderLayout, fragment);
            ft.addToBackStack(null);
            ft.commit();
            ((RequestviewFragment) fragment).dataset(requestmodel);
        }
    }
}




//    public void Selectfrag (View view) {
//
//
//        if (view == findViewById(R.id.listviewlist))
//            fragment=new ListviewFragment();
//        else
//
//        }


//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main2_activity_request, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    @SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item) {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_camera) {
//            // Handle the camera action
//        } else if (id == R.id.nav_gallery) {
//
//        } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {
//
//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
//        }
//
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }

