package com.example.suryadwipayana.iaknewsapps.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Surya Dwipayana on 8/12/2017.
 */

public class ApiClient {

    private static final String BASE_URL = "https://newsapi.org/v1/";
    private static Retrofit mRetrofit;

    public static Retrofit getRetrofitClient(){
        if (mRetrofit == null){
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return mRetrofit;
    }

}
