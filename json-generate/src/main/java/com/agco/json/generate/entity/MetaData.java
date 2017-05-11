package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class MetaData {
	
	@Attributes(maxLength = 40, required = true, description = "Message ID")
	private String messageId;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	

}
