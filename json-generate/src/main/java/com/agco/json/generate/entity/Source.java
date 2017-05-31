package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class Source {

	@Attributes(maxLength = 255, required = false, description = "Path to a specific JSON field that is invalid or the cause of an error")
	private String pointer = "/data/order/customerLegalNumber";

	@Attributes(maxLength = 255, required = false, description = "The value of the field mentioned on the pointer")
	private String value = "92197540000206";

	public String getPointer() {
		return pointer;
	}

	public void setPointer(String pointer) {
		this.pointer = pointer;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
