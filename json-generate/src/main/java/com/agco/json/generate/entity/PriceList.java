package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class PriceList {

	@Attributes(format = "date-time", required = true, description = "Local AGCO date when the extract was run.")
	private String extractionDateTime;

	@Attributes(minLength = 1, maxLength = 20, required = true, description = "Price List Country")
	private String priceListCode;

	@Attributes(minLength = 1, maxLength = 50, required = true, description = "Item ID")
	private String partNumber;

	@Attributes(minLength = 1, maxLength = 30, required = true, description = "Price list discount group")
	private String discountGroup;

	@Attributes(minimum = 0, exclusiveMinimum = true, multipleOf = 1, required = true, description = "Price for item_id - populates Unit_cost in skus - relevant for segmentation only!")
	private BigDecimal stockOrderPrice;

	public String getExtractionDateTime() {
		return extractionDateTime;
	}

	public String getPriceListCode() {
		return priceListCode;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getDiscountGroup() {
		return discountGroup;
	}

	public BigDecimal getStockOrderPrice() {
		return stockOrderPrice;
	}

}
