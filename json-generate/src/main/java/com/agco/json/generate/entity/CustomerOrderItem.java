package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class CustomerOrderItem {

	@Attributes(maxLength = 10, required = true, description = "Unique line number of end customer order line.")
	private String orderLineNumber = "";
	@Attributes(maxLength = 50, required = true, description = "AGCO Part number. Only if the part number sold is a non-original type. The DMS should find the Original matching AGCO PN, when applicable.")
	private String agcoPartNumber = "1480626M1";

	@Attributes(format = "full-date", required = false, description = "Date for which delivery has been requested, if available.")
	private String requestedDate = "2016-11-23";
	@Attributes(format = "full-date", required = false, description = "Date of actual demand, e.g. when machine broke down (rationale: in our planning we try to get as close as possible to the real demand of the customer) - line level data")
	private String demandDate = "2016-11-23";
	@Attributes(format = "full-date", required = false, description = "Date the order (line) was actually delivered to end customer (i.e. farmer). If lineStatus = closed then this field is required")
	private String shippedDate = "2016-11-23";

	@Attributes(maxLength = 3, required = true, description = "Unit of measure")
	private String unitOfMeasure = "M";

	@Attributes(required = true, minimum = 0, multipleOf=1, exclusiveMinimum = true
			, description = "Unit of measure for material  as related to quantities below. A value of 1 indicates that the part is sold in manufacturer units and a value greater than 1 indicates the number of whole retail units the dealer creates from a manufacturer unit. Number of pieces currently available for sale, in dealer retail units. - Exclude from this number pieces that are reserved for work orders and not yet counted as a sale. - Exclude from this number pieces that are reserved for parts tickets and not yet counted as a sale. - Exclude from this number pending outbound internal transfers")
	private BigDecimal dealerPartsPerPackage = new BigDecimal("1.5");
	@Attributes(required = true, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Requested quantity of material.")
	private BigDecimal requestedQuantity = new BigDecimal("1.5");

	@Attributes(required = false, minimum = 0, multipleOf=1, exclusiveMinimum = true
			, description = "Quantity actually shipped. If lineStatus = closed then this field is required")
	private Integer shippedQuantity = 15;

	@Attributes(maxLength = 20, required = true, description = "Indicator if order line is open or completed, optionally also cancelled or partly completed.")
	private String lineStatus = "OPEN";
	@Attributes(maxLength = 30, required = false, description = "Serial number of the machine for which the part is used (e.g. available in machine repair data) - used to improve planning for new product introductions / end of life planning.")
	private String serialNumber = "";
	
	
	
	public String getOrderLineNumber() {
		return orderLineNumber;
	}
	public void setOrderLineNumber(String orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}
	public String getAgcoPartNumber() {
		return agcoPartNumber;
	}
	public void setAgcoPartNumber(String agcoPartNumber) {
		this.agcoPartNumber = agcoPartNumber;
	}
	public String getRequestedDate() {
		return requestedDate;
	}
	public void setRequestedDate(String requestedDate) {
		this.requestedDate = requestedDate;
	}
	public String getDemandDate() {
		return demandDate;
	}
	public void setDemandDate(String demandDate) {
		this.demandDate = demandDate;
	}
	public String getShippedDate() {
		return shippedDate;
	}
	public void setShippedDate(String shippedDate) {
		this.shippedDate = shippedDate;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public BigDecimal getDealerPartsPerPackage() {
		return dealerPartsPerPackage;
	}
	public void setDealerPartsPerPackage(BigDecimal dealerPartsPerPackage) {
		this.dealerPartsPerPackage = dealerPartsPerPackage;
	}
	
	public String getLineStatus() {
		return lineStatus;
	}
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public BigDecimal getRequestedQuantity() {
		return requestedQuantity;
	}
	public void setRequestedQuantity(BigDecimal requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}
	
	public Integer getShippedQuantity() {
		return shippedQuantity;
	}
	public void setShippedQuantity(Integer shippedQuantity) {
		this.shippedQuantity = shippedQuantity;
	}

}
