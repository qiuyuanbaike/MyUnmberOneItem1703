package com.tedu.unmber.one.item;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/26 0026.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyRecyclerView> {
    private LayoutInflater layoutInflater;
    List<String> CharList;
    List<Integer> List;
    Context mContext;
    TextView textView;



    public RecyclerViewAdapter(Context context, List<String> object) {
        this.mContext = context;
        this.CharList = object;
        layoutInflater = LayoutInflater.from(context);
        List = new ArrayList<Integer>();
        for (int i = 0; i < CharList.size(); i++) {
            List.add((int) (100 + Math.random() * 300));
            layoutInflater = layoutInflater.from(context);
            CharList = object;

        }
    }


    static class MyRecyclerView extends RecyclerView.ViewHolder {
        private View itemView;
        public TextView textView;

        public MyRecyclerView(View itemView) {
            super(itemView);
            this.itemView = itemView;
            textView = (TextView) itemView.findViewById(R.id.textId);


        }
    }

    @Override
    public MyRecyclerView onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.text, parent, false);
        return new MyRecyclerView(view);
    }

    @Override
    public void onBindViewHolder(final MyRecyclerView holder, int position) {
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        layoutParams.height = List.get(position);
        holder.itemView.setLayoutParams(layoutParams);
        holder.textView.setText(CharList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getLayoutPosition();
//                mOnItemClickListener.onItemClick();
            }
        });


    }

    @Override
    public int getItemCount() {
        return CharList != null ? CharList.size() : 0;
    }

    private AdapterView.OnItemClickListener mOnItemClickListener;
    private AdapterView.OnItemLongClickListener mOnItemLongClickListener;

    public void setmOnItemClickListener(AdapterView.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public void setmOnItemLongClickListener(AdapterView.OnItemLongClickListener mOnItemLongClickListener) {
        this.mOnItemLongClickListener = mOnItemLongClickListener;
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(View view, int position);
    }

}
