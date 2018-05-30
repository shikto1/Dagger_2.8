package com.walletmix.daggertwosecond;

import android.app.Application;

import com.walletmix.daggertwosecond.DI.AppComponent;
import com.walletmix.daggertwosecond.DI.ContextModule;
import com.walletmix.daggertwosecond.DI.DaggerAppComponent;
import com.walletmix.daggertwosecond.DI.NetworkModule;

/**
 * Created by Siddhartha on 30/05/2018.
 */

public class MyApplicaton extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().contextModule(new ContextModule(this)).build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
