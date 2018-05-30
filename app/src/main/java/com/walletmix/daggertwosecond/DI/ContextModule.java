package com.walletmix.daggertwosecond.DI;

import android.content.Context;

import com.walletmix.daggertwosecond.MyApplicaton;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shishir on 30/05/2018.
 */

@Module
public class ContextModule {
    private final MyApplicaton applicaton;

    public ContextModule(MyApplicaton applicaton){
        this.applicaton = applicaton;
    }

    @Provides
    @Singleton
    Context providesContext(){
        return applicaton;
    }
}
