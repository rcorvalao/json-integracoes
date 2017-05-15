package com.agco.json.generate.entity;

import java.util.ArrayList;
import java.util.List;

import com.github.reinert.jjschema.Attributes;

public class OrderRecommendation {
	
	@Attributes(required = true)
	private List<Dealer> dealer;

	
	public OrderRecommendation() {
		
		List<Dealer> list = new ArrayList<Dealer>();
		list.add(new Dealer());
		this.setDealer(list);
	}

	public List<Dealer> getDealer() {
		return dealer;
	}

	public void setDealer(List<Dealer> dealer) {
		this.dealer = dealer;
	}
}
