package com.carmel.bootcamp.nivedita;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.carmel.bootcamp.nivedita.model.Requestmodel;

import java.util.ArrayList;

class RequesLlistViewAdapter extends BaseAdapter {
    Context context;
    ArrayList<Requestmodel> RequestList;


    public RequesLlistViewAdapter(Context context, ArrayList<Requestmodel> requestmodel_list) {
        this.context=context;
        this.RequestList=requestmodel_list;
    }

    @Override
    public int getCount() {
        return RequestList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1= LayoutInflater.from(context).inflate(R.layout.requestlistviewdesign,viewGroup,false);

        Requestmodel requestmodel=this.RequestList.get(i);
        TextView num= (TextView) view1.findViewById(R.id.requestid);
        num.setText(String.valueOf(requestmodel.getReuestid()));

        TextView requeststaus= (TextView) view1.findViewById(R.id.reqstatus);
        requeststaus.setText(String.valueOf(requestmodel.getRequeststatus()));

        TextView requestdate= (TextView) view1.findViewById(R.id.reqdate);
        requestdate.setText(String.valueOf(requestmodel.getRequestdate()));
        return view1;
    }
}
