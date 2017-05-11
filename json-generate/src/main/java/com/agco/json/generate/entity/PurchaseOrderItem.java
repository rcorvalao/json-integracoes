package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class PurchaseOrderItem {
	
	@Attributes(maxLength = 10, required = true, description = "Unique line number.")
	private String orderLineNumber = "1";
	@Attributes(maxLength = 50, required = true, description = "AGCO Part number. Only if the part number sold is a non-original type. The DMS should find the Original matching AGCO PN, when applicable.")
    private String agcoPartNumber = "1480626M1";
	@Attributes(maxLength = 12, required = false, description = "source location.")
	private String sourceLocation = "";
	@Attributes(format = "full-date", required = false, description = "Date the order (line) was actually delivered to the dealer. If lineStatus = closed then this field is required.")
    private String receivedDate = "2016-11-23";
	@Attributes(maxLength = 3, required = true, description = "Unit of measure. TBD - list or ISO?")
    private String unitOfMeasure = "M";
	@Attributes(required = true, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Requested quantity of material.")
    private BigDecimal requestedQuantity = new BigDecimal(1.5);
	@Attributes(required = false, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "item quantity actually received at the dealer location. If lineStatus = closed then this field is required.")
    private BigDecimal receivedQuantity = new BigDecimal(1.5);
    @Attributes(maxLength = 20, required = true, description = "Indicator if order line is open or completed, optionally also cancelled.")
    private String lineStatus = "OPEN";
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
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getReceivedDate() {
		return receivedDate;
	}
	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public BigDecimal getRequestedQuantity() {
		return requestedQuantity;
	}
	public void setRequestedQuantity(BigDecimal requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}
	public BigDecimal getReceivedQuantity() {
		return receivedQuantity;
	}
	public void setReceivedQuantity(BigDecimal receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}
	public String getLineStatus() {
		return lineStatus;
	}
	public void setLineStatus(String lineStatus) {
		this.lineStatus = lineStatus;
	}
    

}
