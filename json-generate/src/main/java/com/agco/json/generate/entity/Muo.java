package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class Muo {

	@Attributes(minLength = 1, maxLength = 6, required = true, description = "Machine Series Number (MSN)")
	private String modelId;

	@Attributes(format = "full-date", required = false, description = "Start date")
	private String startDate;

	@Attributes(minLength = 1, maxLength = 1, required = true, description = "Type of change")
	private String changeType;

	@Attributes(format = "full-date", required = false, description = "End date")
	private String endDate;

	@Attributes(format = "full-date", required = true, description = "Local AGCO date when the extract was run")
	private String extractionDateTime;

	@Attributes(minLength = 1, maxLength = 50, required = true, description = "Part number")
	private String partNumber;

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

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

	@Override
	public String toString() {
		return "ClassPojo [modelId = " + modelId + ", startDate = " + startDate + ", changeType = " + changeType
				+ ", endDate = " + endDate + ", extractionDateTime = " + extractionDateTime + ", partNumber = "
				+ partNumber + "]";
	}
}
