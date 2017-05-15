package com.agco.json.generate.entity;

import java.math.BigDecimal;

import com.github.reinert.jjschema.Attributes;

public class Parts {

	@Attributes(minimum = 0, exclusiveMinimum = true, multipleOf = 1, required = false, description = "The quantity suggested by the planner")
	private BigDecimal plannerQuantity;

	@Attributes(minimum = 0, exclusiveMinimum = true, multipleOf = 1, required = false, description = "The quantity suggested by Barkawi")
	private BigDecimal initialQuantity;

	@Attributes(minimum = 0, exclusiveMinimum = true, multipleOf = 1, required = true, description = "The requested quantity for the part. If is set to 0 it means that the dealer didn't buy")
	private BigDecimal requestedQuantity;

	@Attributes(minLength = 1, maxLength = 50, required = true, description = "Part Number")
	private String partNumber;

	public Parts() {
		this.setInitialQuantity(new BigDecimal(10));
		this.setPartNumber("CH1J4757");
		this.setPlannerQuantity(new BigDecimal(12.5));
		this.setRequestedQuantity(new BigDecimal(4));
	}

	public BigDecimal getPlannerQuantity() {
		return plannerQuantity;
	}

	public void setPlannerQuantity(BigDecimal plannerQuantity) {
		this.plannerQuantity = plannerQuantity;
	}

	public BigDecimal getInitialQuantity() {
		return initialQuantity;
	}

	public void setInitialQuantity(BigDecimal initialQuantity) {
		this.initialQuantity = initialQuantity;
	}

	public BigDecimal getRequestedQuantity() {
		return requestedQuantity;
	}

	public void setRequestedQuantity(BigDecimal requestedQuantity) {
		this.requestedQuantity = requestedQuantity;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
}
