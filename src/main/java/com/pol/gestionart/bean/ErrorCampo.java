package com.pol.gestionart.bean;

public class ErrorCampo {
	private String objectName;
	private String field;
	private Object rejectedValue;
	private String defaultMessage;

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Object getRejectedValue() {
		return rejectedValue;
	}

	public void setRejectedValue(Object rejectedValue) {
		this.rejectedValue = rejectedValue;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}

	@Override
	public String toString() {
		return "ErrorCampo [objectName=" + objectName + ", field=" + field + ", rejectedValue=" + rejectedValue
				+ ", defaultMessage=" + defaultMessage + "]";
	}

}
