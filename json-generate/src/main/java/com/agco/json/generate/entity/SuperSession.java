package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class SuperSession {

	@Attributes(format = "full-date", required = false, description = "Start date")
	private String startDate;

	@Attributes(required = true)
	private SuperSessionDetail detail;

	@Attributes(maxLength = 2, required = true, description = "Supersession Code, possible values are 'SI' for simple, 'CO' for compound, 'SS' for simple selective, 'CS' for compound selective, 'SP' for simple partial, 'IN' for informative")
	private String supersessionType;

	@Attributes(required = true, minimum = 0, multipleOf = 1, exclusiveMinimum = true, description = "Required quantity of superseded part ")
	private BigDecimal oldQuantity;

	@Attributes(maxLength = 100, required = true, description = "Id of supersession")
	private String supersessionId;

	@Attributes(maxLength = 50, required = true, description = "Superseded item_id (the old item_id)")
	private String oldPartNumber;

	@Attributes(format = "full-date", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime;

	public SuperSession() {
		this.setExtractionDateTime("2016-11-23T10:45:00+03:00");
		this.setOldPartNumber("123456");
		this.setOldQuantity(new BigDecimal(9.5));
		this.setStartDate("2016-11-23");
		this.setSuperSessionDetail(new SuperSessionDetail());
		this.setSupersessionId("123456");
		this.setSupersessionType("SI");
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public SuperSessionDetail getSuperSessionDetail() {
		return detail;
	}

	public void setSuperSessionDetail(SuperSessionDetail detail) {
		this.detail = detail;
	}

	public String getSupersessionType() {
		return supersessionType;
	}

	public void setSupersessionType(String supersessionType) {
		this.supersessionType = supersessionType;
	}

	public BigDecimal getOldQuantity() {
		return oldQuantity;
	}

	public void setOldQuantity(BigDecimal oldQuantity) {
		this.oldQuantity = oldQuantity;
	}

	public String getSupersessionId() {
		return supersessionId;
	}

	public void setSupersessionId(String supersessionId) {
		this.supersessionId = supersessionId;
	}

	public String getOldPartNumber() {
		return oldPartNumber;
	}

	public void setOldPartNumber(String oldPartNumber) {
		this.oldPartNumber = oldPartNumber;
	}

	public String getExtractionDateTime() {
		return extractionDateTime;
	}

	public void setExtractionDateTime(String extractionDateTime) {
		this.extractionDateTime = extractionDateTime;
	}

	@Override
	public String toString() {
		return "ClassPojo [startDate = " + startDate + ", detail = " + detail + ", supersessionType = "
				+ supersessionType + ", oldQuantity = " + oldQuantity + ", supersessionId = " + supersessionId
				+ ", oldPartNumber = " + oldPartNumber + ", extractionDateTime = " + extractionDateTime + "]";
	}
}
