package com.tedu.unmber.one.item;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26 0026.
 */

public class RecyclerViewSault extends RecyclerView.Adapter<RecyclerViewSault.SaultView> {

    private List<Sault>saults;

    public RecyclerViewSault(List<Sault>list){
        saults=list;
    }

    public class SaultView extends RecyclerView.ViewHolder {
        TextView textView;
        public SaultView(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.textId);
        }
    }

    @Override
    public SaultView onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.text,viewGroup,false);

        return new SaultView(view);
    }

    @Override
    public void onBindViewHolder(SaultView sault, int position) {
        sault.textView.setText(saults.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return saults.size();
    }



}

