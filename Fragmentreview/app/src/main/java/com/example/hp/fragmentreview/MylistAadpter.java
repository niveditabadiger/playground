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

class MylistAadpter extends BaseAdapter {
    ArrayList Items;
    private Context context;

    public MylistAadpter(Context context, ArrayList items_desc) {
        this.Items = items_desc;
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(context).inflate(R.layout.itemrequest,viewGroup,false);
        TextView Item_desc, Item_date, Item_qty, Item_cost;

        Item_desc = view1.findViewById(R.id.item_desc);
        Item_qty = view1.findViewById(R.id.item_qty);
        Item_cost = view1.findViewById(R.id.item_cost);
        Item_date =view1.findViewById(R.id.item_date);

        Requestmodel requestmodel = (Requestmodel) this.Items.get(i);
        Item_desc.setText(String.valueOf(requestmodel.getItems_desc()));
        Item_cost.setText(String.valueOf(requestmodel.getItems_desc()));
        Item_date.setText(String.valueOf(requestmodel.getItems_cost()));
        Item_qty.setText(String.valueOf(requestmodel.getItems_qty()));

        return view1;


    }
}
