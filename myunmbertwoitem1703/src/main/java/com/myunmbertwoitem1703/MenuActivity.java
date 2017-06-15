package com.myunmbertwoitem1703;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {
    private ImageButton image_lan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        initialUI();
    }

    private void initialUI() {
        image_lan= (ImageButton) findViewById(R.id.image_OneTurn);
    }
    public void imageTurn(View view){
        startActivity(new Intent(this,OneTurnActivity.class));
    }
}
