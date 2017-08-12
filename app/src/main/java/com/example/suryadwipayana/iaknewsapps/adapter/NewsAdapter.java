package com.example.suryadwipayana.iaknewsapps.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.suryadwipayana.iaknewsapps.R;
import com.example.suryadwipayana.iaknewsapps.model.ArticlesItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Surya Dwipayana on 8/6/2017.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    List<ArticlesItem> mNewsList;

    public NewsAdapter(List<ArticlesItem> mNewsList) {
        this.mNewsList = mNewsList;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_news, parent, false);
        NewsViewHolder viewHolder = new NewsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        ArticlesItem news = mNewsList.get(position);
        holder.bind(news);
    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.ivNewsPhoto) ImageView ivNewsPhoto;
        @BindView(R.id.tvNewsTitle) TextView tvNewsTitle;
        @BindView(R.id.tvNewsSubtitle) TextView tvNewsSubtitle;

        public NewsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(ArticlesItem newsItem) {
            tvNewsTitle.setText(newsItem.getTitle());
            tvNewsSubtitle.setText(newsItem.getDescription());

            Glide.with(ivNewsPhoto.getContext())
                    .load(newsItem.getUrlToImage())
                    .into(ivNewsPhoto);
        }
    }
}
