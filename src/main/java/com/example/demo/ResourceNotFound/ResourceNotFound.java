package com.example.demo.ResourceNotFound;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException 
{
	/*
	 * 
	 */
	private static final long serviceVersionUID=1L;
	private String resourceNmae;
	private String fieldName;
	private Object fieldvalue;
	public ResourceNotFound(String resourceNmae, String fieldName, Object fieldvalue) {
		super();
		this.resourceNmae = resourceNmae;
		this.fieldName = fieldName;
		this.fieldvalue = fieldvalue;
	}
	public String getResourceNmae() {
		return resourceNmae;
	}
	public void setResourceNmae(String resourceNmae) {
		this.resourceNmae = resourceNmae;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Object getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(Object fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	public static long getServiceversionuid() {
		return serviceVersionUID;
	}
	@Override
	public String toString() {
		return "ResourceNotFound [resourceNmae=" + resourceNmae + ", fieldName=" + fieldName + ", fieldvalue="
				+ fieldvalue + "]";
	}
}
