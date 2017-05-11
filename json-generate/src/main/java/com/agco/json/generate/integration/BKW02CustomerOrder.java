package com.agco.json.generate.integration;

import com.agco.json.generate.entity.CustomerOrder;
import com.agco.json.generate.entity.MetaData;
import com.github.reinert.jjschema.Attributes;

@Attributes(title = "BKW02 - CustomerOrder", description = "Send sales orders received from dealers into VMI system to Barkawi")
public class BKW02CustomerOrder {
	
	@Attributes(required = true)
	private CustomerOrder data;
	
	private MetaData meta;

	public CustomerOrder getData() {
		return data;
	}

	public void setData(CustomerOrder data) {
		this.data = data;
	}

	public MetaData getMeta() {
		return meta;
	}

	public void setMeta(MetaData meta) {
		this.meta = meta;
	}
	
	

}
