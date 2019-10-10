package com.carmel.bootcamp.nivedita;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;

import com.carmel.bootcamp.nivedita.global.Status;
import com.carmel.bootcamp.nivedita.model.Requestmodel;

import java.util.ArrayList;


public class MyRequest extends Fragment {
    ListView listView;
    private View view;
    Button button;
    ImageView filter;
//    ListPopupWindow listPopupWindow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_my_request, container, false);


//        filter=view.findViewById(R.id.imageView2);
//        listPopupWindow = new ListPopupWindow(getApplicationContext());




        button=view.findViewById(R.id.newrequestbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RequisitionForm3  fragment=new RequisitionForm3();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.myrequestlayout,fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });





        listView=view.findViewById(R.id.requestlist);

        final ArrayList<Requestmodel> requestmodel_list=new ArrayList();
        Requestmodel requestmodel=new Requestmodel();

        requestmodel.setReuestid("pur-2019-056");
        requestmodel.setRequeststatus(Status.APPROVED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setReuestid("pur-2019-057");
        requestmodel.setRequeststatus(Status.AWAITING);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setReuestid("pur-2019-058");
        requestmodel.setRequeststatus(Status.CLOSED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setReuestid("pur-2019-059");
        requestmodel.setRequeststatus(Status.REJECTED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setReuestid("pur-2019-060");
        requestmodel.setRequeststatus(Status.DRAFT);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);

        requestmodel=new Requestmodel();
        requestmodel.setReuestid("pur-2019-061");
        requestmodel.setRequeststatus(Status.APPROVED);
        requestmodel.setRequestdate("26july2019");
        requestmodel_list.add(requestmodel);


        ListAdapter listAdapter = new RequesLlistViewAdapter(view.getContext(),requestmodel_list);
        listView.setAdapter(listAdapter);

        return view;
    }


    }

