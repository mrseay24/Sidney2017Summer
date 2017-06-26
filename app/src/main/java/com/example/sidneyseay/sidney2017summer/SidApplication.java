package com.example.sidneyseay.sidney2017summer;

import android.app.Application;

import com.example.sidneyseay.sidney2017summer.util.UtilLog;

/**
 * Created by sidneyseay on 6/21/17.
 */

public class SidApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
