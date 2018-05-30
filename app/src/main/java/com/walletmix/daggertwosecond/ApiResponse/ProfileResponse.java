package com.walletmix.daggertwosecond.ApiResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Siddhartha on 30/05/2018.
 */

public class ProfileResponse {

    @SerializedName("userId")
    @Expose
    Integer userId;

    @SerializedName("id")
    @Expose
    Integer id;

    @SerializedName("title")
    @Expose
    String title;
}
