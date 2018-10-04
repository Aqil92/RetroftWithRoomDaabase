package com.sevenrocks.retroftwithroomdaabase.Database;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;


public class AppControler extends Application {

    private static AppDatabase appDatabase;


    @Override
    public void onCreate() {
        super.onCreate();
        appDatabase= AppDatabase.getInstance(this);
    }

    public static AppDatabase getDB()
    {
        return appDatabase;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


   
}
