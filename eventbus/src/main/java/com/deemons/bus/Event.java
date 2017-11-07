package com.deemons.bus;

import android.os.Message;


public interface Event {
    void call(Message msg);
}
