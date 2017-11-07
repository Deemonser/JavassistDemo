package com.deemons.javassistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate");

        onClick();
    }

    private void onClick() {

//        OkBus.getInstance().onStickyEvent(EventTags.TEST, null);
    }



    public void test() {
        Log.d("MainActivity", "test");
    }
}
