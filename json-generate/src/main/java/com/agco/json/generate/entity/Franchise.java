package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class Franchise {

	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime;

	@Attributes(minLength = 1, maxLength = 50, required = true, description = "Part number")
	private String partNumber;

	public String getExtractionDateTime() {
		return extractionDateTime;
	}

	public void setExtractionDateTime(String extractionDateTime) {
		this.extractionDateTime = extractionDateTime;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

}
