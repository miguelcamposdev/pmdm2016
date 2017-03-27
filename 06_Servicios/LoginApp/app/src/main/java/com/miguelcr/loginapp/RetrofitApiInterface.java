package com.miguelcr.loginapp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by miguelcampos on 27/3/17.
 */

public interface RetrofitApiInterface {

    @FormUrlEncoded
    @POST("students/login")
    Call<LoginResponse> doLogin(@Field("e") String u,
                                @Field("p") String p);
}
