package com.agco.json.generate.entity;

import com.github.reinert.jjschema.Attributes;

public class SuperSessionDetail {

	@Attributes(maxLength = 1, required = false, description = "Is supersession broken?")
	private String brokenSupersession;

	@Attributes(minLength = 1, maxLength = 50, required = true, description = "Superseding item_id (the new item_id)")
	private String newPartNumber;

	@Attributes(maxLength = 1, required = false, description = "'C' for changeable 'I' for identical 'T' for test 'N' not reversibleblank")
	private String reversibilityCode;

	@Attributes(minimum = 0, exclusiveMinimum = true, multipleOf = 1, required = true, description = "Required quantity of superseding part ")
	private String newQuantity;

	@Attributes(minLength = 1, maxLength = 4, required = true, description = "Required for selective supersessions to indicate which records belong together")
	private String lineNumber;

	@Attributes(maxLength = 250, required = false, description = "Free text to provide guidelines, which part should be used in which machine for selective and informational supersessions")
	private String comment;

	@Attributes(minLength = 1, maxLength = 4, required = true, description = "Required for selective supersessions to indicate which records belong together")
	private String groupNumber;

	public String getBrokenSupersession() {
		return brokenSupersession;
	}

	public void setBrokenSupersession(String brokenSupersession) {
		this.brokenSupersession = brokenSupersession;
	}

	public String getNewPartNumber() {
		return newPartNumber;
	}

	public void setNewPartNumber(String newPartNumber) {
		this.newPartNumber = newPartNumber;
	}

	public String getReversibilityCode() {
		return reversibilityCode;
	}

	public void setReversibilityCode(String reversibilityCode) {
		this.reversibilityCode = reversibilityCode;
	}

	public String getNewQuantity() {
		return newQuantity;
	}

	public void setNewQuantity(String newQuantity) {
		this.newQuantity = newQuantity;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	@Override
	public String toString() {
		return "ClassPojo [brokenSupersession = " + brokenSupersession + ", newPartNumber = " + newPartNumber
				+ ", reversibilityCode = " + reversibilityCode + ", newQuantity = " + newQuantity + ", lineNumber = "
				+ lineNumber + ", comment = " + comment + ", groupNumber = " + groupNumber + "]";
	}
}
