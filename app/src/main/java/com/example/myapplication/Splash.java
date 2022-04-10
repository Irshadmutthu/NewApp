package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

ImageView jan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initUI();
        Animation rotater= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        jan.startAnimation(rotater);
//        Thread obj =new Thread(){
//            @Override
//            public void run() {
//                try {
//                    sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Intent i=new Intent(Splash.this,Login.class);
//                startActivity(i);
//                finish();
//            }
//        };
////        obj.start();
//       handler=new Handler();
//       handler.postDelayed(new Runnable() {
//           @Override
//           public void run() {
//               Intent i= new Intent(getApplicationContext(),Login.class);
    //    startActivity(i);
//           }
//       },3000);
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(getApplicationContext(),Login.class);
                startActivity(i);
                finish();
            }
        },5000);


    }

    private void initUI() {
        jan=(ImageView) findViewById(R.id.janicon);

    }


}