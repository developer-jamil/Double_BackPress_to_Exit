package com.admin.doublebackpresstoexit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //double back press to exit
    private static final int BACK_PRESS_DELAY = 2000; // 2 seconds delay
    private long backPressTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //double back press to exit
    @Override
    public void onBackPressed() {
        if (backPressTime + BACK_PRESS_DELAY > System.currentTimeMillis()) {
            super.onBackPressed();
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressTime = System.currentTimeMillis();
    }

}