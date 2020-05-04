package com.freespace.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {
    private int _SPLASH_TIME=1500;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        runSplashScren();
    }

    private void runSplashScren() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                moveToNextPage();

            }
        },_SPLASH_TIME);
    }

    private void moveToNextPage() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
