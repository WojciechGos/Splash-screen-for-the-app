package com.example.wojciech.splashscreengci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView imJBossComunity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imJBossComunity = findViewById(R.id.im_JbossCommunity);
        Animation myAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_transit);
        imJBossComunity.startAnimation(myAnimation);

        final Intent intent = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try {
                    sleep(3500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
