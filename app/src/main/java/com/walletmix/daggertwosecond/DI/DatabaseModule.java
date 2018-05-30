package com.walletmix.daggertwosecond.DI;
import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;


@Module(includes = ContextModule.class)
public class DatabaseModule {

    @Provides
    @Singleton
    SharedPreferences provideSharedPreference(Context context) {
        return context.getSharedPreferences("MY_PREF_ONE", Context.MODE_PRIVATE);
    }
}
