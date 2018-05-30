package com.walletmix.daggertwosecond.ApiService;

import com.walletmix.daggertwosecond.All_APIs;
import com.walletmix.daggertwosecond.ApiResponse.ProfileResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Siddhartha on 30/05/2018.
 */

public interface UserProfileApiService {
    @GET(All_APIs.JSON_PLACEHOLDER_URL)
    Call<List<ProfileResponse>> getUser();
}
