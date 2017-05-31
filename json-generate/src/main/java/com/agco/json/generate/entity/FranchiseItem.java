package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class FranchiseItem {

	@Attributes(minLength = 1, maxLength = 20, required = true, description = "Franchise for which the item is available")
	private String code = "VT";

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
}
