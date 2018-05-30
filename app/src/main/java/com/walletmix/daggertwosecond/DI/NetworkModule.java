package com.walletmix.daggertwosecond.DI;


import com.walletmix.daggertwosecond.All_APIs;
import com.walletmix.daggertwosecond.ApiService.UserProfileApiService;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class NetworkModule {

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
       return new Retrofit.Builder()
                .baseUrl(All_APIs.BASE_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    UserProfileApiService provideUserProfileAPIService(Retrofit retrofit){
        return retrofit.create(UserProfileApiService.class);
    }
}
