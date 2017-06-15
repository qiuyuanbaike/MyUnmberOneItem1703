package com.myunmbertwoitem1703;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.myunmbertwoitem1703.adapter.MyAdapter;
import com.myunmbertwoitem1703.entity.PicTextEntity;

import java.util.ArrayList;
import java.util.List;

public class StoreListView extends AppCompatActivity {

    ListView listView;
    MyAdapter adapter;
    List<PicTextEntity> list = new ArrayList<>();
//    private Integer[]imageViewPic={
//            R.drawable.keji,R.drawable.keji5 ,R.drawable.keji,R.drawable.keji5 ,R.drawable.keji,R.drawable.keji5,
//
//    };
//    private String [] textViewContent={"aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa","aaaaaaaaaaaa",};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list_view);


        initialUI();


    }


    private void initialUI() {
        listView = (ListView) findViewById(R.id.store_listViewId);
        adapter = new MyAdapter(this);
        adapter.addTextContent(list);
        listView.setAdapter(adapter);

    }

//    public class MyAdapters extends BaseAdapter {
//        @Override
//        public int getCount() {
//            return imageViewPic.length;
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return imageViewPic[position];
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View view, ViewGroup parent) {
//            View v=null;
//            ViewHolder holder;
//            if (view==null){
//                holder=new ViewHolder();
//                v=View.inflate(StoreListView.this,R.layout.test,null);
//                holder.imagePic= (ImageView) v.findViewById(R.id.test_imageView);
//                holder.textContent= (TextView) v.findViewById(R.id.test_textView);
//                v.setTag(holder);
//            }else{
//                v=view;
//                holder= (ViewHolder) view.getTag();
//                String name=textViewContent[position];
//                int pic=imageViewPic[position];
//                holder.textContent.setText(name);
//                holder.imagePic.setImageResource(pic);
//            }
//
//            return v;
//        }
//    }
//    public class ViewHolder{
//        ImageView imagePic;
//        TextView textContent;
//    }

}
