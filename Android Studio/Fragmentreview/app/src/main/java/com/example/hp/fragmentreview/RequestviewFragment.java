package com.example.hp.fragmentreview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


import com.example.hp.fragmentreview.model.Requestmodel;

import java.util.ArrayList;

import static com.example.hp.fragmentreview.R.id.itremlistview;


public class RequestviewFragment extends Fragment {
    ListView listViewone;
    private View rootview;
    TextView Orderd_id, Order_Date,Order_Status;
    private Requestmodel requestmodel1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_requestview, container, false);
//         Inflate the layout for this fragment

        listViewone = rootview.findViewById(itremlistview);
        ArrayList Items =new ArrayList();


        Requestmodel requestmodel = new Requestmodel();
        requestmodel.setItems_desc("IBM ThinkServer TS150 Tower Server With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5\"(3.3 GHz /Cache 8 MB)... / STD MEMORY 8GB X 1/ MAX. MEMORY 64GB 4 Slots/HARD DRIVE 1 X 1TB SATA 3.5\" 7.2k SATA / STD. HDD BAY/ 3 bay MAX. HDD BAY upto 4 x 3.5\" +1 x 2.5\" bay/ OPTICAL Multi Burner/Integrated RAID 0,1,5,10 (RAID 121i).");
        requestmodel.setItems_qty(01);
        requestmodel.setItems_date("10 Jul 2019");
        requestmodel.setItems_cost(450000);
        Items.add(requestmodel);

        requestmodel = new Requestmodel();
        requestmodel.setItems_desc("Lenovo ThinkServer TS450 (PN:70M2001VIH) With Max. Processor 1 x Intel Xeon E3 (Quad Core) E3-1225 v5”(3.3 GHz /Cache 8 MB)/ STD MEMORY 8GB X 1 MAX. MEMORY 64GB; 4 DIMM Memory Slots/ HARD DRIVE Open Bay/ 2.5” SAS/SATA HS Bays (8 bay MAX. HDD BAY upto 8 x 2.5” bay MAX. HDD BAY upto 16x2.5”)/OPTICAL Multi Burner/ PCIe RAID 0,1,10 (RAID 520i). Supports SAS & SATA drives/Power Supply Standard (Inbuilt) 1 x 450W Power Supply /Max: 2");
        requestmodel.setItems_qty(01);
        requestmodel.setItems_date("10 Jul 2019");
        requestmodel.setItems_cost(45000);
        Items.add(requestmodel);

        requestmodel = new Requestmodel();
        requestmodel.setItems_desc("IBM X3300M4 Server With x3300M4/ Part NO:7382IA4/ Intel Xeon E5 1230v2 1.8 GHz,10 MB,1066MHz/ 1x 8GB RAM/ 1x500GB SATA HDD/ 3.5Simple-Swap/ MULTI BUTRNER");
        requestmodel.setItems_qty(01);
        requestmodel.setItems_date("10 Jul 2019");
        requestmodel.setItems_cost(45000);
        Items.add(requestmodel);

        requestmodel = new Requestmodel();
        requestmodel.setItems_desc("IBM Lenovo ThinkServer RD450 Rack Server (PN:70Q90059IH) with 1 x Intel® Xeon® E5-2620v4 (2.1GHz/8C/20MB/85W/2133Mhz)/Max: 2 Processors/ STD MEMORY 16GB X 1 MAX. MEMORY 1 TB ;16 Slots/ HARD DRIVE : Open Bay (2.5” HOT Swap SAS/SATA STD. HDD BAY 8 bay / MAX. HDD BAY 16 bay with optical bay/24 bay without optical bay) / OPTICAL Multi Burner/ Integrated RAID 0,1,10 (RAID 110i). Supports only SATA drive/ Power Supply Standard (Inbuilt) 1 x 750W Power Supply Max: 2");
        requestmodel.setItems_qty(01);
        requestmodel.setItems_date("10 Jul 2019");
        requestmodel.setItems_cost(45000);
        Items.add(requestmodel);

        requestmodel = new Requestmodel();
        requestmodel.setItems_desc("daptec 128 MB Raid Controller Pair. Pci-e SAS/SATA");
        requestmodel.setItems_qty(01);
        requestmodel.setItems_date("10 Jul 2019");
        requestmodel.setItems_cost(45000);
        Items.add(requestmodel);

        ListAdapter listAdapter = new MylistAadpter(rootview.getContext(),Items);
        listViewone.setAdapter(listAdapter);






        Orderd_id=rootview.findViewById(R.id.request_id);
        Order_Date=rootview.findViewById(R.id.request_Date);
        Order_Status=rootview.findViewById(R.id.request_Status);
        if(requestmodel!=null) {
            Orderd_id.setText(requestmodel1.getRequestnum());
            Order_Date.setText(requestmodel1.getRequestdate());
            Order_Status.setText(requestmodel1.getRequeststatus().toString());
        }
       return rootview;

    }
    public void dataset(Requestmodel requestmodel){
        this.requestmodel1=requestmodel;
    }


}
