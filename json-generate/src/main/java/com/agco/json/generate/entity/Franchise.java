package com.agco.json.generate.entity;

import java.util.List;

import com.github.reinert.jjschema.Attributes;

public class Franchise {

	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime = "2016-11-23T10:45:00+03:00";

	@Attributes(minLength = 1, maxLength = 50, required = true, description = "Part number")
	private String partNumber = "CH1J4757";

	private List<FranchiseItem> franchises;

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

	public List<FranchiseItem> getFranchises() {
		return franchises;
	}

	public void setFranchises(List<FranchiseItem> franchises) {
		this.franchises = franchises;
	}
}
