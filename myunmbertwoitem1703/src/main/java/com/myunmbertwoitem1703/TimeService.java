package com.myunmbertwoitem1703;

import android.app.Service;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.TimeZone;
import android.os.IBinder;
import android.util.Log;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class TimeService extends Service {
    private Timer timer=null;
    String now="";

    public TimeService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("时间服务：","启动 ");
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    URL url=new URL("http://www.baidu.com");
                    URLConnection connection=url.openConnection();
                    connection.connect();
                    long id=connection.getDate();
                    Date date=new Date(id);
                    SimpleDateFormat format=new SimpleDateFormat("网络时间"+"HH:mm:ss", Locale.CHINA);
                    format.setTimeZone(TimeZone.getTimeZone("GMT+8"));
                    now=format.format(date);
                    Log.i("时间", date.getHours()+ "时" + date.getMinutes() + "分"
                            + date.getSeconds() + "秒" + "\n" + now);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        },0,1000);

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
