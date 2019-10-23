package com.carmel.bootcamp.nivedita;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class UpdateAttachments extends Fragment{
//    private View view3;

//    ImageView deleteingfirstinfo;
//    ImageView deleteingsecondinfo;
//    ConstraintLayout deletefirstlayout;
//    ConstraintLayout deletesecondlyout;
        RecyclerView recyclerView;
        View view;
        String[] strings = {"abc0037429023.doc", "lmn003745gb9023.doc", "pqr003745gb9023.doc"};
        String[] details = {"Lorem ipsum dolor sit amet, consectetur…", "Lorem ipsum dolor sit amet, consectetur…", "Lorem ipsum dolor sit amet, consectetur…"};
        String[] capacity = {"976 KB", "988 KB", "966 KB"};



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_update_attachments, container, false);
        recyclerView = new RecyclerView(view.getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new RecyclerViewInfoAdapter(view.getContext(),strings,details,capacity));

//        public void removeItem(int position) {
//            recyclerView.remove(position);
//            notifyItemRemoved(position);
//            notifyItemRangeChanged(position, imageModelArrayList.size());
//        }


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



        return recyclerView;
    }



}
