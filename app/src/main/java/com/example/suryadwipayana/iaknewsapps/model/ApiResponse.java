package com.example.suryadwipayana.iaknewsapps.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class ApiResponse{

	@SerializedName("sortBy")
	private String sortBy;

	@SerializedName("source")
	private String source;

	@SerializedName("articles")
	private List<ArticlesItem> articles;

	@SerializedName("status")
	private String status;

	@Override
 	public String toString(){
		return 
			"ApiResponse{" + 
			"sortBy = '" + sortBy + '\'' + 
			",source = '" + source + '\'' + 
			",articles = '" + articles + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}

	public ApiResponse() {
	}

	public ApiResponse(String sortBy, String source, List<ArticlesItem> articles, String status) {
		this.sortBy = sortBy;
		this.source = source;
		this.articles = articles;
		this.status = status;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<ArticlesItem> getArticles() {
		return articles;
	}

	public void setArticles(List<ArticlesItem> articles) {
		this.articles = articles;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}