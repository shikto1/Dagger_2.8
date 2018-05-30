package com.walletmix.daggertwosecond.DI;

import com.walletmix.daggertwosecond.MainActivity;
import com.walletmix.daggertwosecond.MyApplicaton;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SHIHIR on 30/05/2018.
 */

@Singleton
@Component(modules = {NetworkModule.class, DatabaseModule.class})
public interface AppComponent {

    void inject(MyApplicaton myApplicaton);

    void inject(MainActivity mainActivity);
}
