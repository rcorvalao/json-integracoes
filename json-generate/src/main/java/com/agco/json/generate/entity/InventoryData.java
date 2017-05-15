package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class InventoryData {
	
	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime = "2016-11-23T10:45:00+03:00";
	
	@Attributes(maxLength = 8, required = true, description = "Dealer’s location account number. The number sent will be the AGCO code")
	private String dealerNumber = "1654549";

	@Attributes(maxLength = 50, required = true, description = "AGCO South America Part number.")
	private String agcoPartNumber = "1480626M1";
	
	@Attributes(maxLength = 50, required = true, description = "Part Number sold by dealer. Original code from vendor.")
	private String partNumber = "1444437P";
	
	@Attributes(maxLength = 60, required = true, description = "Dealer part number description.")
	private String description = "1444437P";
	
	@Attributes(required = false, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Include the average cost, as calculated by the DMS, for one piece of the part only if the DMS tracks average cost for this dealer, else provide no average cost value.")
	private BigDecimal averageCost = new BigDecimal("200");
	@Attributes(required = false, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Last purchase net price paid.")
	private BigDecimal lastPurchasePrice = new BigDecimal("200.00");
	@Attributes(required = false, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "For Non-Original Parts: Supplier List Price as provided to dealer. For Original Parts: AGCO List Price as provided to dealer.")
	private BigDecimal netPrice = new BigDecimal("200");

	@Attributes(format = "date-time", required = true, description = "Local dealer date when the inventory was updated")
	private String inventoryDateTime = "2016-11-23T10:45:00+03:00";
	
	@Attributes(maxLength = 3, required = true, description = "Unit of measure.")
	private String unitOfMeasure = "M";
	
	
	@Attributes(required = true, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Unit of measure for material  as related to quantities below. A value of 1 indicates that the part is sold in manufacturer units and a value greater than 1 indicates the number of whole retail units the dealer creates from a manufacturer unit..")
	private BigDecimal dealerPartsPerPackage = new BigDecimal("1.5");
	@Attributes(required = true, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Number of pieces currently available for sale, in dealer retail units: - Exclude from this number pieces that are reserved for work orders and not yet counted as a sale; - Exclude from this number pieces that are reserved for parts tickets and not yet counted as a sale; - Exclude from this number pending outbound internal transfers")
	private BigDecimal availableQuantity = new BigDecimal("1.5");
	@Attributes(required = true, minimum = 0, multipleOf=1, exclusiveMinimum = true, description = "Send the actual value in dealer retail units if the DBS tracks the pieces reserved for parts tickets and it is not yet counted as a sale, else send only the tab to retain the proper field positioning in the record.")
	private BigDecimal reservedQuantityPartTickets = new BigDecimal("1.5");

	
	@Attributes(required = true, description = "DMS code which identifies if a part is original or not.")	
	private Boolean originalPart = false;
	
	@Attributes(maxLength = 100, required = true, description = "Preferred Supplier for the part. Select the first supplier for the part according to the DMS settings.")	
	private String preferredSupplierName = "TBD";
	@Attributes(maxLength = 30, required = false, description = "Optional: placeholder for Bin Location MAIN_BIN_LOCATION (inventory data DMS interface)")	
	private String segmentationCode01 = "FLT";
	@Attributes(maxLength = 30, required = false, description = "Optional: placeholder for dealer specific segmentation criteria")	
	private String segmentationCode02 = "";
	@Attributes(maxLength = 30, required = false, description = "Optional: placeholder for dealer specific segmentation criteria")	
	private String segmentationCode03 = "";
	@Attributes(maxLength = 30, required = false, description = "Optional: placeholder for dealer specific segmentation criteria")	
	private String segmentationCode04 = "";
	
	
	
	public String getExtractionDateTime() {
		return extractionDateTime;
	}
	public void setExtractionDateTime(String extractionDateTime) {
		this.extractionDateTime = extractionDateTime;
	}
	public String getDealerNumber() {
		return dealerNumber;
	}
	public void setDealerNumber(String dealerNumber) {
		this.dealerNumber = dealerNumber;
	}
	public String getAgcoPartNumber() {
		return agcoPartNumber;
	}
	public void setAgcoPartNumber(String agcoPartNumber) {
		this.agcoPartNumber = agcoPartNumber;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAverageCost() {
		return averageCost;
	}
	public void setAverageCost(BigDecimal averageCost) {
		this.averageCost = averageCost;
	}
	public BigDecimal getLastPurchasePrice() {
		return lastPurchasePrice;
	}
	public void setLastPurchasePrice(BigDecimal lastPurchasePrice) {
		this.lastPurchasePrice = lastPurchasePrice;
	}
	public BigDecimal getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}
	public String getInventoryDateTime() {
		return inventoryDateTime;
	}
	public void setInventoryDateTime(String inventoryDateTime) {
		this.inventoryDateTime = inventoryDateTime;
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
	public BigDecimal getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(BigDecimal availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public BigDecimal getReservedQuantityPartTickets() {
		return reservedQuantityPartTickets;
	}
	public void setReservedQuantityPartTickets(BigDecimal reservedQuantityPartTickets) {
		this.reservedQuantityPartTickets = reservedQuantityPartTickets;
	}
	public Boolean getOriginalPart() {
		return originalPart;
	}
	public void setOriginalPart(Boolean originalPart) {
		this.originalPart = originalPart;
	}
	public String getPreferredSupplierName() {
		return preferredSupplierName;
	}
	public void setPreferredSupplierName(String preferredSupplierName) {
		this.preferredSupplierName = preferredSupplierName;
	}
	public String getSegmentationCode01() {
		return segmentationCode01;
	}
	public void setSegmentationCode01(String segmentationCode01) {
		this.segmentationCode01 = segmentationCode01;
	}
	public String getSegmentationCode02() {
		return segmentationCode02;
	}
	public void setSegmentationCode02(String segmentationCode02) {
		this.segmentationCode02 = segmentationCode02;
	}
	public String getSegmentationCode03() {
		return segmentationCode03;
	}
	public void setSegmentationCode03(String segmentationCode03) {
		this.segmentationCode03 = segmentationCode03;
	}
	public String getSegmentationCode04() {
		return segmentationCode04;
	}
	public void setSegmentationCode04(String segmentationCode04) {
		this.segmentationCode04 = segmentationCode04;
	}

	
	
	
	
}
