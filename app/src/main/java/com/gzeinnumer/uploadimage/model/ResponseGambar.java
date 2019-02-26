package com.gzeinnumer.uploadimage.model;

import java.util.List;

public class ResponseGambar{

	private List<ImagesItem> images;

	private boolean error;

	public void setImages(List<ImagesItem> images){
		this.images = images;
	}

	public List<ImagesItem> getImages(){
		return images;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}
}