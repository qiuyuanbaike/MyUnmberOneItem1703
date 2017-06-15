package com.myunmbertwoitem1703;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class StoreContent extends AppCompatActivity {
    private EditText stoer_edit;
    private String now = "";
    private TextView timeText;
    Handler handler;

    private ImageView
            imageView_store_01, imageView_store_02,
            imageView_store_03, imageView_store_04,
            imageView_store_05, imageView_store_06,
            imageView_store_07, imageView_store_08,
            imageView_store_09;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_content);

        initiaUI();
        AcceptActivityData();
//        GainTime();

    }

    /**
     * 接收OneTurnActivity传过来的数据
     */
    private void AcceptActivityData() {
        Intent intent = getIntent();

        Bundle edit_bundle = intent.getExtras();
        Bundle bundle = intent.getExtras();
        Bundle bundle2 = getIntent().getExtras();
        Bundle bundle3 = getIntent().getExtras();
        Bundle bundle4 = getIntent().getExtras();
        Bundle bundle5 = getIntent().getExtras();
        Bundle bundle6 = getIntent().getExtras();
        Bundle bundle7 = getIntent().getExtras();
        Bundle bundle8 = getIntent().getExtras();
        Bundle bundle9 = getIntent().getExtras();

        byte[] b = bundle.getByteArray("pic");
        byte[] b2 = bundle2.getByteArray("pic2");
        byte[] b3 = bundle3.getByteArray("pic3");
        byte[] b4 = bundle4.getByteArray("pic4");
        byte[] b5 = bundle5.getByteArray("pic5");
        byte[] b6 = bundle6.getByteArray("pic6");
        byte[] b7 = bundle7.getByteArray("pic7");
        byte[] b8 = bundle8.getByteArray("pic8");
        byte[] b9 = bundle9.getByteArray("pic9");

        Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
        Bitmap bitmap2 = BitmapFactory.decodeByteArray(b2, 0, b2.length);
        Bitmap bitmap3 = BitmapFactory.decodeByteArray(b3, 0, b3.length);
        Bitmap bitmap4 = BitmapFactory.decodeByteArray(b4, 0, b4.length);
        Bitmap bitmap5 = BitmapFactory.decodeByteArray(b5, 0, b5.length);
        Bitmap bitmap6 = BitmapFactory.decodeByteArray(b6, 0, b6.length);
        Bitmap bitmap7 = BitmapFactory.decodeByteArray(b7, 0, b7.length);
        Bitmap bitmap8 = BitmapFactory.decodeByteArray(b8, 0, b8.length);
        Bitmap bitmap9 = BitmapFactory.decodeByteArray(b9, 0, b9.length);

        imageView_store_01.setImageBitmap(bitmap);
        imageView_store_02.setImageBitmap(bitmap2);
        imageView_store_03.setImageBitmap(bitmap3);
        imageView_store_04.setImageBitmap(bitmap4);
        imageView_store_05.setImageBitmap(bitmap5);
        imageView_store_06.setImageBitmap(bitmap6);
        imageView_store_07.setImageBitmap(bitmap7);
        imageView_store_08.setImageBitmap(bitmap8);
        imageView_store_09.setImageBitmap(bitmap9);

        String str = edit_bundle.getString("str");
        stoer_edit.setText(str);
    }

    /**
     * 初始化控件
     */
    private void initiaUI() {
        stoer_edit = (EditText) findViewById(R.id.store_editId);
        imageView_store_01 = (ImageView) findViewById(R.id.store_image_01);
        imageView_store_02 = (ImageView) findViewById(R.id.store_image_02);
        imageView_store_03 = (ImageView) findViewById(R.id.store_image_03);
        imageView_store_04 = (ImageView) findViewById(R.id.store_image_04);
        imageView_store_05 = (ImageView) findViewById(R.id.store_image_05);
        imageView_store_06 = (ImageView) findViewById(R.id.store_image_06);
        imageView_store_07 = (ImageView) findViewById(R.id.store_image_07);
        imageView_store_08 = (ImageView) findViewById(R.id.store_image_08);
        imageView_store_09 = (ImageView) findViewById(R.id.store_image_09);
        timeText = (TextView) findViewById(R.id.store_itme_text);

    }

//    private void GainTime() {
//
//        Timer timer;
//        timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                try {
//                    URL url = new URL("http://www.baidu.com");
//                    URLConnection connection = url.openConnection();
//                    connection.connect();
//                    long id = connection.getDate();
//                    Date date = new Date(id);
//                    SimpleDateFormat format = new SimpleDateFormat("网络时间" + "HH:mm:ss", Locale.CHINA);
//                    format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
//                    now = format.format(date);
//                    timeText.setText(now);
//                    Log.i("时间", date.getHours() + "时" + date.getMinutes() + "分"
//                            + date.getSeconds() + "秒" + "\n" + now);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//
//                }
//
//            }
//
//
//        }, 0, 1000);
//
//
//    }
    public void onClick(View v){
        startActivity(new Intent(this,StoreListView.class));
    }


}
