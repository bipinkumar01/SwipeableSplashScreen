package com.bipin.swipesplashscreenexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bipin on 5/6/2016.
 */
@SuppressWarnings("ALL")
public class MainActivity  extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

    }
}
