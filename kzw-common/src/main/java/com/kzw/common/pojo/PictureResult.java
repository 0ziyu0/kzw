package com.kzw.common.pojo;

public class PictureResult {

	private int error;
	private String url;
	private String message;
	
	public int getError() {
		return error;
	}
	public void setError(int error) {
		this.error = error;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public PictureResult() {
	}
	public PictureResult(int error, String url, String message) {
		super();
		this.error = error;
		this.url = url;
		this.message = message;
	}
	
	
}
