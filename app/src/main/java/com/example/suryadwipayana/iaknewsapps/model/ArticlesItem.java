package com.example.suryadwipayana.iaknewsapps.model;

import com.google.gson.annotations.SerializedName;



public class ArticlesItem{

	@SerializedName("publishedAt")
	private String publishedAt;

	@SerializedName("author")
	private String author;

	@SerializedName("urlToImage")
	private String urlToImage;

	@SerializedName("description")
	private String description;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@Override
 	public String toString(){
		return 
			"ArticlesItem{" + 
			"publishedAt = '" + publishedAt + '\'' + 
			",author = '" + author + '\'' + 
			",urlToImage = '" + urlToImage + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}

	public ArticlesItem() {
	}

	public ArticlesItem(String publishedAt, String author, String urlToImage, String description, String title, String url) {
		this.publishedAt = publishedAt;
		this.author = author;
		this.urlToImage = urlToImage;
		this.description = description;
		this.title = title;
		this.url = url;
	}

	public String getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(String publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getUrlToImage() {
		return urlToImage;
	}

	public void setUrlToImage(String urlToImage) {
		this.urlToImage = urlToImage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}