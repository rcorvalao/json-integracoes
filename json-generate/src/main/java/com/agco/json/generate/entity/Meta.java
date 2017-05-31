package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class Meta {

	@Attributes(maxLength = 3, required = true, description = "A value defining the type of response")
	private String status = "400";
	
	@Attributes(maxLength = 40, required = true, description = "AGCO tracking ID for the original message")
	private String originalMessageId = "VMI-7ad558ad-0548-4bb7-a17b-e7bfbc4d3f49";
	
	@Attributes(maxLength = 40, required = true, description = "A unique key for this specific message")
	private String trackingId = "VMI-7ad558ad-0548-4bb7-a17b-e7bfbc45278f";
}
