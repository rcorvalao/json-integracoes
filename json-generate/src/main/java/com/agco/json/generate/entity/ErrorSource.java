package com.agco.json.generate.entity;

import java.util.List;

import com.github.reinert.jjschema.Attributes;

public class ErrorSource {

	private List<Source> source;

	@Attributes(maxLength = 255, required = true, description = "Detailed error message")
	private String detail = "Item #0: customerLegalNumber is invalid";

	@Attributes(maxLength = 10, required = false, description = "A sequence of letter and/or numbers that help identify any errors that occurred")
	private String errorCode = "VMI-002";

	public List<Source> getSource() {
		return source;
	}

	public void setSource(List<Source> source) {
		this.source = source;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
}
