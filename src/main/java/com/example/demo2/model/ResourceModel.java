package com.example.demo2.model;

import javax.validation.constraints.Size;

public class ResourceModel {

	@Size(min=3, max=10, message="Name should be min 3 and max 10")
	private String resName;
	@Size(min=3, max=10, message="Id should be min 3 and max 10")
	private String resId;
	
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getResId() {
		return resId;
	}
	public void setResId(String resId) {
		this.resId = resId;
	}
	@Override
	public String toString() {
		return "ResourceModel [resName=" + resName + ", resId=" + resId + "]";
	}
	
}
