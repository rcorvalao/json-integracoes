package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class PriceList {

	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime = "2016-11-23T10:45:00+03:00";

	@Attributes(minLength = 1, maxLength = 20, required = true, description = "Price List Country")
	private String priceListCode = "BRA_BRL";

	@Attributes(minLength = 1, maxLength = 50, required = true, description = "Item ID")
	private String partNumber = "CH1J4757";

	@Attributes(minLength = 1, maxLength = 30, required = true, description = "Price list discount group")
	private String discountGroup = "DISCOUNT_GROUP";

	@Attributes(minimum = 0, exclusiveMinimum = true, multipleOf = 1, required = true, description = "Price for item_id - populates Unit_cost in skus - relevant for segmentation only!")
	private BigDecimal stockOrderPrice = new BigDecimal(8.5);

	public String getExtractionDateTime() {
		return extractionDateTime;
	}

	public void setExtractionDateTime(String extractionDateTime) {
		this.extractionDateTime = extractionDateTime;
	}

	public String getPriceListCode() {
		return priceListCode;
	}

	public void setPriceListCode(String priceListCode) {
		this.priceListCode = priceListCode;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getDiscountGroup() {
		return discountGroup;
	}

	public void setDiscountGroup(String discountGroup) {
		this.discountGroup = discountGroup;
	}

	public BigDecimal getStockOrderPrice() {
		return stockOrderPrice;
	}

	public void setStockOrderPrice(BigDecimal stockOrderPrice) {
		this.stockOrderPrice = stockOrderPrice;
	}

}
