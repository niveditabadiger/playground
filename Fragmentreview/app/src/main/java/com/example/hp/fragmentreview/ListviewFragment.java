package com.example.hp.fragmentreview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.hp.fragmentreview.RequestviewDelegate.DelegateRequest;
import com.example.hp.fragmentreview.global.Status;
import com.example.hp.fragmentreview.model.Requestmodel;

import java.util.ArrayList;


public class ListviewFragment extends Fragment {
    ListView listView;
    private View view;

    private DelegateRequest delegateRequest;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

                view=inflater.inflate(R.layout.fragment_listview, container, false);


    listView=view.findViewById(R.id.listviewlist);

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



    ListAdapter LA = new listviewadapter(view.getContext(),requestmodel_list);
        listView.setAdapter(LA);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Requestmodel requestmodel=requestmodel_list.get(position);
                if (delegateRequest != null){
                    delegateRequest.OnClickRequestviewItem(requestmodel);
                }
            }
        });
        return view;


    }

    public void setDelegateRequest(DelegateRequest delegateRequest) {
        this.delegateRequest = delegateRequest;
    }
}
