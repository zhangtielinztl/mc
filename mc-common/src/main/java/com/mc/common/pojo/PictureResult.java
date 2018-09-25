package com.mc.common.pojo;

import java.io.Serializable;

public class PictureResult implements Serializable{
	@Override
	public String toString() {
		return "PictureResult [error=" + error + ", url=" + url + ", message=" + message + "]";
	}
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
	private int error;
	private String url;
	private String message;
}
