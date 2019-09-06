package com.example.byteandbits;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.byteandbits.activites.HomeScreen;

public class flashscreen extends AppCompatActivity {
 ImageView ImgLogo;
    Thread splashTread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImgLogo=(ImageView)findViewById(R.id.ImgSplashLogo);

        ImageView image = (ImageView)findViewById(R.id.ImgSplashLogo);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alfa);
        image.startAnimation(animation1);

        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(flashscreen.this,
                            HomeScreen.class);
                    startActivity(intent);
                    flashscreen.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    flashscreen.this.finish();
                }

            }
        };
        splashTread.start();
    }

    }

