package com.example.hp.fragmentreview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.hp.fragmentreview.model.Requestmodel;

import java.util.ArrayList;

class listviewadapter extends BaseAdapter {

    Context context;
    ArrayList<Requestmodel> RequestList;

    public listviewadapter(Context Context, ArrayList<Requestmodel> requestmodel_list) {
        this.context=Context;
        this.RequestList=requestmodel_list;
    }

    @Override
    public int getCount() {
        return RequestList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        View view1=LayoutInflater.from(context).inflate(R.layout.arraylist,viewGroup,false);

        Requestmodel requestmodel=this.RequestList.get(position);
        TextView num= (TextView) view1.findViewById(R.id.requestnum);
        num.setText(String.valueOf(requestmodel.getRequestnum()));

        TextView requeststaus= (TextView) view1.findViewById(R.id.Submittext);
        requeststaus.setText(String.valueOf(requestmodel.getRequeststatus()));

        TextView requestdate= (TextView) view1.findViewById(R.id.Status);
        requestdate.setText(String.valueOf(requestmodel.getRequestdate()));
        return view1;

    }
}
