package com.agco.json.generate.integration;

import com.agco.json.generate.entity.MetaData;
import com.agco.json.generate.entity.OrderRecommendation;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW13 - Order recommendation Interface", description = "Receive the order recommendation from Barkawi into the VMI system")
public class BKW13OrderRecommendation {

	@Attributes(required = true)
	private OrderRecommendation data;

	private MetaData meta;

	public OrderRecommendation getData() {
		return data;
	}

	public void setData(OrderRecommendation data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}

	@Override
	public String toString() {
		return "ClassPojo [data = " + data + ", meta = " + meta + "]";
	}

}
