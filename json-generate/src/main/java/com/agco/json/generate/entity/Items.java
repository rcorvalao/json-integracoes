package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class Items {
	
	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime = "2016-11-23T10:45:00+03:00";
	
	@Attributes(maxLength = 50, required = true, description = "Part Number.")
	private String partNumber = "1444437P";
	
	@Attributes(maxLength = 50, required = true, description = "Part description, only portuguese.")
	private String partDescription = "REPARO PLATO  C/ ALAVANCA 8 VELOCIDADES";
	

	@Attributes(maxLength = 100, required = false, description = "Highest level part grouping")
	private String group1 = "TRACTOR";
	
	@Attributes(maxLength = 100, required = false, description = "Second level part grouping")
	private String group2 = "COMBINE";

	@Attributes(maxLength = 100, required = false, description = "Not used")
	private String group3 = "";
		
	@Attributes(maxLength = 50, required = true, description = "Status of material")
	private String status = "";
	
	@Attributes(required = false, description = "Indicator wether part is stocked in central warehouse - not used for SA.  ")
	private Boolean stocked = false;
	
	@Attributes(maxLength = 3, required = false, description = "Base unit in which the product is measured, e.g. EA for each, mm for milimeters, etc. ")
	private String uomBase = "PC";
	@Attributes(required = false, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Weight including packaging (gross weight)")
	private BigDecimal weight = new BigDecimal("3.12345");
	
	@Attributes(format = "full-date", required = true, description = "Introduction date of part")
	private String introductionDate = "2016-11-23";
	@Attributes(format = "full-date", required = false, description = "Date of end of service of the part")
	private String endOfServiceDate = "2016-11-23";
	@Attributes(format = "full-date", required = false, description = "Date of end of production of the part")
	private String cutOutDate = "2016-11-23";
	
	@Attributes(required = true, minimum = 0, multipleOf=1, exclusiveMinimum = true
			, description = "Unit of pack; Minimum quantity. If = 0 or NULL, then set 1")
	private Integer multiples = 1;
	
	@Attributes(maxLength = 10, required = false, description = "Weight unit (e.g. Kg, lb)")
	private String weightUom = "KG";
	
	@Attributes(maxLength = 50, required = false, description = "Product marketing code (PMC)")
	private String attributeI01 = "";
	@Attributes(maxLength = 50, required = false, description = "Parts criticality (e.g. HIGH, MEDIUM, LOW)")
	private String attributeI02 = "";
	@Attributes(maxLength = 50, required = false, description = "Part criticality range")
	private String attributeI03 = "";
	@Attributes(maxLength = 50, required = false, description = "Product criticality")
	private String attributeI04 = "";
	@Attributes(maxLength = 50, required = false, description = "EMEA specific")
	private String attributeI05 = "";
	@Attributes(maxLength = 50, required = false, description = "EMEA specific")
	private String attributeI06 = "";
	@Attributes(maxLength = 50, required = false, description = "Wholegoods")
	private String attributeI07 = "";
	@Attributes(maxLength = 50, required = false, description = "Wholegoods")
	private String attributeI08 = "";
	@Attributes(maxLength = 50, required = false, description = "Wholegoods")
	private String attributeI09 = "";
	@Attributes(maxLength = 50, required = false, description = "WEAR (CMDR)")
	private String attributeI10 = "";
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
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public String getGroup1() {
		return group1;
	}
	public void setGroup1(String group1) {
		this.group1 = group1;
	}
	public String getGroup2() {
		return group2;
	}
	public void setGroup2(String group2) {
		this.group2 = group2;
	}
	public String getGroup3() {
		return group3;
	}
	public void setGroup3(String group3) {
		this.group3 = group3;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getStocked() {
		return stocked;
	}
	public void setStocked(Boolean stocked) {
		this.stocked = stocked;
	}
	public String getUomBase() {
		return uomBase;
	}
	public void setUomBase(String uomBase) {
		this.uomBase = uomBase;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public String getIntroductionDate() {
		return introductionDate;
	}
	public void setIntroductionDate(String introductionDate) {
		this.introductionDate = introductionDate;
	}
	public String getEndOfServiceDate() {
		return endOfServiceDate;
	}
	public void setEndOfServiceDate(String endOfServiceDate) {
		this.endOfServiceDate = endOfServiceDate;
	}
	public String getCutOutDate() {
		return cutOutDate;
	}
	public void setCutOutDate(String cutOutDate) {
		this.cutOutDate = cutOutDate;
	}
	public Integer getMultiples() {
		return multiples;
	}
	public void setMultiples(Integer multiples) {
		this.multiples = multiples;
	}
	public String getWeightUom() {
		return weightUom;
	}
	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}
	public String getAttributeI01() {
		return attributeI01;
	}
	public void setAttributeI01(String attributeI01) {
		this.attributeI01 = attributeI01;
	}
	public String getAttributeI02() {
		return attributeI02;
	}
	public void setAttributeI02(String attributeI02) {
		this.attributeI02 = attributeI02;
	}
	public String getAttributeI03() {
		return attributeI03;
	}
	public void setAttributeI03(String attributeI03) {
		this.attributeI03 = attributeI03;
	}
	public String getAttributeI04() {
		return attributeI04;
	}
	public void setAttributeI04(String attributeI04) {
		this.attributeI04 = attributeI04;
	}
	public String getAttributeI05() {
		return attributeI05;
	}
	public void setAttributeI05(String attributeI05) {
		this.attributeI05 = attributeI05;
	}
	public String getAttributeI06() {
		return attributeI06;
	}
	public void setAttributeI06(String attributeI06) {
		this.attributeI06 = attributeI06;
	}
	public String getAttributeI07() {
		return attributeI07;
	}
	public void setAttributeI07(String attributeI07) {
		this.attributeI07 = attributeI07;
	}
	public String getAttributeI08() {
		return attributeI08;
	}
	public void setAttributeI08(String attributeI08) {
		this.attributeI08 = attributeI08;
	}
	public String getAttributeI09() {
		return attributeI09;
	}
	public void setAttributeI09(String attributeI09) {
		this.attributeI09 = attributeI09;
	}
	public String getAttributeI10() {
		return attributeI10;
	}
	public void setAttributeI10(String attributeI10) {
		this.attributeI10 = attributeI10;
	}
	

	
}
