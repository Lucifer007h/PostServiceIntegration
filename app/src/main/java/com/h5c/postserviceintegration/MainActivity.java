package com.h5c.postserviceintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.github.aurae.retrofit2.LoganSquareConverterFactory;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity==>";
    Service loginService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(3600, TimeUnit.SECONDS)
                .readTimeout(3600,TimeUnit.SECONDS).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(JsonConstants.BASE_URL).client(client)         /*.baseUrl(JsonConstants.BASE_URL)*/
                .addConverterFactory(LoganSquareConverterFactory.create())
                .build();
        loginService = retrofit.create(Service.class);
        MOdel model = new MOdel();
        model.setUserName("testdoctor");
        model.setPassword("testdoctor");
        Call<ResponseModel> call = loginService.loginService(model);
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                Log.d(TAG,"inside Response");
                if(response.isSuccess()){
                    Toast.makeText(MainActivity.this,response.body().getHttpHeaders().getMessage(),Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                Log.d(TAG,"inside onFailure");
                Log.d(TAG,"inside onFailure"+t.toString());
            }
        });
    }
}
