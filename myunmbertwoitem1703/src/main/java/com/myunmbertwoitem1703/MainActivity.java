package com.myunmbertwoitem1703;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAlpha();





    }

    private void setAlpha() {
        imageView = (ImageView) findViewById(R.id.Two_image);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0,1);
        ScaleAnimation scaleAnimation=new ScaleAnimation(0.5f,1,.05f,1,
                Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        AnimationSet sets=new AnimationSet(true);
        imageView.setAnimation(sets);
        sets.addAnimation(alphaAnimation);
        sets.addAnimation(scaleAnimation);
        sets.setDuration(3000);
        sets.start();
        sets.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(MainActivity.this,MenuActivity.class));
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

}
