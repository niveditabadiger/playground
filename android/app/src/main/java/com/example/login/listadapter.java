package com.example.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.login.model.Requestmodel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.zip.Inflater;

public class listadapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
//    ArrayList<String> Arraya;
//    ArrayList<String> Arrayb;
    ArrayList<Requestmodel> RequestList;

//    public listadapter(Context context, ArrayList<String> textview, ArrayList<String> textview2, ArrayList<String> textview3){
//        this.context=context;
//        this.Arraya=textview;
//        this.Arrayb=textview2;
//        this.Arrayc=textview3;
//        inflater=(LayoutInflater.from(context));
//    }

    public listadapter(Context Context, ArrayList<Requestmodel> requestmodel_list) {
        this.context=Context;
        this.RequestList=requestmodel_list;
    }


    @Override
    public int getCount() {
        return  RequestList.size();
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
        View view1=LayoutInflater.from(context).inflate(R.layout.arraylist,viewGroup,false);

        Requestmodel requestmodel=this.RequestList.get(i);
        TextView num= (TextView) view1.findViewById(R.id.textView17);
        num.setText(String.valueOf(requestmodel.getRequestnum()));

        TextView requeststaus= (TextView) view1.findViewById(R.id.textView21);
        requeststaus.setText(String.valueOf(requestmodel.getRequeststatus()));

        TextView requestdate= (TextView) view1.findViewById(R.id.textView23);
        requestdate.setText(String.valueOf(requestmodel.getRequestdate()));
        return view1;
//        in.setText(String.valueOf(Array.get(i)));
//        TextView bb= (TextView) im.findViewById(R.id.textView21);
//        in.setText(Arrayb.get(i));
//        TextView cc= (TextView) im.findViewById(R.id.textView23);
//        in.setText(Arrayc.get(i));
//        ImageView ac=(ImageView) im.findViewById(R.id.imageView6);
//        ac.setImageResource(R.drawable.natification);









    }
}
