package com.coretex.commerce.core.dto;

public class ContentFile {


	private String fileName;
	private String mimeType;

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}


}
