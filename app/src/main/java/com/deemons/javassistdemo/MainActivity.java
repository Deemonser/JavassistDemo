package com.deemons.javassistdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.deemons.bus.OkBus;
import com.deemons.bus.annotation.Bus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate");

        onClick();
    }

    private void onClick() {


        OkBus.getInstance().onStickyEvent(EventTags.TEST);
    }

    @Bus(value = EventTags.TEST)
    public void test() {
        Log.d("MainActivity", "test");
    }
}
