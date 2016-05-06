package com.bipin.swipesplashscreenexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

@SuppressWarnings("ALL")
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        //thread for splash screen running
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    Log.d("Exception", "Exception" + e);
                } finally {
                    startActivity(
                            new Intent(SplashScreenActivity.this,
                                    WelcomeScreenActivity.class));
                }
                finish();
            }
        };
        logoTimer.start();
    }
}