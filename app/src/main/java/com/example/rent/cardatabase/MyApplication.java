package com.example.rent.cardatabase;

import android.app.Application;

import com.facebook.stetho.*;

/**
 * Created by RENT on 2017-03-25.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        boolean isInDebug = com.facebook.stetho.BuildConfig.DEBUG;
        Stetho.initializeWithDefaults(this);
    }
}
