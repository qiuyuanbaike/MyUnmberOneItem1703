package com.example.mytestclass;

import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Locale;

public class TestTime extends AppCompatActivity {
    Handler handler;
    private TextView time_texts;
    String nowTime="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_time);
        GainTime();


        time_texts = (TextView) findViewById(R.id.text_time);


    }
    //获取网络时间
    private void GainTime() {
        new Thread(new Runnable() {
            @Override
            public void run() {
             try {
                 URL url=new URL("http://www.baidu.com");
                 URLConnection uc=url.openConnection();
                 uc.connect();
                 long id=uc.getDate();
                Date date=new Date(id);
                 SimpleDateFormat formats=new SimpleDateFormat("网络时间："+"HH：mm：ss", Locale.CHINA);
                 formats.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                nowTime = formats.format(date);
                 Log.i("时间", date.getHours()+ "时" + date.getMinutes() + "分"
                         + date.getSeconds() + "秒" + "\n" + nowTime);

              }catch (Exception e){
                 e.printStackTrace();
             }
                handler.sendEmptyMessage(0);
            }

        }).start();

        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);

                time_texts.setText(nowTime);
                if (nowTime==null||nowTime.equals("")){
                    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                    time_texts.setText(sdf.format(new Date()) + "(" + "系统时间" + ")");
                }
            }

        };


    }
    public void onClick(View view){
        GainTime();
    }



}
