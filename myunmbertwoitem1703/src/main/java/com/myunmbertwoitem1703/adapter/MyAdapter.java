package com.myunmbertwoitem1703.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.myunmbertwoitem1703.R;
import com.myunmbertwoitem1703.entity.PicTextEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/9 0009.
 */

public class MyAdapter extends BaseAdapter {
    Context context;
    List<PicTextEntity> list = new ArrayList<>();

    public MyAdapter(Context context) {
        this.context = context;
    }


    public void addTextContent(List<PicTextEntity>ls){
        if (ls!=null){
            this.list.addAll(ls);
            notifyDataSetChanged();
        }
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public PicTextEntity getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        ViewHolder holder = null;
        if (view == null) {
            holder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.activity_store_content, null);
            holder.textView=(TextView)view.findViewById(R.id.test_textView);
            holder.imageView_pic_01 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_02 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_03 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_04 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_05 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_06 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_07 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_08 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.imageView_pic_09 = (ImageView) view.findViewById(R.id.store_image_01);
            holder.edit_content = (EditText) view.findViewById(R.id.store_editId);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

//        String name=holder.edit_content.getText().toString();

        holder.imageView_pic_01.setImageResource(R.drawable.keji3);

        PicTextEntity pe= getItem(position);
        holder.edit_content.setText(pe.getTextContent().toString());
        list.add(pe);

//        holder.imageView_pic_01.setDrawingCacheEnabled(true);
//        holder.imageView_pic_01.setImageResource(R.drawable.keji3);
//        Bitmap bitmap=Bitmap.createBitmap(holder.imageView_pic_01.getDrawingCache());
//        ByteArrayOutputStream bos01=new ByteArrayOutputStream();
//        bitmap.compress(Bitmap.CompressFormat.PNG,100,bos01);
//        holder.imageView_pic_01.setDrawingCacheEnabled(false);
        return view;

    }


    private class ViewHolder {
        ImageView imageView_pic_01;
        ImageView imageView_pic_02;
        ImageView imageView_pic_03;
        ImageView imageView_pic_04;
        ImageView imageView_pic_05;
        ImageView imageView_pic_06;
        ImageView imageView_pic_07;
        ImageView imageView_pic_08;
        ImageView imageView_pic_09;

        EditText edit_content;
        TextView textView;
    }
}

