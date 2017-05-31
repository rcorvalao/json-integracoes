package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class Error {

	@Attributes(maxLength = 5, required = true, description = "Interface ID")
	private String interfaceId = "BKW01";
	
	@Attributes(maxLength = 255, required = true, description = "Error message")
	private String errorMessage = "TBD";
	
	@Attributes(maxLength = 5, required = true, description = "Error code")
	private String errorCode = "TBD";

	public String getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(String interfaceId) {
		this.interfaceId = interfaceId;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}	
	
}
