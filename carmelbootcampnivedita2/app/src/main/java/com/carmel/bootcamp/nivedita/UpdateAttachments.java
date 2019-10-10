package com.carmel.bootcamp.nivedita;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class UpdateAttachments extends Fragment implements RecyclerViewAdapter.OnItemClickListener{
    private View view3;

//    ImageView deleteingfirstinfo;
//    ImageView deleteingsecondinfo;
//    ConstraintLayout deletefirstlayout;
//    ConstraintLayout deletesecondlyout;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view3 = inflater.inflate(R.layout.fragment_update_attachments, container, false);


//        deleteingfirstinfo=view3.findViewById(R.id.deleteimage);
//        deleteingsecondinfo=view3.findViewById(R.id.deletingimage);
//        deletefirstlayout=view3.findViewById(R.id.attachmentupdatelayout);
//        deletesecondlyout=view3.findViewById(R.id.attachmentsupdatelayout);
//
//        deleteingfirstinfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
////                deletelayout.setVisibility(View.VISIBLE);
//                deletefirstlayout.setVisibility(View.INVISIBLE);
//
//            }
//        });
//
//        deleteingsecondinfo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                deletesecondlyout.setVisibility(View.INVISIBLE);
//            }
//        });


        return view3;
    }


}
