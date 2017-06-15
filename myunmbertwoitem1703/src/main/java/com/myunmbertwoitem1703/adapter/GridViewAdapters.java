package com.myunmbertwoitem1703.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myunmbertwoitem1703.R;

/**
 * Created by Administrator on 2017/6/10 0010.
 */

public class GridViewAdapters extends BaseAdapter{
    Context context=null;
    LayoutInflater layoutInflater;
    private Integer[]imageViewPic={
            R.drawable.keji,R.drawable.keji5 ,R.drawable.keji,R.drawable.keji5 ,R.drawable.keji,R.drawable.keji5,
    };
    private String [] textViewContent={"aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa",};

    @Override
    public int getCount() {
        return imageViewPic.length;
    }

    @Override
    public Object getItem(int position) {
        return imageViewPic[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            view=layoutInflater.inflate(R.layout.test,null);
            holder=new ViewHolder();
            holder.imagePic= (ImageView) view.findViewById(R.id.test_imageView);
            holder.textContent= (TextView) view.findViewById(R.id.test_textView);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        String name=textViewContent[position];
        int pic=imageViewPic[position];
        holder.imagePic.setImageResource(pic);
        holder.textContent.setText(name);

        return view;
    }
    public class ViewHolder{
        ImageView imagePic;
        TextView textContent;
    }
}
