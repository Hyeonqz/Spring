package com.spring.json;

public class PhotoDto {
	private String name;
	private String photo;
	
	public PhotoDto(String name, String photo) {
		super(); //생략되어 있음.
		this.name = name;
		this.photo = photo;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
}
