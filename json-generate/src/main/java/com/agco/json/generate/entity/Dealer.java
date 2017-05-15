package com.agco.json.generate.entity;

import java.math.BigDecimal;
import java.util.List;

import com.github.reinert.jjschema.Attributes;

public class Dealer {

	@Attributes(minimum = 0, exclusiveMinimum = true, multipleOf = 1, required = true, description = "Dealer’s main location account number. The number sent will be the AGCO code")
	private BigDecimal dealerCode;

	@Attributes(required = true)
	private List<Parts> parts;

	@Attributes(minLength = 1, maxLength = 100, required = true, description = "Recomendation unique ID number")
	private String plannerOrderId;

	public BigDecimal getDealerCode() {
		return dealerCode;
	}

	public void setDealerCode(BigDecimal dealerCode) {
		this.dealerCode = dealerCode;
	}

	public List<Parts> getParts() {
		return parts;
	}

	public void setParts(List<Parts> parts) {
		this.parts = parts;
	}

	public String getPlannerOrderId() {
		return plannerOrderId;
	}

	public void setPlannerOrderId(String plannerOrderId) {
		this.plannerOrderId = plannerOrderId;
	}
}
