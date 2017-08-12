package com.example.suryadwipayana.iaknewsapps.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.suryadwipayana.iaknewsapps.BuildConfig;
import com.example.suryadwipayana.iaknewsapps.R;
import com.example.suryadwipayana.iaknewsapps.adapter.NewsAdapter;
import com.example.suryadwipayana.iaknewsapps.model.ApiResponse;
import com.example.suryadwipayana.iaknewsapps.model.ArticlesItem;
import com.example.suryadwipayana.iaknewsapps.rest.ApiClient;
import com.example.suryadwipayana.iaknewsapps.rest.ApiService;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private LinearLayoutManager mLayoutManager;
    private NewsAdapter mAdapter;

    private static final String NEWS_SOURCE = "bbc-news";
    private static final String SORT_BY = "top";

    @BindView(R.id.recylerview1) RecyclerView mRecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLayoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

        mAdapter = new NewsAdapter(getDummyData());

        mRecyclerview.setLayoutManager(mLayoutManager);
        mRecyclerview.setAdapter(mAdapter);
    }

    private List<ArticlesItem> getDummyData(){
        List<ArticlesItem> dummyList = new ArrayList<>();
        for(int i=0; i < 10; i++){
            ArticlesItem dummyNews = new ArticlesItem();
            dummyNews.setTitle(String.valueOf(i) + "Newsnews newsnews newsnews Newsnews newsnews newsnews Newsnews newsnews newsnews Newsnews");
            dummyNews.setDescription(getString(R.string.dummy_des_news));
            dummyNews.setUrlToImage("https://tctechcrunch2011.files.wordpress.com/2017/08/aug_chart_1.png?w=764&h=400&crop=");
            dummyList.add(dummyNews);
        }

        return dummyList;
    }

    private void getData(){
        ApiService apiService = ApiClient.getRetrofitClient().create(ApiService.class);
        Call<ApiResponse> apiResponseCall = apiService.getBbcNewsArticle(
                NEWS_SOURCE,
                SORT_BY,
                BuildConfig.API_KEY
        );

        apiResponseCall.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {

            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {

            }
        });
    }
}
