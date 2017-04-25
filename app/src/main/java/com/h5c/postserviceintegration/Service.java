package com.h5c.postserviceintegration;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * @author Harsh on 31-03-2017.
 */

public interface Service {
    @POST(JsonConstants.LOGIN_URL)
    @Headers({"Content-Type: application/json"})
    Call<ResponseModel> loginService(@Body MOdel param1);
}
