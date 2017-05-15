package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class MetaData {
	
	@Attributes(minLength = 1, maxLength = 40, required = true, description = "Message ID")
	private String messageId;
	
	public MetaData() {
		this.setMessageId("VMI-44c79654-0ae8-427c-98a9-7de91d65c903");
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	
	

}
