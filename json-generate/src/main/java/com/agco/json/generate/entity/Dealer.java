package com.agco.json.generate.entity;

import java.util.ArrayList;
import java.util.List;

import com.github.reinert.jjschema.Attributes;

public class Dealer {

	@Attributes(minimum = 0, exclusiveMinimum = true, required = true, description = "Dealer’s main location account number. The number sent will be the AGCO code")
	private Integer dealerCode;

	@Attributes(required = true)
	private List<Parts> parts;

	@Attributes(minLength = 1, maxLength = 100, required = true, description = "Recomendation unique ID number")
	private String plannerOrderId;

	public Dealer() {
		this.setDealerCode(11571);

		List<Parts> list = new ArrayList<Parts>();
		list.add(new Parts());
		this.setParts(list);
		
		this.setPlannerOrderId(plannerOrderId);
	}

	public Integer getDealerCode() {
		return dealerCode;
	}

	public void setDealerCode(Integer dealerCode) {
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
