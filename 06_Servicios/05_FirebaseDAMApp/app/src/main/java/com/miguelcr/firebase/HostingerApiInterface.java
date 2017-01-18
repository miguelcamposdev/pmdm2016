package com.miguelcr.firebase;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by miguelcampos on 20/7/16.
 */
public interface HostingerApiInterface {

        @FormUrlEncoded
        @POST("RegisterDevice.php")
        Call<ResponseRegister> registerDevice(
                @Field("email") String email,
                @Field("token") String token
        );

}
