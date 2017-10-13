package com.leshui.coolweather.util;

/**
 * Created by shichunlong on 17-10-13.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
