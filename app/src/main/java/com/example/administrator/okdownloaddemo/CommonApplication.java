package com.example.administrator.okdownloaddemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by hsu on 2017/6/11.
 */

public class CommonApplication extends Application {

    public static String urlString;
    private static CommonApplication instance;

    public CommonApplication() {
        instance = this;
    }

    public static Context getContext() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
