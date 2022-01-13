package com.app.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {
    @POST("users")
    Call<DataModal> createPost(@Body DataModal modal);

}
