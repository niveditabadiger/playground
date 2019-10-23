package com.carmel.bootcamp.nivedita;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class RecyclerViewInfoAdapter extends RecyclerView.Adapter {
    private String[] datasource,content,total;


    Context context;
    public RecyclerViewInfoAdapter(Context context, String[] strings, String[] details, String[] capacity) {
        this.datasource=strings;
        this.context=context;
        this.content=details;
        this.total=capacity;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflater = LayoutInflater.from(context).inflate(R.layout.recyclerviewitem,parent,false);
        RecyclerViewHolder viewHolder =new RecyclerViewHolder(inflater);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    RecyclerViewHolder viewHolder = (RecyclerViewHolder)holder;
    viewHolder.setUpdata(String.valueOf(datasource[position]),String.valueOf(content[position]),String.valueOf(total[position]));
    }


    @Override
    public int getItemCount() {
        return datasource.length;
    }


    private  class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public TextView textid;
        public  TextView description,filesize;
        public ImageView deleteimage;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            textid = itemView.findViewById(R.id.textView);
            description=itemView.findViewById(R.id.textView3);
            filesize=itemView.findViewById(R.id.textView2);
            deleteimage=itemView.findViewById(R.id.imageView);
        }

        public void setUpdata(String strings, String valueOf1, String valueOf2) {
            textid.setText(strings);
            description.setText(valueOf1);
            filesize.setText(valueOf2);
            deleteimage.setImageResource(R.drawable.delete);

            deleteimage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    deleteItem(getAdapterPosition());
                }
            });
        }
        private void deleteItem(int adapterPosition) {
            textid.endBatchEdit();
            notifyItemRemoved(adapterPosition);
        }
    }


}
