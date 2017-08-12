package com.example.suryadwipayana.iaknewsapps.rest;

import com.example.suryadwipayana.iaknewsapps.model.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Surya Dwipayana on 8/12/2017.
 */

public interface ApiService {

    @GET("articles")
    Call<ApiResponse> getBbcNewsArticle(
            @Query("source") String source,
            @Query("sortBy") String sortby,
            @Query("apikey") String apikey
    );
}
