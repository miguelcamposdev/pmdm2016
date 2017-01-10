package com.miguelcr.firebaseusuarios;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by miguelcampos on 20/7/16.
 */
public interface HostingerApiInterface {

        @POST("RegisterDevice.php")
        Call<RespuestaRegister> registerDevice(
                @Field("email") String email,
                @Field("token") String token
        );

}
